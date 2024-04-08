package com.example.weatherapp.entity

import androidx.annotation.DrawableRes
import java.util.Date

data class WeatherInformation(
    val mainInformation: MainInformation,
    val wind: Wind,
    val sunriseAndSunset: SunriseAndSunset,
    val currentDetails: CurrentDetails,
)

data class MainInformation(
    val date: Date,
    val temperature: Int,
    val maxTemperature: Int,
    val minTemperature: Int,
    val description: String,
    val iconDescription: String,
    @DrawableRes val icon: Int,
)

data class Wind(
    val value: Int,
)

data class SunriseAndSunset(
    val sunrise: Date,
    val sunset: Date,
    val lengthOfDay: Int,
    val remainingDayLight: Int,
)

data class CurrentDetails(
    val pressure: Int,
    val humidity: Int,
    val visibility: Int,
)
