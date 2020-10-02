<template>
  <div id="body">
    <div id="header">
      <div id="header-title">
        <img class="img-logo" src="../assets/logo.png" alt="">
        <label>
          <input class="city-place" type="text" placeholder="搜索市、区、县等" list="placeholder">
        </label>
        <datalist id="placeholder">
          <option value="南昌-上饶"/>
          <option value="南昌-宜春"/>
          <option value="南昌-新余"/>
          <option value="南昌-广丰"/>
          <option value="重庆-重庆"/>
        </datalist>
      </div>
      <div id="link-one"></div>
      <div id="header-content">
        <div id="content-current">
          <div id="content-current-left">
            <!--当时天气详情-->
            <div class="content-temperature">
              <p class="text-temperature">{{temperature}}℃</p>
              <input type="hidden" v-model="weather">
              <p class="text-weather">{{weather}}</p>
            </div>
            <!--最高 / 最低 温度-->
            <div class="content-maximumTemperature">
              <p class="text-up-low">{{day_weather_low}}℃ / {{day_weather_high}}℃</p>
            </div>
            <div class="content-other">
              <!--风向-->
              <p class="item">
                <img class="icon windDirection" src="../assets/wind direction.png" alt="">
                <span class="txt">{{wind_direction}} {{wind_scale}}级</span>
              </p>
              <!--湿度-->
              <p class="item">
                <img class="icon windDirection" src="../assets/humidity.png" alt="">
                <span class="txt">湿度&nbsp;{{humidity}}%</span>
              </p>
              <!--空气质量-->
              <p class="item">
                <img class="icon windDirection" src="../assets/air quality.png" alt="">
                <span class="txt">空气质量&nbsp;{{air_quality}}</span>
              </p>
            </div>
            <!--建议-->
            <div class="content-tips">
            </div>
            <!--当前位置-->
            <div class="content-locate">
              <img class="img-nowPlace small-components-logo" src="../assets/now_place.png" alt="">
              <span class="txt-now-place" id="txt-now-place">{{city}}</span>
            </div>
          </div>
          <div id="content-current-right">
            <img class="img-weather" src="../assets/sun to cloud.png" alt="">  <!--天气图标-->
          </div>
        </div>
        <!--变色当前位置now place cover.png-->
        <!--变色语音播报speech sound cover.png-->
      </div>
    </div>

    <div id="weather-content1">
      <div id="day-weather">
        <div class="day-weather-list">
          <!--time-1-->
          <div class="weather-box"  v-for="item in daily_weather" v-bind:key="item.id">
            <ul class="day-weather-ul">
              <li class="day-weather-li"><p class="day-weather-time" style="font-size: 12px">{{item.fxDate}}</p></li>
              <li class="day-weather-li"><p class="day-weather-temperature" style="font-size: 20px">{{item.temp}}℃</p></li>
              <li class="day-weather-li"><img class="day-weather-weather" src="../assets/sun to cloud.png" style="width: 32px;height: 32px" alt=""></li>
              <li class="day-weather-li"><p class="day-weather-windDirection" style="font-size: 14px">{{item.text}}</p></li>
              <li class="day-weather-li"><p class="day-weather-windDirection" style="font-size: 14px">{{item.windScale}}级</p></li>
              <li class="day-weather-li"><p class="day-weather-airQuality" style="font-size: 14px">良</p></li>
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
        <div class=tipsDiv>
              <p class='tipsText'>生活建议</p>
        </div>
        <div class='tipsRetrace'>
          <div class="wrapper">
            <ul>
              <li class="retrace">
                <div class='picBox'>
                  <div class='show'>
                    <div class='picContent'>
                      <img class='picture' src="../assets/yusan.png">
                      <p class="picTitle">雨伞&nbsp;需要</p>
                    </div>
                    <div class='hide'>
                      <h3>
                        天冷注意穿衣
                      </h3>
                    </div>
                  </div>
                </div>
              </li>
              <li class="retrace">
                <div class='picBox'>
                  <div class='show'>
                    <div class='picContent'>
                      <img class='picture' src="../assets/yao.png">
                      <p class="picTitle">感冒&nbsp;不易</p>
                    </div>
                    <div class='hide'>
                      <h3>
                        Picture1
                      </h3>
                    </div>
                  </div>
                </div>
              </li>
              <li class="retrace">
                <div class='picBox'>
                  <div class='show'>
                    <div class='picContent'>
                      <img class='picture' src="../assets/car.png">
                      <p class="picTitle">洗车&nbsp;适宜</p>
                    </div>
                    <div class='hide'>
                      <h3>
                        Picture1
                      </h3>
                    </div>
                  </div>
                </div>
              </li>
              <li class="retrace">
                <div class='picBox'>
                  <div class='show'>
                    <div class='picContent'>
                      <img class='picture' src="../assets/taiyang.png">
                      <p class="picTitle">防晒&nbsp;适宜</p>
                    </div>
                    <div class='hide'>
                      <h3>
                        Picture1
                      </h3>
                    </div>
                  </div>
                </div>
              </li>
              <li class="retrace">
                <div class='picBox'>
                  <div class='show'>
                    <div class='picContent'>
                      <img class='picture' src="../assets/basketball.png">
                      <p class="picTitle">运动&nbsp;适宜</p>
                    </div>
                    <div class='hide'>
                      <h3>
                        Picture1
                      </h3>
                    </div>
                  </div>
                </div>
              </li>
              <li class="retrace">
                <div class='picBox'>
                  <div class='show'>
                    <div class='picContent'>
                      <img class='picture' src="../assets/clother.png">
                      <p class="picTitle">穿衣&nbsp;长袖</p>
                    </div>

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

