package cn.edu.nchu.test.stars.service;

import cn.edu.nchu.test.stars.entity.Prediction;
import java.util.List;

/**
 * (Prediction)表服务接口
 *
 * @author glint
 * @since 2020-09-17 10:42:55
 */
public interface PredictionService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Prediction queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Prediction> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param prediction 实例对象
     * @return 实例对象
     */
    Prediction insert(Prediction prediction);

    /**
     * 修改数据
     *
     * @param prediction 实例对象
     * @return 实例对象
     */
    Prediction update(Prediction prediction);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}