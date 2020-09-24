package cn.edu.nchu.test.stars.controller;

import cn.edu.nchu.test.stars.entity.Location;
import cn.edu.nchu.test.stars.service.LocationService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Location)表控制层
 *
 * @author glint
 * @since 2020-09-17 10:40:44
 */
@RestController
@RequestMapping("location")
public class LocationController {
    /**
     * 服务对象
     */
    @Resource
    private LocationService locationService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Location selectOne(Integer id) {
        return this.locationService.queryById(id);
    }

}