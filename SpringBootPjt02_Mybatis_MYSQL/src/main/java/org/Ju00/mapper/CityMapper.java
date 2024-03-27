package org.Ju00.mapper;

import org.Ju00.domain.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Mapper
public interface CityMapper {
    @Select("SELECT * FROM CITY ")
    ArrayList<City> findAll();

//    @Select("SELECT * FROM CITY where id = #{id}")
//    City findById(@Param('id') int id);
}
