package com.sserdiuk.topreddit.ui.screens.details

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import com.sserdiuk.topreddit.R
import com.sserdiuk.topreddit.data.local.entity.PostEntity
import javax.inject.Inject

class DetailsActivity : AppCompatActivity(), DetailsCallbacks, DetailsRouter {
    companion object {
        const val ENTITY = "ENTITY"
    }

    override fun onReceiveData(entity: PostEntity) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showData(entity: PostEntity) {
        val tvTitle: TextView = findViewById(R.id.title)
        val tvCreated: TextView = findViewById(R.id.created)
        val imgThumbnail: ImageView = findViewById(R.id.thumbnail)
        val numComm: TextView = findViewById(R.id.numComments)

        tvTitle.text = entity.title
        tvCreated.text = entity.created.toString()
        numComm.text = entity.commentsCount.toString()
        Picasso
            .get()
            .load(entity.thumbnail)
            .error(R.drawable.ic_launcher_foreground)
            .into(imgThumbnail)
    }

    @Inject
    lateinit var presenter: DetailsPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        presenter.run {
            takeView(this@DetailsActivity)
            takeRouter(this@DetailsActivity)
            if (intent.hasExtra(ENTITY)) onTakeData(intent?.extras?.get(ENTITY) as PostEntity)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.run {
            dropRouter()
            dropView()
        }
    }
}
