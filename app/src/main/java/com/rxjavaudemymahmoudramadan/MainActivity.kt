package com.rxjavaudemymahmoudramadan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rxjavaudemymahmoudramadan.di.ApiService
import com.rxjavaudemymahmoudramadan.di.HttpService
import com.rxjavaudemymahmoudramadan.di.LocalStore
import com.rxjavaudemymahmoudramadan.di.LoginManager
import com.rxjavaudemymahmoudramadan.di.component.DaggerLoginComponent
import com.rxjavaudemymahmoudramadan.viewmodel.RepoViewModel
import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import io.reactivex.functions.Predicate
import io.reactivex.subjects.AsyncSubject
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.util.concurrent.Callable
import java.util.concurrent.TimeUnit
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    // concat maintain sequence while Merge don't


    val logger: Logger = LoggerFactory.getLogger(MainActivity::class.java)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        createFromArray().subscribe{array->
//                 logger.info(" array {}",array)
//        }

        getFlatmap().subscribe(object : Observer<String> {

            override fun onSubscribe(d: Disposable) {
                TODO("Not yet implemented")
            }

            override fun onNext(t: String) {
                TODO("Not yet implemented")
            }

            override fun onError(e: Throwable) {
                TODO("Not yet implemented")
            }

            override fun onComplete() {
                TODO("Not yet implemented")
            }




        })


//    ================ ================ ================ ================ ================ ================ ================
//    val professor =  PublishSubject.create<String>()        // when observer subscribe for data, from that moment only starts receiving data

//        val professor =  ReplaySubject.create<String>()     // regardless time of subscription, observer get all data

//        val professor =  BehaviorSubject.create<String>()   // observer get most recent data while on Subscribe, C By last student

        val professor =  AsyncSubject.create<String>()  // The Last item emitted by subject, F by first and last

        professor.subscribe(getFirstStudent())

        professor.onNext("A")
        professor.onNext("B")
        professor.onNext("C")

        professor.subscribe(getLateStudent())

        professor.onNext("D")
        professor.onNext("E")
        professor.onNext("F")

        professor.onComplete()

//        val localStore : LocalStore = LocalStore()
//        val apiService : ApiService = ApiService()
//        val loginManager = LoginManager(localStore,apiService)
//        loginManager.login("mayur","123")

      val loginComponent=  DaggerLoginComponent.builder()


    }

    private fun getFirstStudent():Observer<String>{

        return object : Observer<String> {
            override fun onSubscribe(d: Disposable) {
                TODO("Not yet implemented")
            }

            override fun onNext(t: String) {
                TODO("Not yet implemented")
            }

            override fun onError(e: Throwable) {
                TODO("Not yet implemented")
            }

            override fun onComplete() {
                TODO("Not yet implemented")
            }


        }
    }

    private fun getLateStudent():Observer<String>{
        return object : Observer<String> {
            override fun onSubscribe(d: Disposable) {
                TODO("Not yet implemented")
            }

            override fun onNext(t: String) {
                TODO("Not yet implemented")
            }

            override fun onError(e: Throwable) {
                TODO("Not yet implemented")
            }

            override fun onComplete() {
                TODO("Not yet implemented")
            }


        }
    }

    private fun showJustOperator() {

        val dataStream: Observable<Int> = Observable.just(1, 2, 3, 4, 5)

        val observerr = object : Observer<Int> {
            override fun onSubscribe(d: Disposable) {
                TODO("Not yet implemented")
            }
            override fun onError(e: Throwable) {
                TODO("Not yet implemented")
            }

            override fun onComplete() {
                TODO("Not yet implemented")
            }

            override fun onNext(t: Int) {
                TODO("Not yet implemented")
            }


        }

        dataStream.subscribe(observerr)
    }

    private fun createFromArray(): Observable<Array<Int>> {
        return Observable.fromArray(arrayOf(1, 2, 3, 4, 5))
    }

   private fun createFromIterable(): Observable<Int>{
       return Observable.fromIterable(mutableListOf(1,2,3,4,5))

   }

    private fun createFromInterval(): Observable<Long>{
        return Observable.interval(1,TimeUnit.SECONDS).takeWhile(Predicate {
            it < 10
        })

    }

    private fun timer() : Observable<Long>{
      return  Observable.timer(2, TimeUnit.SECONDS)
    }

    private fun createTimeout(name : String) : Observable<String>{

      val ab =  object : Callable<String> {
          override fun call(): String {
              return name
          }

      }

      return Observable.fromCallable(ab)
    }

    private fun getFlatmap(): Observable<String>{

        return Observable.fromIterable(mutableListOf("one","two","three")).flatMap {
              it ->  getDetail(it)
          }

    }

    private fun getDetail(name : String): Observable<String>{

        val strArray = arrayOf<String>("Praveen","Sathya","Yogesh")


        val  random : Int = Random.nextInt(3)

        return  Observable.just(strArray[random])

    }


}





