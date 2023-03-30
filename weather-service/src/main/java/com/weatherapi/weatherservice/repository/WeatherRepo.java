package com.weatherapi.weatherservice.repository;

import com.weatherapi.weatherservice.entity.Weather;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WeatherRepo extends JpaRepository<Weather,Long> {

    boolean existsByCityName(String city_name);

    Weather findByCityName(String cityname);

    @Query(value = "SELECT * FROM weather where temperature= :temp",nativeQuery = true)
    List<String> getCitiesByTemp(@Param("temp") Double temperature);
}
