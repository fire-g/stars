package edu.wf.dao;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.wf.model.HourlyWeather;

@Repository
public interface HourlyWeatherRepository extends CrudRepository<HourlyWeather, Integer>{
	@Query("select * from hourly_weather where location_id = :condition order by fx_date")
	List<HourlyWeather> findByLocationId(@Param("condition") String locationId);
}
