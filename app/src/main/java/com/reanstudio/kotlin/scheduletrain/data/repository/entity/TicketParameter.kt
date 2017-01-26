package com.reanstudio.kotlin.scheduletrain.data.repository.entity

import com.squareup.moshi.Json

/**
 * Created by yahyamukhlis on 1/25/17.
 */
class TicketParameter(

        @Json(name = "tanggal")
        val dates: List<Date>,

        @Json(name = "stasiun")
        val cities: List<City>
)