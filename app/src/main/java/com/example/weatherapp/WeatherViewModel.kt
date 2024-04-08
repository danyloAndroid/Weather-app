package com.example.weatherapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.weatherapp.entity.CurrentDetails
import com.example.weatherapp.entity.MainInformation
import com.example.weatherapp.entity.SunriseAndSunset
import com.example.weatherapp.entity.WeatherInformation
import com.example.weatherapp.entity.Wind
import java.sql.Time
import java.util.Date
import kotlin.time.TimedValue

class WeatherViewModel : ViewModel() {

    val weatherInformation: MutableLiveData<WeatherInformation> = MutableLiveData()

    init {
        fetchData()
    }
    fun fetchData() {
        weatherInformation.value = WeatherInformation(
            wind = Wind(value = 30),
            currentDetails = CurrentDetails(
                pressure = 67,
                humidity = 34,
                visibility = 12,
            ),
            sunriseAndSunset = SunriseAndSunset(
                sunrise = Date(),
                sunset =  Date(),
                lengthOfDay = 11,
                remainingDayLight = 44,
            ),
            mainInformation = MainInformation(
                date = Date(),
                temperature = 17,
                maxTemperature = 23,
                minTemperature = 11,
                description = "drizzle",
                iconDescription = "drizzle",
                icon = R.drawable.ic_weather,
            )

        )
    }


}