package edu.wf.dao;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.wf.model.ForecastWeather;

@Repository
public interface ForecastWeatherRepository extends CrudRepository<ForecastWeather, Integer> {
	@Query("select * from forecast_weather where location_id = :condition  order by fx_date")
	List<ForecastWeather> findByLocationId(@Param("condition") String locationId);
}
