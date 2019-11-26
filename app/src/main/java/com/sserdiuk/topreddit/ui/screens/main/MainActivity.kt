package com.sserdiuk.topreddit.ui.screens.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sserdiuk.topreddit.R
import com.sserdiuk.topreddit.data.local.entity.PostEntity
import com.sserdiuk.topreddit.ui.screens.details.DetailsActivity
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

class MainActivity : AppCompatActivity(), HasSupportFragmentInjector, MainCallbacks, MainRouter, PostItemAdapter.ListItemClickListener {
    override fun onItemClick(position: Int) {
        presenter.onItemClicked(position)
    }

    private lateinit var viewAdapter: PostItemAdapter
    private lateinit var viewManager: RecyclerView.LayoutManager
    private lateinit var recyclerView: RecyclerView

    override fun showError() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showResult() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setItems(results: List<PostEntity>) {
        viewAdapter.setItems(results)
        recyclerView.visibility = View.VISIBLE
    }

    override fun openPost(postEntity: PostEntity) {
        val intent = Intent(this, DetailsActivity::class.java)
        intent.putExtra(DetailsActivity.ENTITY, postEntity)
        startActivity(intent)
    }

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>

    @Inject
    lateinit var presenter: MainPresenter

    override fun supportFragmentInjector(): DispatchingAndroidInjector<Fragment> {
        return dispatchingAndroidInjector
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewManager = LinearLayoutManager(this)
        viewAdapter = PostItemAdapter(this)
        recyclerView = findViewById<RecyclerView>(R.id.itemList).apply {
            layoutManager = viewManager
            adapter = viewAdapter

            presenter.run {
                takeView(this@MainActivity)
                takeRouter(this@MainActivity)
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.run {
            dropView()
            dropRouter()
        }
    }
}
