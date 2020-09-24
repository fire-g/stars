package cn.edu.nchu.test.stars.controller;

import cn.edu.nchu.test.stars.entity.Prediction;
import cn.edu.nchu.test.stars.service.PredictionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Prediction)表控制层
 *
 * @author glint
 * @since 2020-09-17 10:42:55
 */
@RestController
@RequestMapping("prediction")
public class PredictionController {
    /**
     * 服务对象
     */
    @Resource
    private PredictionService predictionService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Prediction selectOne(Integer id) {
        return this.predictionService.queryById(id);
    }

}