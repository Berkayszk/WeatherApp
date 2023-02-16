package com.example.weatherapp

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.weatherapp.databinding.ActivityMainBinding
import com.example.weatherapp.viewmodel.WeatherViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel:WeatherViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.weatherResp.observe(this,{weather->
            binding.apply {

                tvTemperature.text = weather.temperature
                tvDescription.text = weather.description
                tvWind.text = weather.wind
                tvCity.text = "London"

                val forecast1 = weather.forecast[0]
                val forecast2 = weather.forecast[1]
                val forecast3 = weather.forecast[2]
                val forecast4 = weather.forecast[3]
                val forecast5 = weather.forecast[4]
                val forecast6 = weather.forecast[5]
                val forecast7 = weather.forecast[6]

                tvForecast1.text = "${forecast1.temperature}/ ${forecast1.wind}"
                tvForecast2.text = "${forecast2.temperature}/ ${forecast2.wind}"
                tvForecast3.text = "${forecast3.temperature}/ ${forecast3.wind}"
                tvForecast4.text = "${forecast4.temperature}/ ${forecast4.wind}"
                tvForecast5.text = "${forecast5.temperature}/ ${forecast5.wind}"
                tvForecast6.text = "${forecast6.temperature}/ ${forecast6.wind}"
                tvForecast7.text = "${forecast7.temperature}/ ${forecast7.wind}"


            }

        })
    }
}

