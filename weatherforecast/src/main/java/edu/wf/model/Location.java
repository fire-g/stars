package edu.wf.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("LOCATION")
public class Location {
	@Id
    private int id;
	//城市编号
	private String locationId;
    //城市名
    private String name;
    //纬度
    private double lat;
    //经度
    private double lon;
    //市级
    private String adm2;
    //省级
    private String adm1;
    //国家
    private String country;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocationId() {
		return locationId;
	}
	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLon() {
		return lon;
	}
	public void setLon(double lon) {
		this.lon = lon;
	}
	public String getAdm2() {
		return adm2;
	}
	public void setAdm2(String adm2) {
		this.adm2 = adm2;
	}
	public String getAdm1() {
		return adm1;
	}
	public void setAdm1(String adm1) {
		this.adm1 = adm1;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}