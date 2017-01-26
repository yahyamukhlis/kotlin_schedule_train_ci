package com.reanstudio.kotlin.scheduletrain.data.repository.entity

import com.squareup.moshi.Json

/**
 * Created by yahyamukhlis on 1/25/17.
 */
class City (

        @Json(name = "kota")
        val cityName: String,

        @Json(name = "list")
        val stations: List<Station>
)