<script>
import $ from 'jquery'
import F from '../js/demo'
import Highcharts from 'highcharts'

export default {
  name: 'Hello',
  data () {
    return {
      name: 'Ne',
      list: [],
      city: '江西省 南昌市 新建区',
      temperature: '',
      weather: '',
      day_weather_low: '',
      day_weather_high: '',
      wind_direction: '',
      wind_scale: '',
      humidity: '',
      air_quality: '良',
      today_temperature: [7.0, 6.9, 9.5, 14.5, 18.4, 21.5, 25.2, 7.0, 6.9, 9.5, 6.9, 9.5],
      week_data: ['周一', '周二', '周三', '周四', '周五', '周六', '周日'],
      week_weather_low: [0, 0, 0, 0, 0, 0, 0],
      week_weather_high: [0, 0, 0, 0, 0, 0, 0],
      daily_weather: [
        {
          'id': '',
          'date': '',
          'fxDate': '',
          'temp': '',
          'text': '',
          'windDir': '',
          'windScale': '',
          'windSpeed': '',
          'humidity': '',
          'pop': '',
          'precip': '',
          'pressure': '',
          'cloud': '',
          'dew': '',
          'locationId': ''
        }]
    }
  },
  created: function () {
    this.$ajax({
      method: 'GET',
      url: '/api/weather/101240312'
    }).then((response) => {
      const res = response.data
      this.temperature = res.temp
      this.weather = res.text
      this.day_weather_low = res.temp
      this.day_weather_high = res.temp
      this.wind_direction = res.windDir
      this.wind_scale = res.windScale
      this.humidity = res.humidity
    })

    this.$ajax({
      method: 'GET',
      url: '/api/hourly_weather/101240101'
    }).then((response) => {
      const res = response.data
      this.daily_weather = res
      var i
      for (i = 0; i < 24; i++) {
        this.daily_weather[i].fxDate = res[i].fxDate.substring(11, 16)
      }
      this.daily_weather[0].fxDate = '现在'
    })

    this.$ajax({
      method: 'GET',
      url: '/api/forecast_weather/101240312'
    }).then((response) => {
      const res = response.data
      var i
      for (i = 0; i < 7; i++) {
        this.week_weather_low[i] = res[i].tempMin
        this.week_weather_high[i] = res[i].tempMax
        this.week_data[i] = res[i].fxDate.substring(5, 10)
      }
      console.log(this.week_data)
      console.log(this.week_weather_low)
      console.log(this.week_weather_high)
    })
  },
  mounted () {
    // eslint-disable-next-line no-new
    const a = new F($('li.retrace'))
    a.init()

    // 日平均气温
    Highcharts.chart('container1', {
      chart: {
        type: 'line'
        backgroundColor: 'rgba(255,255,255,0.3)',
        borderRadius: '10px'
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
        // eslint-disable-next-line no-undef
        data: this.today_temperature
      }]
    })

    // 周平均气温
    Highcharts.chart('container2', {
      chart: {
        type: 'line'
        backgroundColor: 'rgba(255,255,255,0.3)',
        borderRadius: '10px'
      },
      title: {
        text: '周平均气温'
      },
      xAxis: {
        categories: this.week_data
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
        data: this.week_weather_high
      }, {
        name: '最低气温',
        data: this.week_weather_low
      }]
    })
  },
  methods: {
    getDayWeather () {
      this.$ajax({
        method: 'GET',
        url: '/api/weather/101240312'
      }).then((response) => {
        const res = response.data
        console.log(res)
        this.temperature = res.temp
        this.weather = res.text
        this.day_weather_low = res.temp
        this.day_weather_high = res.temp
        this.wind_direction = res.windDir
        this.humidity = res.humidity
        console.log(this.weather)
      })
    }
  }
}

</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  @import "../css/index.css";
  @import "../css/demo.css";
</style>
