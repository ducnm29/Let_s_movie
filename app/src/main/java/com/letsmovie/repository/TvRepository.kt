package com.letsmovie.repository

import com.letsmovie.data.api.movie.DataListResponse
import com.letsmovie.model.Result
import com.letsmovie.model.Tv
import kotlinx.coroutines.flow.Flow

interface TvRepository {
    fun getTrendingTv(language: String, apiKey: String): Flow<Result<DataListResponse<Tv>>>
    fun getPopularTv(language: String, apiKey: String): Flow<Result<DataListResponse<Tv>>>
    fun getTvDetail(tvId: String, language: String, apiKey: String): Flow<Result<Tv>>
}