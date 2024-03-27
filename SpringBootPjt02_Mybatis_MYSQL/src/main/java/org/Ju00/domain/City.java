package org.Ju00.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Data
public class City {

    private int id;
    private String cityName;
    private String country;

    public City(String cityName, String country){
        this.country = country;
        this.cityName = cityName;
    }

}