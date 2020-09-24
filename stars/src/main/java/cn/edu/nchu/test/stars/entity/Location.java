package cn.edu.nchu.test.stars.entity;

import java.io.Serializable;

/**
 * (Location)实体类
 *
 * @author glint
 * @since 2020-09-17 10:40:35
 */
public class Location implements Serializable {
    private static final long serialVersionUID = 535199166057208531L;
    
    private Integer id;
    
    private String name;
    
    private String level;
    
    private Integer previousId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Integer getPreviousId() {
        return previousId;
    }

    public void setPreviousId(Integer previousId) {
        this.previousId = previousId;
    }

}