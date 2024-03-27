package org.Ju00.controller;

import org.Ju00.domain.City;
import org.Ju00.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CityController {
    @Autowired
    CityMapper cityMapper ;

    @GetMapping("/city")
    ArrayList<City> findAll(){
        return cityMapper.findAll();
    }
}
