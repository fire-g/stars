<template>
  <div id="body">
    <div id="header">
      <div id="header-title">
        <img class="img-logo" src="../assets/logo.png">
        <!--<img class="img-place" src="../assets/place.png">-->
        <input class="city-place" type="text" placeholder="搜索市、区、县等" list="placeholder">
        <datalist id="placeholder">
          <option value="南昌-上饶"></option>
          <option value="南昌-宜春"></option>
          <option value="南昌-新余"></option>
          <option value="南昌-广丰"></option>
          <option value="重庆-重庆"></option>
        </datalist>
      </div>
      <div id="link-one"></div>
      <div id="header-content">
        <div id="content-current">
          <div id = "content-current-left">
            <!--当时天气详情-->
            <div class="content-temperature">
              <p class="text-temperature">28℃</p>
              <p class="text-weather">阴</p>
            </div>
            <!--最高 / 最低 温度-->
            <div class="content-maximumTemperature">
              <p class = "text-uplow">16℃ / 29℃</p>
            </div>
            <div class = "content-other">
              <!--风向-->
              <p class="item">
                <img class="icon windDirection" src="../assets/wind direction.png">
                <span class="txt">东北风&nbsp;1级</span>
              </p>
              <!--湿度-->
              <p class="item">
                <img class="icon windDirection" src="../assets/humidity.png">
                <span class="txt">湿度&nbsp;80%</span>
              </p>
              <!--空气质量-->
              <p class="item">
                <img class="icon windDirection" src="../assets/air quality.png">
                <span class="txt">空气质量&nbsp;优</span>
              </p>
            </div>
            <!--建议-->
            <div class="content-tips">
            </div>
            <!--当前位置-->
            <div class="content-locate">
              <img class="img-nowPlace small-componentslogo"  src="../assets/nowplace.png">
              <span class="txt-nowplace">江西省&nbsp;南昌市</span>
            </div>
          </div>
          <div id = "content-current-right">
            <img class="img-weather" src="../assets/sun to cloud.png">  <!--天气图标-->
          </div>
        </div>
        <!--变色当前位置nowplace cover.png-->
        <!--变色语音播报speech sound cover.png-->
      </div>
    </div>

    <div id="weather-content1">
      <div id="day-weather">
        <div class="day-weather-list">
          <!--time-1-->
          <div class="weather-box">
            <ul class="day-weather-ul">
              <li class="day-weather-li"><p class="day-weather-time">18:00</p></li>
              <li class="day-weather-li"><p class="day-weather-temperature">28℃</p></li>
              <li class="day-weather-li"><img class="day-weather-weather" src="../assets/sun to cloud.png"></li>
              <li class="day-weather-li"><p class="day-weather-windDirection">1级</p></li>
              <li class="day-weather-li"><p class="day-weather-airQuality">优</p></li>
            </ul>
          </div>
          <!--time-2-->
          <div class="weather-box">
            <ul class="day-weather-ul">
              <li class="day-weather-li"><p class="day-weather-time">18:00</p></li>
              <li class="day-weather-li"><p class="day-weather-temperature">28℃</p></li>
              <li class="day-weather-li"><img class="day-weather-weather" src="../assets/sun to cloud.png"></li>
              <li class="day-weather-li"><p class="day-weather-windDirection">1级</p></li>
              <li class="day-weather-li"><p class="day-weather-airQuality">优</p></li>
            </ul>
          </div>
          <!--time-3-->
          <div class="weather-box">
            <ul class="day-weather-ul">
              <li class="day-weather-li"><p class="day-weather-time">18:00</p></li>
              <li class="day-weather-li"><p class="day-weather-temperature">28℃</p></li>
              <li class="day-weather-li"><img class="day-weather-weather" src="../assets/sun to cloud.png"></li>
              <li class="day-weather-li"><p class="day-weather-windDirection">1级</p></li>
              <li class="day-weather-li"><p class="day-weather-airQuality">优</p></li>
            </ul>
          </div>
          <!--time-4-->
          <div class="weather-box">
            <ul class="day-weather-ul">
              <li class="day-weather-li"><p class="day-weather-time">18:00</p></li>
              <li class="day-weather-li"><p class="day-weather-temperature">28℃</p></li>
              <li class="day-weather-li"><img class="day-weather-weather" src="../assets/sun to cloud.png"></li>
              <li class="day-weather-li"><p class="day-weather-windDirection">1级</p></li>
              <li class="day-weather-li"><p class="day-weather-airQuality">优</p></li>
            </ul>
          </div>
          <!--time-5-->
          <div class="weather-box">
            <ul class="day-weather-ul">
              <li class="day-weather-li"><p class="day-weather-time">18:00</p></li>
              <li class="day-weather-li"><p class="day-weather-temperature">28℃</p></li>
              <li class="day-weather-li"><img class="day-weather-weather" src="../assets/sun to cloud.png"></li>
              <li class="day-weather-li"><p class="day-weather-windDirection">1级</p></li>
              <li class="day-weather-li"><p class="day-weather-airQuality">优</p></li>
            </ul>
          </div>
          <!--time-6-->
          <div class="weather-box">
            <ul class="day-weather-ul">
              <li class="day-weather-li"><p class="day-weather-time">18:00</p></li>
              <li class="day-weather-li"><p class="day-weather-temperature">28℃</p></li>
              <li class="day-weather-li"><img class="day-weather-weather" src="../assets/sun to cloud.png"></li>
              <li class="day-weather-li"><p class="day-weather-windDirection">1级</p></li>
              <li class="day-weather-li"><p class="day-weather-airQuality">优</p></li>
            </ul>
          </div>
          <!--time-7-->
          <div class="weather-box">
            <ul class="day-weather-ul">
              <li class="day-weather-li"><p class="day-weather-time">18:00</p></li>
              <li class="day-weather-li"><p class="day-weather-temperature">28℃</p></li>
              <li class="day-weather-li"><img class="day-weather-weather" src="../assets/sun to cloud.png"></li>
              <li class="day-weather-li"><p class="day-weather-windDirection">1级</p></li>
              <li class="day-weather-li"><p class="day-weather-airQuality">优</p></li>
            </ul>
          </div>
          <!--time-8-->
          <div class="weather-box">
            <ul class="day-weather-ul">
              <li class="day-weather-li"><p class="day-weather-time">18:00</p></li>
              <li class="day-weather-li"><p class="day-weather-temperature">28℃</p></li>
              <li class="day-weather-li"><img class="day-weather-weather" src="../assets/sun to cloud.png"></li>
              <li class="day-weather-li"><p class="day-weather-windDirection">1级</p></li>
              <li class="day-weather-li"><p class="day-weather-airQuality">优</p></li>
            </ul>
          </div>
          <!--time-9-->
          <div class="weather-box">
            <ul class="day-weather-ul">
              <li class="day-weather-li"><p class="day-weather-time">18:00</p></li>
              <li class="day-weather-li"><p class="day-weather-temperature">28℃</p></li>
              <li class="day-weather-li"><img class="day-weather-weather" src="../assets/sun to cloud.png"></li>
              <li class="day-weather-li"><p class="day-weather-windDirection">1级</p></li>
              <li class="day-weather-li"><p class="day-weather-airQuality">优</p></li>
            </ul>
          </div>
          <!--time-10-->
          <div class="weather-box">
            <ul class="day-weather-ul">
              <li class="day-weather-li"><p class="day-weather-time">18:00</p></li>
              <li class="day-weather-li"><p class="day-weather-temperature">28℃</p></li>
              <li class="day-weather-li"><img class="day-weather-weather" src="../assets/sun to cloud.png"></li>
              <li class="day-weather-li"><p class="day-weather-windDirection">1级</p></li>
              <li class="day-weather-li"><p class="day-weather-airQuality">优</p></li>
            </ul>
          </div>
          <!--time-11-->
          <div class="weather-box">
            <ul class="day-weather-ul">
              <li class="day-weather-li"><p class="day-weather-time">18:00</p></li>
              <li class="day-weather-li"><p class="day-weather-temperature">28℃</p></li>
              <li class="day-weather-li"><img class="day-weather-weather" src="../assets/sun to cloud.png"></li>
              <li class="day-weather-li"><p class="day-weather-windDirection">1级</p></li>
              <li class="day-weather-li"><p class="day-weather-airQuality">优</p></li>
            </ul>
          </div>
          <!--time-12-->
          <div class="weather-box">
            <ul class="day-weather-ul">
              <li class="day-weather-li"><p class="day-weather-time">18:00</p></li>
              <li class="day-weather-li"><p class="day-weather-temperature">28℃</p></li>
              <li class="day-weather-li"><img class="day-weather-weather" src="../assets/sun to cloud.png"></li>
              <li class="day-weather-li"><p class="day-weather-windDirection">1级</p></li>
              <li class="day-weather-li"><p class="day-weather-airQuality">优</p></li>
            </ul>
          </div>
          <!--time-13-->
          <div class="weather-box">
            <ul class="day-weather-ul">
              <li class="day-weather-li"><p class="day-weather-time">18:00</p></li>
              <li class="day-weather-li"><p class="day-weather-temperature">28℃</p></li>
              <li class="day-weather-li"><img class="day-weather-weather" src="../assets/sun to cloud.png"></li>
              <li class="day-weather-li"><p class="day-weather-windDirection">1级</p></li>
              <li class="day-weather-li"><p class="day-weather-airQuality">优</p></li>
            </ul>
          </div>
          <!--time-14-->
          <div class="weather-box">
            <ul class="day-weather-ul">
              <li class="day-weather-li"><p class="day-weather-time">18:00</p></li>
              <li class="day-weather-li"><p class="day-weather-temperature">28℃</p></li>
              <li class="day-weather-li"><img class="day-weather-weather" src="../assets/sun to cloud.png"></li>
              <li class="day-weather-li"><p class="day-weather-windDirection">1级</p></li>
              <li class="day-weather-li"><p class="day-weather-airQuality">优</p></li>
            </ul>
          </div>
          <!--time-15-->
          <div class="weather-box">
            <ul class="day-weather-ul">
              <li class="day-weather-li"><p class="day-weather-time">18:00</p></li>
              <li class="day-weather-li"><p class="day-weather-temperature">28℃</p></li>
              <li class="day-weather-li"><img class="day-weather-weather" src="../assets/sun to cloud.png"></li>
              <li class="day-weather-li"><p class="day-weather-windDirection">1级</p></li>
              <li class="day-weather-li"><p class="day-weather-airQuality">优</p></li>
            </ul>
          </div>
          <!--time-16-->
          <div class="weather-box">
            <ul class="day-weather-ul">
              <li class="day-weather-li"><p class="day-weather-time">18:00</p></li>
              <li class="day-weather-li"><p class="day-weather-temperature">28℃</p></li>
              <li class="day-weather-li"><img class="day-weather-weather" src="../assets/sun to cloud.png"></li>
              <li class="day-weather-li"><p class="day-weather-windDirection">1级</p></li>
              <li class="day-weather-li"><p class="day-weather-airQuality">优</p></li>
            </ul>
          </div>
          <!--time-17-->
          <div class="weather-box">
            <ul class="day-weather-ul">
              <li class="day-weather-li"><p class="day-weather-time">18:00</p></li>
              <li class="day-weather-li"><p class="day-weather-temperature">28℃</p></li>
              <li class="day-weather-li"><img class="day-weather-weather" src="../assets/sun to cloud.png"></li>
              <li class="day-weather-li"><p class="day-weather-windDirection">1级</p></li>
              <li class="day-weather-li"><p class="day-weather-airQuality">优</p></li>
            </ul>
          </div>
          <!--time-18-->
          <div class="weather-box">
            <ul class="day-weather-ul">
              <li class="day-weather-li"><p class="day-weather-time">18:00</p></li>
              <li class="day-weather-li"><p class="day-weather-temperature">28℃</p></li>
              <li class="day-weather-li"><img class="day-weather-weather" src="../assets/sun to cloud.png"></li>
              <li class="day-weather-li"><p class="day-weather-windDirection">1级</p></li>
              <li class="day-weather-li"><p class="day-weather-airQuality">优</p></li>
            </ul>
          </div>
          <!--time-19-->
          <div class="weather-box">
            <ul class="day-weather-ul">
              <li class="day-weather-li"><p class="day-weather-time">18:00</p></li>
              <li class="day-weather-li"><p class="day-weather-temperature">28℃</p></li>
              <li class="day-weather-li"><img class="day-weather-weather" src="../assets/sun to cloud.png"></li>
              <li class="day-weather-li"><p class="day-weather-windDirection">1级</p></li>
              <li class="day-weather-li"><p class="day-weather-airQuality">优</p></li>
            </ul>
          </div>
          <!--time-20-->
          <div class="weather-box">
            <ul class="day-weather-ul">
              <li class="day-weather-li"><p class="day-weather-time">18:00</p></li>
              <li class="day-weather-li"><p class="day-weather-temperature">28℃</p></li>
              <li class="day-weather-li"><img class="day-weather-weather" src="../assets/sun to cloud.png"></li>
              <li class="day-weather-li"><p class="day-weather-windDirection">1级</p></li>
              <li class="day-weather-li"><p class="day-weather-airQuality">优</p></li>
            </ul>
          </div>
          <!--time-21-->
          <div class="weather-box">
            <ul class="day-weather-ul">
              <li class="day-weather-li"><p class="day-weather-time">18:00</p></li>
              <li class="day-weather-li"><p class="day-weather-temperature">28℃</p></li>
              <li class="day-weather-li"><img class="day-weather-weather" src="../assets/sun to cloud.png"></li>
              <li class="day-weather-li"><p class="day-weather-windDirection">1级</p></li>
              <li class="day-weather-li"><p class="day-weather-airQuality">优</p></li>
            </ul>
          </div>
          <!--time-22-->
          <div class="weather-box">
            <ul class="day-weather-ul">
              <li class="day-weather-li"><p class="day-weather-time">18:00</p></li>
              <li class="day-weather-li"><p class="day-weather-temperature">28℃</p></li>
              <li class="day-weather-li"><img class="day-weather-weather" src="../assets/sun to cloud.png"></li>
              <li class="day-weather-li"><p class="day-weather-windDirection">1级</p></li>
              <li class="day-weather-li"><p class="day-weather-airQuality">优</p></li>
            </ul>
          </div>
          <!--time-23-->
          <div class="weather-box">
            <ul class="day-weather-ul">
              <li class="day-weather-li"><p class="day-weather-time">18:00</p></li>
              <li class="day-weather-li"><p class="day-weather-temperature">28℃</p></li>
              <li class="day-weather-li"><img class="day-weather-weather" src="../assets/sun to cloud.png"></li>
              <li class="day-weather-li"><p class="day-weather-windDirection">1级</p></li>
              <li class="day-weather-li"><p class="day-weather-airQuality">优</p></li>
            </ul>
          </div>
          <!--time-24-->
          <div class="weather-box">
            <ul class="day-weather-ul">
              <li class="day-weather-li"><p class="day-weather-time">18:00</p></li>
              <li class="day-weather-li"><p class="day-weather-temperature">28℃</p></li>
              <li class="day-weather-li"><img class="day-weather-weather" src="../assets/sun to cloud.png"></li>
              <li class="day-weather-li"><p class="day-weather-windDirection">1级</p></li>
              <li class="day-weather-li"><p class="day-weather-airQuality">优</p></li>
            </ul>
          </div>
        </div>
      </div>
    </div>

    <div id="link-two"></div>

    <div id="weather-content2">
      <div id="day-weather-trend">
        <div id="container1"></div>
      </div>
      <div id="week-weather-trend">
        <div id="container2"></div>
      </div>
        <div id="system-propose">   <!--生活建议-->
          <div class = tipsDiv>
            <ul>
            <li>
              <p class = 'tipsText'>生活建议</p>
            </li>
          </ul>
          </div>
          <div class = 'tipsRetrace'>
            <div class="wrapper">
              <ul>
                <li class="retrace">
                  <div class='picBox'>
                    <div class='show'>
                      <img style="width:90px;height: 90px " src="../assets/pic1.png">
                      <div class='hide'>
                        <h3>
                          Picture1
                        </h3>
                      </div>
                    </div>
                  </div>
                </li>
              </ul>
            </div>
          </div>

        </div>
    </div>
  </div>
