package edu.wf.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Table("LIFE_INDEX")
public class LifeIndex {
	@Id
	private int id;
	//更新时间
	private Date date;
	//预报的日期
	@JsonFormat(pattern="yyyy-MM-dd", timezone="GMT+8")
	private Date fxDate;
	//生活指数类型
	private int type;
	//生活指数名称
	private String name;
	//级别
	private int level;
	//描述
	private String category;
	//相应推荐
	private String text;
	//location_id
	private String locationId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
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
	public Date getFxDate() {
		return fxDate;
	}
	public void setFxDate(Date fxDate) {
		this.fxDate = fxDate;
	}
}
