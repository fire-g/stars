package edu.wf.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.wf.dao.ForecastWeatherRepository;
import edu.wf.dao.HourlyWeatherRepository;
import edu.wf.dao.LifeIndexRepository;
import edu.wf.dao.LocationRepository;
import edu.wf.dao.TodayWeatherRepository;
import edu.wf.dao.WebLocationDao;
import edu.wf.dao.WebWeatherDao;
import edu.wf.model.ForecastWeather;
import edu.wf.model.HourlyWeather;
import edu.wf.model.LifeIndex;
import edu.wf.model.Location;
import edu.wf.model.TodayWeather;

@Service
public class WeatherServiceImpl implements WeatherService {
	//小时
	private final static long ONEHOUR = 2 * 60 * 60 * 1000;
	private WebWeatherDao webWeatherDao;
	private WebLocationDao webLocationDao;
	private LocationRepository locationRepository;
	private LifeIndexRepository lifeIndexRepository;
	private ForecastWeatherRepository forecastWeatherRepository;
	private TodayWeatherRepository todayWeatherRepository;
	private HourlyWeatherRepository hourlyWeatherRepository;
	
	@Autowired
	public WeatherServiceImpl(WebWeatherDao webWeatherDao, WebLocationDao webLocationDao,
			LocationRepository locationRepository, LifeIndexRepository lifeIndexRepository,
			ForecastWeatherRepository forecastWeatherRepository, TodayWeatherRepository todayWeatherRepository,
			HourlyWeatherRepository hourlyWeatherRepository) {
		super();
		this.webWeatherDao = webWeatherDao;
		this.webLocationDao = webLocationDao;
		this.locationRepository = locationRepository;
		this.lifeIndexRepository = lifeIndexRepository;
		this.forecastWeatherRepository = forecastWeatherRepository;
		this.todayWeatherRepository = todayWeatherRepository;
		this.hourlyWeatherRepository = hourlyWeatherRepository;
	}

	@Override
	public TodayWeather getWeatherInfo(String locationId) {

		Date newDate = new Date();
		TodayWeather todayWeather = todayWeatherRepository.findByLocationId(locationId);
		System.out.println(todayWeather);
		if (todayWeather == null) { 								// 数据库中无数据
			todayWeather = webWeatherDao.getTodayWeather(locationId);
			todayWeatherRepository.save(todayWeather);
		} else if (compareDate(todayWeather.getDate(), newDate)) { 	// 数据库中有数据但已过期
			TodayWeather newTodayWeather = webWeatherDao.getTodayWeather(locationId);
			newTodayWeather.setId(todayWeather.getId());
			todayWeatherRepository.save(newTodayWeather);
			todayWeather = newTodayWeather;
		}

		return todayWeather;
	}

	@Override
	public List<Location> getWebLocation(String city) {
		List<Location> list = webLocationDao.getWebLocation(city);
		return list;
	}

	@Override
	public List<ForecastWeather> getForecastWeather(String locationId) {
		Date newDate = new Date();
		List<ForecastWeather> list = forecastWeatherRepository.findByLocationId(locationId);
		if (list == null || list.size() == 0) { 								// 数据库中无数据
			
			list = webWeatherDao.getForecaseWeather(locationId);
			forecastWeatherRepository.saveAll(list);
		} else if (compareDate(list.get(0).getDate(), newDate)) { 	// 数据库中有数据但已过期
			List<ForecastWeather> newList = webWeatherDao.getForecaseWeather(locationId);
			for (int i = 0; i < list.size(); i++) {					
				newList.get(i).setId(list.get(i).getId());
			}
			forecastWeatherRepository.saveAll(newList);
			list = newList;
		}
		
		return list;
	}

	@Override
	public List<LifeIndex> getLifeIndex(String locationId) {
		Date newDate = new Date();
		List<LifeIndex> list = lifeIndexRepository.findByLocationId(locationId);
		if (list == null || list.size() == 0) { 								// 数据库中无数据
			list = webWeatherDao.getLifeIndex(locationId);
			lifeIndexRepository.saveAll(list);
		} else if (compareDate(list.get(0).getDate(), newDate)) { 				// 数据库中有数据但已过期
			List<LifeIndex> newList = webWeatherDao.getLifeIndex(locationId);
			for (int i = 0; i < list.size(); i++) {								
				newList.get(i).setId(list.get(i).getId());
			}
			lifeIndexRepository.saveAll(newList);
			list = newList;
		}
		
		return list;
	}
	
	@Override
	public List<HourlyWeather> getHourlyWeather(String locationId) {
		Date newDate = new Date();
		List<HourlyWeather> list = hourlyWeatherRepository.findByLocationId(locationId);
		if (list == null || list.size() == 0) { 								// 数据库中无数据
			list = webWeatherDao.getHourlyWeather(locationId);
			hourlyWeatherRepository.saveAll(list);
		} else if (compareDate(list.get(0).getFxDate(), newDate)) { 				// 数据库中有数据但已过期
			List<HourlyWeather> newList = webWeatherDao.getHourlyWeather(locationId);
			for (int i = 0; i < list.size(); i++) {								
				newList.get(i).setId(list.get(i).getId());
			}
			hourlyWeatherRepository.saveAll(newList);
			list = newList;
		}
		return list;
	}

	// 当时间大于某个设定参数则返回true，表示需要更新
	private boolean compareDate(Date oldDate, Date newDate) {
		if (newDate.getTime() > oldDate.getTime() + ONEHOUR) {
			return true;
		} else {
			return false;
		}
	}

}
