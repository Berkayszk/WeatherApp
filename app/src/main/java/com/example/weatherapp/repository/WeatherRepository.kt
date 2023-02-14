package com.example.weatherapp.repository

import com.example.weatherapp.Api.ApiService
import javax.inject.Inject


class WeatherRepository
@Inject constructor(private val apiService: ApiService)
{
    suspend fun getWeather()= apiService.getWeather()
}