package org.Ju00.controller;

import org.Ju00.domain.Trip;
import org.Ju00.mappers.TripMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TripController {
    @Autowired
    TripMapper tripMapper;

    @GetMapping("/trip")
    List<Trip> findAll(){
        return tripMapper.findAll();
    }
}
