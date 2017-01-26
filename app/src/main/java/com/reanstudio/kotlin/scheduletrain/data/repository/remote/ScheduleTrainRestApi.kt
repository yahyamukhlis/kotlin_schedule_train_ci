package com.reanstudio.kotlin.scheduletrain.data.repository.remote

import com.reanstudio.kotlin.scheduletrain.data.repository.ScheduleTrainApi
import com.reanstudio.kotlin.scheduletrain.data.repository.entity.TicketParameterResponse
import rx.Observable
import javax.inject.Inject

/**
 * Created by yahyamukhlis on 1/25/17.
 */
class ScheduleTrainRestApi @Inject constructor(private val ibacorApi: IbacorApi): ScheduleTrainApi {

    var key: String = "1600f6501d005ee183b1723a2d606a43"

    override fun getTicketParameters(): Observable<TicketParameterResponse> {
        return ibacorApi.getTicketParameters(key)
    }
}