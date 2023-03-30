package com.weatherapi.weatherservice.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@ToString
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Weather {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private String cityName;
    private Double temperature;


    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Double getTemperature() {
        return temperature;
    }

}
