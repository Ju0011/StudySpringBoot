package org.Ju00.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.Ju00.domain.Trip;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface TripMapper {
    List<Trip> findAll();
    List<Trip> findByOrigin(String origin);

    int addTrip(Trip trip );
    int deleteTrip(int id);
    int updateTrip(Trip trip );
}