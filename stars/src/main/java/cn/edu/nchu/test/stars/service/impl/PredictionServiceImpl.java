package cn.edu.nchu.test.stars.service.impl;

import cn.edu.nchu.test.stars.entity.Prediction;
import cn.edu.nchu.test.stars.dao.PredictionDao;
import cn.edu.nchu.test.stars.service.PredictionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Prediction)表服务实现类
 *
 * @author makejava
 * @since 2020-09-17 10:42:55
 */
@Service("predictionService")
public class PredictionServiceImpl implements PredictionService {
    @Resource
    private PredictionDao predictionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Prediction queryById(Integer id) {
        return this.predictionDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Prediction> queryAllByLimit(int offset, int limit) {
        return this.predictionDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param prediction 实例对象
     * @return 实例对象
     */
    @Override
    public Prediction insert(Prediction prediction) {
        this.predictionDao.insert(prediction);
        return prediction;
    }

    /**
     * 修改数据
     *
     * @param prediction 实例对象
     * @return 实例对象
     */
    @Override
    public Prediction update(Prediction prediction) {
        this.predictionDao.update(prediction);
        return this.queryById(prediction.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.predictionDao.deleteById(id) > 0;
    }
}