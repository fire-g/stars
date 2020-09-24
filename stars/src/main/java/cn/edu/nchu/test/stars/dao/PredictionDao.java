package cn.edu.nchu.test.stars.dao;

import cn.edu.nchu.test.stars.entity.Prediction;
import org.apache.ibatis.annotations.Param;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * (Prediction)表数据库访问层
 *
 * @author glint
 * @since 2020-09-17 10:42:55
 */
@Mapper
public interface PredictionDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Prediction queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Prediction> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param prediction 实例对象
     * @return 对象列表
     */
    List<Prediction> queryAll(Prediction prediction);

    /**
     * 新增数据
     *
     * @param prediction 实例对象
     * @return 影响行数
     */
    int insert(Prediction prediction);

    /**
     * 修改数据
     *
     * @param prediction 实例对象
     * @return 影响行数
     */
    int update(Prediction prediction);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}