package com.reanstudio.kotlin.scheduletrain.di.component

import com.reanstudio.kotlin.scheduletrain.di.module.NetworkModule
import com.reanstudio.kotlin.scheduletrain.di.module.ScheduleTrainModule
import com.reanstudio.kotlin.scheduletrain.search.SearchActivity
import dagger.Component
import javax.inject.Singleton

/**
 * Created by yahyamukhlis on 1/25/17.
 */
@Singleton
@Component(modules = arrayOf(
        ScheduleTrainModule::class,
        NetworkModule::class
))
interface ScheduleTrainComponent {

    fun inject(searchActivity: SearchActivity)
}
