package com.reanstudio.kotlin.scheduletrain.search

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.reanstudio.kotlin.scheduletrain.MyApplication
import com.reanstudio.kotlin.scheduletrain.R
import com.reanstudio.kotlin.scheduletrain.di.ScheduleTrainManager
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import rx.subscriptions.CompositeSubscription
import timber.log.Timber
import javax.inject.Inject

class SearchActivity : AppCompatActivity() {

    @Inject lateinit var scheduleTrainManager: ScheduleTrainManager

    var compositeSubscription = CompositeSubscription()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
        MyApplication.scheduleTrainComponent.inject(this)
    }

    override fun onResume() {
        super.onResume()
        request()
    }

    private fun request() {
        val subscription = scheduleTrainManager.getTicketParameters()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    retreived -> Timber.d(retreived.status)
                }, {
                    error -> Timber.e(error.message)
                })

        compositeSubscription.add(subscription)
    }

    override fun onDestroy() {
        if (!compositeSubscription.isUnsubscribed) {
            compositeSubscription.unsubscribe()
        }
        compositeSubscription.clear()
        super.onDestroy()
    }
}
