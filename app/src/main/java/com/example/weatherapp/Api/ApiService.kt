package com.example.weatherapp.Api

import com.example.weatherapp.model.Weather
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("weather/London")
    suspend fun getWeather() : Response<Weather>

}