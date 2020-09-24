package cn.edu.nchu.test.stars.entity;

import java.io.Serializable;

/**
 * (Weather)实体类
 *
 * @author glint
 * @since 2020-09-21 08:33:37
 */
public class Weather implements Serializable {
    private static final long serialVersionUID = -22392032600981139L;
    
    private Integer id;
    
    private Integer locationid;
    
    private Integer timeSlot;
    
    private Object temperature;
    
    private Object humidity;
    
    private Integer windDirection;
    
    private Integer windPower;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLocationid() {
        return locationid;
    }

    public void setLocationid(Integer locationid) {
        this.locationid = locationid;
    }

    public Integer getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(Integer timeSlot) {
        this.timeSlot = timeSlot;
    }

    public Object getTemperature() {
        return temperature;
    }

    public void setTemperature(Object temperature) {
        this.temperature = temperature;
    }

    public Object getHumidity() {
        return humidity;
    }

    public void setHumidity(Object humidity) {
        this.humidity = humidity;
    }

    public Integer getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(Integer windDirection) {
        this.windDirection = windDirection;
    }

    public Integer getWindPower() {
        return windPower;
    }

    public void setWindPower(Integer windPower) {
        this.windPower = windPower;
    }

}