package com.reanstudio.kotlin.scheduletrain.di

import com.reanstudio.kotlin.scheduletrain.data.repository.ScheduleTrainApi
import com.reanstudio.kotlin.scheduletrain.data.repository.entity.TicketParameterResponse
import rx.Observable
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by yahyamukhlis on 1/25/17.
 */
@Singleton
class ScheduleTrainManager @Inject constructor(private val scheduleTrainApi: ScheduleTrainApi) {

    fun getTicketParameters(): Observable<TicketParameterResponse> {
        return scheduleTrainApi.getTicketParameters()
    }
}
