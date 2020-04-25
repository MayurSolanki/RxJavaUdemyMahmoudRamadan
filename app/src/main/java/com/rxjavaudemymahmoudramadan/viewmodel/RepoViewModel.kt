package com.rxjavaudemymahmoudramadan.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rxjavaudemymahmoudramadan.GithubApiClient
import com.rxjavaudemymahmoudramadan.db.Repo
import com.rxjavaudemymahmoudramadan.repository.RepoLocalSource
import com.rxjavaudemymahmoudramadan.repository.RepoRemoteSource
import com.rxjavaudemymahmoudramadan.repository.RepoRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

/**
 * Created by Mayur Solanki (mayursolanki120@gmail.com) on 25/04/20, 5:26 PM.
 */
class RepoViewModel : ViewModel() {

    var compositDisposable = CompositeDisposable()
    var liveData : MutableLiveData<List<Repo>> = MutableLiveData<List<Repo>>()
    val repository  = RepoRepository(RepoRemoteSource, RepoLocalSource)


    fun getMyStarsRepos(username : String){
       var repoDisposable =   repository.fetchRepos(username)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe{
                liveData.value = it
            }

        compositDisposable.add(repoDisposable)
    }

    fun getLiveData(): LiveData<List<Repo>> = liveData

    override fun onCleared() {
        super.onCleared()

        compositDisposable.clear()
    }
}