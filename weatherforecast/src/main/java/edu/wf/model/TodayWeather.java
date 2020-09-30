package edu.wf.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("TODAY_WEATHER")
public class TodayWeather {
	@Id
	private int id;
	//更新时间
	private Date date;
	//温度
	private int temp;
	//舒适度
	private int feelsLike;
	//天气描述
	private String text;
	//风向
	private String windDir;
	//风力
	private String windScale;
	//风速
	private int windSpeed;
	//湿度
	private int humidity;
	//气压
	private int pressure;
	//能见度
	private int vis;
	//云量
	private int cloud;
	
	//location_id
	private String locationId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	public int getFeelsLike() {
		return feelsLike;
	}
	public void setFeelsLike(int feelsLike) {
		this.feelsLike = feelsLike;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getWindDir() {
		return windDir;
	}
	public void setWindDir(String windDir) {
		this.windDir = windDir;
	}
	public String getWindScale() {
		return windScale;
	}
	public void setWindScale(String windScale) {
		this.windScale = windScale;
	}
	public int getWindspeed() {
		return windSpeed;
	}
	public void setWindspeed(int windspeed) {
		this.windSpeed = windspeed;
	}
	public int getHumidity() {
		return humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	public int getPressure() {
		return pressure;
	}
	public void setPressure(int pressure) {
		this.pressure = pressure;
	}
	public int getVis() {
		return vis;
	}
	public void setVis(int vis) {
		this.vis = vis;
	}
	public int getCloud() {
		return cloud;
	}
	public void setCloud(int cloud) {
		this.cloud = cloud;
	}
	public String getLocationId() {
		return locationId;
	}
	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