</template>

<!--<script src="https://code.highcharts.com.cn/highcharts/highcharts.js"></script>-->
<!--<script src="https://code.highcharts.com.cn/highcharts/modules/exporting.js"></script>-->
<!--<script src="https://code.highcharts.com.cn/highcharts/modules/oldie.js"></script>-->
<!--<script src="https://code.highcharts.com.cn/highcharts-plugins/highcharts-zh_CN.js"></script>-->
<script>
import $ from 'jquery'
import F from '../js/demo'
import Highcharts from 'highcharts'
// import $ from "jquery"

export default {
  name: 'Hello',
  data () {
    return {
      name: 'Ne',
      list: []
    }
  },
  mounted () {
    // eslint-disable-next-line no-new
    var a = new F($('li.retrace'))
    a.init()
    console.log(this.name)

    var chart1 = Highcharts.chart('container1', {
      chart: {
        type: 'line'
      },
      title: {
        text: '日平均气温'
      },
      xAxis: {
        categories: ['1:00', '2:00', '3:00', '4:00', '5:00', '6:00', '7:00', '8:00', '9:00', '10:00', '11:00', '12:00']
      },
      yAxis: {
        title: {
          text: '气温 (°C)'
        }
      },
      plotOptions: {
        line: {
          dataLabels: {
            // 开启数据标签
            enabled: true
          },
          // 关闭鼠标跟踪，对应的提示框、点击事件会失效
          enableMouseTracking: false
        }
      },
      series: [{
        name: '气温',
        data: [7.0, 6.9, 9.5, 14.5, 18.4, 21.5, 25.2, 7.0, 6.9, 9.5, 6.9, 9.5]
      }]
    })

    var chart2 = Highcharts.chart('container2', {
      chart: {
        type: 'line'
      },
      title: {
        text: '周平均气温'
      },
      xAxis: {
        categories: ['周一', '周二', '周三', '周四', '周五', '周六', '周日']
      },
      yAxis: {
        title: {
          text: '气温 (°C)'
        }
      },
      plotOptions: {
        line: {
          dataLabels: {
            // 开启数据标签
            enabled: true
          },
          // 关闭鼠标跟踪，对应的提示框、点击事件会失效
          enableMouseTracking: false
        }
      },
      series: [{
        name: '最高气温',
        data: [7.0, 6.9, 9.5, 14.5, 18.4, 21.5, 25.2]
      }, {
        name: '最低气温',
        data: [3.9, 4.2, 5.7, 8.5, 11.9, 15.2, 17.0]
      }]
    })
  },
  methods: {

  }
}

</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  @import "../css/index.css";
  @import "../css/demo.css";
</style>
