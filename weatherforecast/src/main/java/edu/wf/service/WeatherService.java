package edu.wf.service;

import java.util.List;

import edu.wf.model.ForecastWeather;
import edu.wf.model.HourlyWeather;
import edu.wf.model.LifeIndex;
import edu.wf.model.Location;
import edu.wf.model.TodayWeather;

public interface WeatherService {
	
	public TodayWeather getWeatherInfo(String locationId);
	
	public List<ForecastWeather> getForecastWeather(String locationId);
	
	public List<LifeIndex> getLifeIndex(String locationId);
	
	public List<Location> getWebLocation(String city);

	public List<HourlyWeather> getHourlyWeather(String locationId);
}
