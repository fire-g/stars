package edu.wf.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Table("FORECAST_WEATHER")
public class ForecastWeather {
	@Id
	private int id;
	//更新时间
	private Date date;
	//预报的日期
	@JsonFormat(pattern="yyyy-MM-dd", timezone="GMT+8")
	private Date fxDate;
	//日出时间
	private String sunrise;
	//日落时间
	private String sunset;
	//最高温度
	private int tempMax;
	//最低温度
	private int tempMin;
	//白天天气
	private String textDay;
	//夜间天气
	private String textNight;
	//夜间风向
	private String windDirNight;
	//白天风向
	private String windDirDay;
	//白天风力
	private String windScaleDay;
	//夜间风力
	private String windScaleNight;
	//湿度
	private int humidity;
	//气压
	private int pressure;
	//月相名称
	private String moonPhase;
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
	public Date getFxDate() {
		return fxDate;
	}
	public void setFxDate(Date fxDate) {
		this.fxDate = fxDate;
	}
	public String getSunrise() {
		return sunrise;
	}
	public void setSunrise(String sunrise) {
		this.sunrise = sunrise;
	}
	public String getSumset() {
		return sunset;
	}
	public void setSumset(String sumset) {
		this.sunset = sumset;
	}
	public int getTempMax() {
		return tempMax;
	}
	public void setTempMax(int tempMax) {
		this.tempMax = tempMax;
	}
	public int getTempMin() {
		return tempMin;
	}
	public void setTempMin(int tempMin) {
		this.tempMin = tempMin;
	}
	public String getTextDay() {
		return textDay;
	}
	public void setTextDay(String textDay) {
		this.textDay = textDay;
	}
	public String getTextNight() {
		return textNight;
	}
	public void setTextNight(String textNight) {
		this.textNight = textNight;
	}
	public String getWindDirNight() {
		return windDirNight;
	}
	public void setWindDirNight(String windDirNight) {
		this.windDirNight = windDirNight;
	}
	public String getWindDirDay() {
		return windDirDay;
	}
	public void setWindDirDay(String windDirDay) {
		this.windDirDay = windDirDay;
	}
	public String getWindScaleDay() {
		return windScaleDay;
	}
	public void setWindScaleDay(String windScaleDay) {
		this.windScaleDay = windScaleDay;
	}
	public String getWindScaleNight() {
		return windScaleNight;
	}
	public void setWindScaleNight(String windScaleNight) {
		this.windScaleNight = windScaleNight;
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
	public String getMoonPhase() {
		return moonPhase;
	}
	public void setMoonPhase(String moonPhase) {
		this.moonPhase = moonPhase;
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
}
