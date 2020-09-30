package edu.wf.dao;

import java.util.List;

import edu.wf.model.ForecastWeather;
import edu.wf.model.HourlyWeather;
import edu.wf.model.LifeIndex;
import edu.wf.model.TodayWeather;

public interface WebWeatherDao {
	/*
	 * 获取今日的天气
	 */
	public TodayWeather getTodayWeather(String locationId);
	
	/*
	 * 获取今天的生活指数
	 */
	public List<LifeIndex> getLifeIndex(String locationId);
	
	/* 
	 * 几天内的预测天气
	 */
	public List<ForecastWeather> getForecaseWeather(String locationId);
	
	/*
	 * 未来24小时内的预测天气
	 */
	public List<HourlyWeather> getHourlyWeather(String locationId);
}
