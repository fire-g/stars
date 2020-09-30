package edu.wf.rest;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.wf.model.ForecastWeather;
import edu.wf.model.HourlyWeather;
import edu.wf.model.LifeIndex;
import edu.wf.model.Location;
import edu.wf.model.TodayWeather;
import edu.wf.service.WeatherBroadcastService;
import edu.wf.service.WeatherService;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class WeatherRestController {
	@Autowired
	private WeatherService weatherService;
	@Autowired
	private WeatherBroadcastService weatherBroadcastService;
	
	
	@GetMapping("/msg")
	public String msg() {
		return "Hello,RESTful...";
	}
	
	@GetMapping(value="/weather/{location}" ,produces={"application/json;charset=UTF-8"})
	public TodayWeather weather(@PathVariable(value="location") String locationId) {
		return weatherService.getWeatherInfo(locationId);
	}
	
	@GetMapping(value="/location/{city}" ,produces={"application/json;charset=UTF-8"})
	public List<Location> location(@PathVariable(value="city") String city) {
		return weatherService.getWebLocation(city);
	}
	
	@GetMapping(value="/life_index/{location}" ,produces={"application/json;charset=UTF-8"})
	public List<LifeIndex> leftIndex(@PathVariable(value="location") String locationId) {
		return weatherService.getLifeIndex(locationId);
	}
	
	@GetMapping(value="/forecast_weather/{location}" ,produces={"application/json;charset=UTF-8"})
	public List<ForecastWeather> forecastWeather(@PathVariable(value="location") String locationId) {
		return weatherService.getForecastWeather(locationId);
	}
	
	@GetMapping(value="/hourly_weather/{location}" ,produces={"application/json;charset=UTF-8"})
	public List<HourlyWeather> hourlyWeather(@PathVariable(value="location") String locationId) {
		return weatherService.getHourlyWeather(locationId);
	}
	
	@GetMapping(value="/speech/{str}" ,produces={"audio/mp3"})
	public byte[] speech(@PathVariable(value="str") String str) {
		return weatherBroadcastService.getWeatherBroadcastService(str);
	}
	
}
