package com.reanstudio.kotlin.scheduletrain.data.repository.remote

import com.reanstudio.kotlin.scheduletrain.data.repository.entity.TicketParameterResponse
import retrofit2.http.GET
import retrofit2.http.Query
import rx.Observable

/**
 * Created by yahyamukhlis on 1/25/17.
 */
interface IbacorApi {

    @GET("kereta-api")
    fun getTicketParameters(@Query("k") key: String): Observable<TicketParameterResponse>

}