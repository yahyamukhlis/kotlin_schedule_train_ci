package com.reanstudio.kotlin.scheduletrain

import android.content.Context
import android.support.multidex.MultiDex
import android.support.multidex.MultiDexApplication
import timber.log.Timber

/**
 * Created by yahyamukhlis on 1/17/17.
 */
class MyApplication : MultiDexApplication() {

    companion object {
        lateinit var scheduleTrainComponent: ScheduleTrainComponent
    }

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

    override fun onCreate() {
        super.onCreate()

        initializeTimber()

        initializeDagger()
    }

    private fun initializeTimber() {
        Timber.plant(CrashReportingTree())
    }

    private fun initializeDagger() {
        scheduleTrainComponent = DaggerScheduleTrainComponent.builder()
                .scheduleTrainModule(ScheduleTrainModule())
                .build()
    }
}
