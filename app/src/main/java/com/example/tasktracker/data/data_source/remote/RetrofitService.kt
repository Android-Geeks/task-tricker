package com.example.tasktracker.data.data_source.remote

import com.example.tasktracker.data.data_source.remote.response.AppDataResponse
import retrofit2.http.GET


interface RetrofitService {
    @GET("getData")
    suspend fun getData(): AppDataResponse
}