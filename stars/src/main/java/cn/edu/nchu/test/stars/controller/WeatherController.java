package cn.edu.nchu.test.stars.controller;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 天气详情接口
 * @Date 20200910
 * @author HaoTian
 */
@RestController
public class WeatherController {

    @ApiOperation("获取指定城市当天的基本天气状况、空气质量、风向、温度范围")
    @GetMapping("/weather")
    public JSONObject getWeather(
            @ApiParam("需要获取天气的城市") @RequestParam String city
    ){
        return null;
    }

    @ApiOperation("获取指定城市当前的天气状况,本接口将返回温度、湿度、基本天气(晴、小雨、...)、观测时间")
    @GetMapping("/weather-now")
    public JSONObject getWeatherNow(
            @ApiParam("需要获取天气的城市") @RequestParam String city
    ){
        return null;
    }

    @ApiOperation("获取指定城市当天温度变化表")
    @GetMapping("/temperature")
    public JSONObject getTemperature(
            @ApiParam("需要获取天气的城市") @RequestParam String city
    ){
        return null;
    }


    @ApiOperation("获取指定城市近期天气")
    @GetMapping("/weather-days")
    public JSONObject getWeatherDays(
            @ApiParam("需要获取天气的城市") @RequestParam String city,
            @ApiParam("需要获取最近几天的天气(1-15)") @RequestParam int num
    ){
        return null;
    }

    @ApiOperation("通过上传指定的文字生成声音")
    @GetMapping("/sound")
    public Object getSound(
            @ApiParam("需要生成声音的文字") @RequestParam String word
    ){
        return null;
    }
}
