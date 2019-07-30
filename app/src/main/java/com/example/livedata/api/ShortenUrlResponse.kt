package com.example.livedata.api

import com.example.livedata.model.ShortenUrl

data class ShortenUrlResponse(val message: String,
                              val result: ShortenUrl,
                              val code: String)