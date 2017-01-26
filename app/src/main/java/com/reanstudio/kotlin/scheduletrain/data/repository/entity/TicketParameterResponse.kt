package com.reanstudio.kotlin.scheduletrain.data.repository.entity

import com.squareup.moshi.Json

/**
 * Created by yahyamukhlis on 1/25/17.
 */
class TicketParameterResponse(

        val status: String,

        val view: String,

        @Json(name = "data")
        val ticketParameter: TicketParameter
)