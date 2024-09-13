package com.example.androidappdev.dashboard.api

import com.example.androidappdev.dashboard.data.DashboardResponse
import retrofit2.http.GET

interface DashboardApiService {
    @GET("/dashboard/investments")
    suspend fun getDashboardData():List<DashboardResponse>
}

