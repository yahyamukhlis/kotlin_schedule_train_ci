package com.reanstudio.kotlin.scheduletrain

import android.content.Context
import android.support.multidex.MultiDex
import android.support.multidex.MultiDexApplication
import com.facebook.stetho.Stetho
import com.reanstudio.kotlin.scheduletrain.di.component.DaggerScheduleTrainComponent
import com.reanstudio.kotlin.scheduletrain.di.component.ScheduleTrainComponent
import com.reanstudio.kotlin.scheduletrain.di.module.ScheduleTrainModule
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

        initializeStetho()

        initializeTimber()

        initializeDagger()
    }

    private fun initializeTimber() {
        Timber.plant(object : Timber.DebugTree() {
            override fun createStackElementTag(element: StackTraceElement?): String {
                return super.createStackElementTag(element) + ":" + element?.lineNumber
            }
        })
    }

    private fun initializeStetho() {
        Stetho.initializeWithDefaults(this)
    }

    private fun initializeDagger() {
        scheduleTrainComponent = DaggerScheduleTrainComponent.builder()
                .scheduleTrainModule(ScheduleTrainModule())
                .build()
    }
}
