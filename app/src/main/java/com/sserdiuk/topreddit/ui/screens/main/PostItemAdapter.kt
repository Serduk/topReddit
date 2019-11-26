package com.sserdiuk.topreddit.ui.screens.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.sserdiuk.topreddit.R
import com.sserdiuk.topreddit.data.local.entity.PostEntity

class PostItemAdapter(val clickListener: ListItemClickListener) :
    RecyclerView.Adapter<PostItemAdapter.ViewHolder>() {
    interface ListItemClickListener {
        fun onItemClick(position: Int)
    }
    private var result: List<PostEntity> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view: View = layoutInflater.inflate(R.layout.view_item_in_search, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return if (result.isNullOrEmpty()) 0
        else result.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(position)
    }

    fun setItems(newResult: List<PostEntity>) {
        result = newResult
        notifyDataSetChanged()
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener {
        override fun onClick(v: View?) {
            clickListener.onItemClick(adapterPosition)
        }

        init {
            itemView.setOnClickListener(this)
        }

        private var image: ImageView = itemView.findViewById(R.id.image)
        private var title: TextView = itemView.findViewById(R.id.tvTitle)
        private var author: TextView = itemView.findViewById(R.id.tvAuthor)

        fun bind(position: Int) {
            val item: PostEntity = result[position]
            title.text = item.title
            author.text = item.author
            Picasso
                .get()
                .load(item.thumbnail)
                .error(R.drawable.ic_launcher_foreground)
                .placeholder(R.drawable.ic_launcher_foreground)
                .into(image)
        }
    }
}