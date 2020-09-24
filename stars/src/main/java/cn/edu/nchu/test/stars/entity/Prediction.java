package cn.edu.nchu.test.stars.entity;

import java.io.Serializable;

/**
 * (Prediction)实体类
 *
 * @author glint
 * @since 2020-09-17 10:42:55
 */
public class Prediction implements Serializable {
    private static final long serialVersionUID = -49015794861446939L;
    
    private Integer id;
    
    private Integer locationId;
    
    private Integer weatherId;
    
    private Integer flushTime;
    
    private Integer windDirection;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public Integer getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(Integer weatherId) {
        this.weatherId = weatherId;
    }

    public Integer getFlushTime() {
        return flushTime;
    }

    public void setFlushTime(Integer flushTime) {
        this.flushTime = flushTime;
    }

    public Integer getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(Integer windDirection) {
        this.windDirection = windDirection;
    }

}