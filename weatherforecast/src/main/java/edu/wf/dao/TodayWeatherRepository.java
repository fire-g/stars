package edu.wf.dao;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.wf.model.TodayWeather;

@Repository
public interface TodayWeatherRepository extends CrudRepository<TodayWeather, Integer> {
	@Query("select * from today_weather where location_id = :condition")
	TodayWeather findByLocationId(@Param("condition") String locationId);
}
