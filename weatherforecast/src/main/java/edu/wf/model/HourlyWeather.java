package edu.wf.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("HOURLY_WEATHER")
public class HourlyWeather {
	@Id
	private int id;
	//更新时间
	private Date date;
	//预报的时间
	private Date fxDate;
	//温度
	private int temp;
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
	//降雨概率
	private int pop;
	//降雨量，毫米
	private double precip;
	//气压
	private int pressure;
	//云量
	private int cloud;
	//露点温度
	private int dew;
	//locationId
	private String locationId;
	
	public String getLocationId() {
		return locationId;
	}
	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getFxDate() {
		return fxDate;
	}
	public void setFxDate(Date fxDate) {
		this.fxDate = fxDate;
	}
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
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
	public int getWindSpeed() {
		return windSpeed;
	}
	public void setWindSpeed(int windSpeed) {
		this.windSpeed = windSpeed;
	}
	public int getHumidity() {
		return humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	public int getPop() {
		return pop;
	}
	public void setPop(int pop) {
		this.pop = pop;
	}
	public double getPrecip() {
		return precip;
	}
	public void setPrecip(double precip) {
		this.precip = precip;
	}
	public int getPressure() {
		return pressure;
	}
	public void setPressure(int pressure) {
		this.pressure = pressure;
	}
	public int getCloud() {
		return cloud;
	}
	public void setCloud(int cloud) {
		this.cloud = cloud;
	}
	public int getDew() {
		return dew;
	}
	public void setDew(int dew) {
		this.dew = dew;
	}
}
