package cn.edu.nchu.test.stars.service.impl;

import cn.edu.nchu.test.stars.entity.Weather;
import cn.edu.nchu.test.stars.dao.WeatherDao;
import cn.edu.nchu.test.stars.service.WeatherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Weather)表服务实现类
 *
 * @author glint
 * @since 2020-09-21 08:33:37
 */
@Service("weatherService")
public class WeatherServiceImpl implements WeatherService {
    @Resource
    private WeatherDao weatherDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Weather queryById(Integer id) {
        return this.weatherDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Weather> queryAllByLimit(int offset, int limit) {
        return this.weatherDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param weather 实例对象
     * @return 实例对象
     */
    @Override
    public Weather insert(Weather weather) {
        this.weatherDao.insert(weather);
        return weather;
    }

    /**
     * 修改数据
     *
     * @param weather 实例对象
     * @return 实例对象
     */
    @Override
    public Weather update(Weather weather) {
        this.weatherDao.update(weather);
        return this.queryById(weather.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.weatherDao.deleteById(id) > 0;
    }
}