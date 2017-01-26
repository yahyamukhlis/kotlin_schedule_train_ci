package com.reanstudio.kotlin.scheduletrain.data.repository

import com.reanstudio.kotlin.scheduletrain.data.repository.entity.TicketParameterResponse
import rx.Observable

/**
 * Created by yahyamukhlis on 1/25/17.
 */
interface ScheduleTrainApi {

    fun getTicketParameters(): Observable<TicketParameterResponse>
}