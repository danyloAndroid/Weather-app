package com.example.weatherapp

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.example.weatherapp.base.BaseEdgeToEdgeActivity
import com.example.weatherapp.databinding.ActivityMainBinding

class MainActivity : BaseEdgeToEdgeActivity() {

    private val viewModel: WeatherViewModel by viewModels()

    private lateinit var binding: ActivityMainBinding

    override val layoutId: Int
        get() = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        viewModel.weatherInformation.observe(this) { weatherInfo ->
            binding.wind.text = getString(R.string.wind_km_h, weatherInfo.wind.value)
            binding.pressure.text = getString(R.string.pressure, weatherInfo.currentDetails.pressure)
            binding.humidity.text = getString(R.string.humidity, weatherInfo.currentDetails.humidity)
            binding.visibility.text = getString(R.string.visibility, weatherInfo.currentDetails.visibility)
            binding.minmax.text = getString(R.string.max_min_temperature,weatherInfo.mainInformation.maxTemperature,weatherInfo.mainInformation.minTemperature)
            binding.temperature.text = getString(R.string.temperature,weatherInfo.mainInformation.temperature)
            binding.description.text = weatherInfo.mainInformation.description
            binding.iconText.text = weatherInfo.mainInformation.iconDescription

        }
    }
}