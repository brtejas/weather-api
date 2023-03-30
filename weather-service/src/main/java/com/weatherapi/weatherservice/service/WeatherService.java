package com.weatherapi.weatherservice.service;

import com.weatherapi.weatherservice.entity.Weather;

import java.util.List;

public interface WeatherService {
    Weather saveWeather(Weather weather);

  

    Weather updateWeatherByCityName(String city_name, Weather weather);



    String deleteWeatherDetailsById(Long Id);

    String getByCityName(String cityname);
    List<String> getByTemperature(Double temperature);
}
