package com.weatherapi.weatherservice.service;


import com.weatherapi.weatherservice.entity.Weather;
import com.weatherapi.weatherservice.repository.WeatherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WeatherServiceImpl implements WeatherService {


    @Autowired
    private WeatherRepo weatherRepo;

    @Override
    public Weather saveWeather(Weather weather) {
        return weatherRepo.save(weather);
    }




    @Override
    public Weather updateWeatherByCityName(String cityname, Weather weather) {


            Weather weather1 = weatherRepo.findByCityName(cityname);
          //  weather1.setCityName(weather.getCityName());
            weather1.setTemperature(weather.getTemperature());

        return weatherRepo.save(weather1);
    }





    @Override
    public String deleteWeatherDetailsById(Long Id) {
          weatherRepo.deleteById(Id);
          return "deleted successfully";

    }

    @Override
    public String getByCityName(String cityname) {
        return String.valueOf(weatherRepo.findByCityName(cityname));
    }

    @Override
    public List<String> getByTemperature(Double temperature) {


        return weatherRepo.getCitiesByTemp(temperature);
    }


}
