package edu.wf.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.alibaba.fastjson.JSON;

import edu.wf.model.ForecastWeather;
import edu.wf.model.HourlyWeather;
import edu.wf.model.LifeIndex;
import edu.wf.model.TodayWeather;
import edu.wf.utils.WebApiConnector;

@Repository
public class WebWeatherDaoImpl implements WebWeatherDao {

	@Override
	public TodayWeather getTodayWeather(String locationId) {
    	String urlString = "https://devapi.heweather.net/v7/weather/now?location=" + locationId;
    	
    	Date nowDate = new Date();
    	String json = WebApiConnector.connect(urlString);
    	Map<String, Object> map = JSON.parseObject(json);
    	Map<String, Object> data = (Map<String, Object>) map.get("now");
    	TodayWeather todayWeather = new TodayWeather();
    	todayWeather.setTemp(Integer.parseInt((String) data.get("temp")));
        todayWeather.setFeelsLike(Integer.parseInt((String) data.get("feelsLike")));
        todayWeather.setText((String) data.get("text"));
        todayWeather.setWindDir((String) data.get("windDir"));
        todayWeather.setHumidity(Integer.parseInt((String) data.get("humidity")));
    	todayWeather.setPressure(Integer.parseInt((String) data.get("pressure")));
        todayWeather.setVis(Integer.parseInt((String) data.get("vis")));
        todayWeather.setWindspeed(Integer.parseInt((String) data.get("windSpeed")));
        todayWeather.setWindScale((String) data.get("windScale"));
        todayWeather.setCloud(Integer.parseInt((String) data.get("cloud")));
    	todayWeather.setLocationId(locationId);
    	todayWeather.setDate(nowDate);
        
		return todayWeather;
	}

	@Override
	public List<LifeIndex> getLifeIndex(String locationId) {
		String urlString = "https://devapi.heweather.net/v7/indices/1d?type=1,2,3,4,5,6,7,8&location=" + locationId;
		
		String json = WebApiConnector.connect(urlString);
		Map<String, Object> map = JSON.parseObject(json);
		//System.out.println(map);
		List<Map<String, Object>> data = (List<Map<String, Object>>) map.get("daily");
		List<LifeIndex> list = new ArrayList<>(); 
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date nowDate = new Date();
		for (Map<String, Object> temp : data) {
			LifeIndex lifeIndex = new LifeIndex();
			
			lifeIndex.setLevel(Integer.parseInt((String) temp.get("level")));
			lifeIndex.setName((String) temp.get("name"));
			lifeIndex.setType(Integer.parseInt((String) temp.get("type")));
			lifeIndex.setCategory((String) temp.get("category"));
			lifeIndex.setText((String) temp.get("text"));
			lifeIndex.setLocationId(locationId);
			lifeIndex.setDate(nowDate);
			try {
				lifeIndex.setFxDate(simpleDateFormat.parse((String) temp.get("date")));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			list.add(lifeIndex);
		}

		return list;
	}

	@Override
	public List<ForecastWeather> getForecaseWeather(String locationId) {
		String urlString = "https://devapi.heweather.net/v7/weather/7d?location=" + locationId;
		
		String json = WebApiConnector.connect(urlString);
		Map<String, Object> map = JSON.parseObject(json);
		
		List<Map<String, Object>> data = (List<Map<String, Object>>) map.get("daily");
		List<ForecastWeather> list = new ArrayList<>(); 
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date nowDate = new Date();
		for (Map<String, Object> temp : data) {
			ForecastWeather forecastWeather = new ForecastWeather();
			
			forecastWeather.setHumidity(Integer.parseInt((String) temp.get("humidity")));
			forecastWeather.setPressure(Integer.parseInt((String) temp.get("pressure")));
			forecastWeather.setSumset((String) temp.get("sunset"));
			forecastWeather.setSunrise((String) temp.get("sunrise"));
			forecastWeather.setTempMax(Integer.parseInt((String) temp.get("tempMax")));
			forecastWeather.setTempMin(Integer.parseInt((String) temp.get("tempMin")));
			forecastWeather.setTextDay((String) temp.get("textDay"));
			forecastWeather.setTextNight((String) temp.get("textNight"));
			forecastWeather.setWindDirDay((String) temp.get("windDirDay"));
			forecastWeather.setWindDirNight((String) temp.get("windDirNight"));
			forecastWeather.setWindScaleDay((String) temp.get("windScaleDay"));
			forecastWeather.setWindScaleNight((String) temp.get("windScaleNight"));
			forecastWeather.setMoonPhase((String) temp.get("moonPhase"));
			forecastWeather.setVis(Integer.parseInt((String) temp.get("vis")));
			forecastWeather.setCloud(Integer.parseInt((String) temp.get("cloud")));
			forecastWeather.setLocationId(locationId);
			forecastWeather.setDate(nowDate);
			try {
				forecastWeather.setFxDate(simpleDateFormat.parse((String) temp.get("fxDate")));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			list.add(forecastWeather);
		}
		
		return list;
	}

	@Override
	public List<HourlyWeather> getHourlyWeather(String locationId) {
		String urlString = "https://devapi.heweather.net/v7/weather/24h?location=" + locationId;
    	
    	String json = WebApiConnector.connect(urlString);
    	Map<String, Object> map = JSON.parseObject(json);
    	List<HourlyWeather> list = new ArrayList<>(); 
    	List<Map<String, Object>> data = (List<Map<String, Object>>) map.get("hourly");
    	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
    	Date nowDate = new Date();
    	for (Map<String, Object> temp : data) {
    		HourlyWeather hourlyWeather = new HourlyWeather();
    		hourlyWeather.setCloud(Integer.parseInt((String) temp.get("cloud")));
    		hourlyWeather.setHumidity(Integer.parseInt((String) temp.get("humidity")));
    		hourlyWeather.setPop(Integer.parseInt((String) temp.get("pop")));
    		hourlyWeather.setPrecip(Double.parseDouble((String) temp.get("precip")));
    		hourlyWeather.setPressure(Integer.parseInt((String) temp.get("pressure")));
    		hourlyWeather.setTemp(Integer.parseInt((String) temp.get("temp")));
    		hourlyWeather.setText((String) temp.get("text"));
    		hourlyWeather.setWindDir((String) temp.get("windDir"));
    		hourlyWeather.setWindScale((String) temp.get("windScale"));
    		hourlyWeather.setWindSpeed(Integer.parseInt((String) temp.get("windSpeed")));
    		hourlyWeather.setLocationId(locationId);
    		try {
				hourlyWeather.setFxDate(simpleDateFormat.parse((String) temp.get("fxTime")));
			} catch (ParseException e) {
				e.printStackTrace();
			}
    		hourlyWeather.setDate(nowDate);
    		list.add(hourlyWeather);
    	}
		
		return list;
	}

}
