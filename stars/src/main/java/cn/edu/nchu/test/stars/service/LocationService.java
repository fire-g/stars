﻿package cn.edu.nchu.test.stars.service;

import cn.edu.nchu.test.stars.entity.Location;
import java.util.List;

/**
 * (Location)表服务接口
 *
 * @author glint
 * @since 2020-09-17 10:40:42
 */
public interface LocationService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Location queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Location> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param location 实例对象
     * @return 实例对象
     */
    Location insert(Location location);

    /**
     * 修改数据
     *
     * @param location 实例对象
     * @return 实例对象
     */
    Location update(Location location);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}