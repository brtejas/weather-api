package com.weatherapi.weatherservice.controllers;


import com.weatherapi.weatherservice.entity.Weather;
import com.weatherapi.weatherservice.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/weather-api")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @PostMapping("/")
    public Weather saveWeather(@RequestBody @Valid Weather weather){
        return weatherService.saveWeather(weather);
    }



   @GetMapping("/weathers/{cityname}")
   public String getByCityName(@PathVariable("cityname") String cityname){
        return weatherService.getByCityName(cityname);
   }

   @GetMapping("/weather/{temperature}")
   public List<String> getByTemperature(@PathVariable("temperature") Double temperature){
         return weatherService.getByTemperature(temperature);
   }

    @PutMapping("/update/{cityname}")
    public Weather updateWeatherByCityName(@PathVariable("cityname") String City_name,Weather weather){
        return weatherService.updateWeatherByCityName(City_name,weather);
    }
    @DeleteMapping("/delete/{Id}")
    public String deleteWeatherDetailsById(@PathVariable("Id") Long Id){
        return weatherService.deleteWeatherDetailsById(Id);
    }
}
