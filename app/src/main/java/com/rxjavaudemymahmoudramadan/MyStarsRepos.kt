package com.rxjavaudemymahmoudramadan


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rxjavaudemymahmoudramadan.adapter.GithubRepoAdapter
import com.rxjavaudemymahmoudramadan.viewmodel.RepoViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_my_stars_repos.*
import org.slf4j.Logger
import org.slf4j.LoggerFactory


class MyStarsRepos : AppCompatActivity() {

    val logger: Logger = LoggerFactory.getLogger(MainActivity::class.java)
    private lateinit var repoViewModel: RepoViewModel


    lateinit var githubRepoAdapter : GithubRepoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_stars_repos)


        my_stars_list.isNestedScrollingEnabled = false
        val mLayoutManager: RecyclerView.LayoutManager = LinearLayoutManager(applicationContext)
        my_stars_list.layoutManager = mLayoutManager
        my_stars_list.itemAnimator = DefaultItemAnimator()
        my_stars_list.addItemDecoration(DividerItemDecoration(this, LinearLayoutManager.VERTICAL))

        githubRepoAdapter = GithubRepoAdapter(applicationContext)
        my_stars_list.adapter = githubRepoAdapter


        repoViewModel =  ViewModelProviders.of(this).get(RepoViewModel::class.java)


        getStarsRepo(repoViewModel)

        observeData(repoViewModel)
    }

    fun observeData( repoViewModel: RepoViewModel) {
        repoViewModel.getLiveData().observe(this, Observer {
            repos-> githubRepoAdapter.addData(repos = repos!!)
        })
    }


     fun getStarsRepo( repoViewModel: RepoViewModel){
         repoViewModel.getMyStarsRepos("MayurSolanki")
     }


}
