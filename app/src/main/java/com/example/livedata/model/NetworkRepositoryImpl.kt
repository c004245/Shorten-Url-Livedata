package com.example.livedata.model

import com.example.livedata.api.Api
import io.reactivex.Single

class NetworkRepositoryImpl(private val api: Api): Repository {
    override fun getShortenUrl(url: String): Single<ShortenUrl> {
        return api.shorturl(url)
            .map { shortenUrlResponse ->
                shortenUrlResponse.result
            }
    }
}