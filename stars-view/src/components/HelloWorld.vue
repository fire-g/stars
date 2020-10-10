<template>
  <div id="body">
    <div id="header">
      <div id="header-title">
        <img class="img-logo" src="../assets/logo.png" alt="">
        <label>
          <input id="city-name" class="city-place" type="text" placeholder="搜索市、区、县等" list="placeholder" value="新建">
        </label>
        <datalist id="placeholder">
          <option value="南昌-上饶"/>
          <option value="南昌-宜春"/>
          <option value="南昌-新余"/>
          <option value="南昌-广丰"/>
          <option value="重庆-重庆"/>
          <option value="北京/北京/北京"/>
          <option value="北京/北京/海淀"/>
          <option value="北京/北京/朝阳"/>
          <option value="北京/北京/顺义"/>
          <option value="北京/北京/怀柔"/>
          <option value="北京/北京/通州"/>
          <option value="北京/北京/昌平"/>
          <option value="北京/北京/延庆"/>
          <option value="北京/北京/丰台"/>
        </datalist>
        <input id="aaa" class="bbb" type="button" @click="getCityName()" value="搜索">
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
              <span class="txt-now-place" id="txt-now-place">{{adm1}} {{adm2}} {{city_name}}</span>
            </div>
          </div>
          <div id="content-current-right">
            <img v-if=" weather == '多云'" class="img-weather" src="../assets/weather/sun-cloudy.png" alt="">  <!--天气图标-->
            <img v-else-if=" weather == '晴'" class="img-weather" src="../assets/weather/sun.png" alt="">
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
              <ul><li><p class='tipsText'>生活建议</p></li></ul>
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
                        下雨了,注意带伞
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
                        虽然温度适宜,可不要松懈哦
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
                        风力较大,洗车后会蒙上灰尘
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
                        涂擦SPF20以上,PA++护肤品,避强光
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
                        天气正好，出去运动放松一下吧
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
                        建议穿长袖衬衫单裤等服装
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

var chart1
var chart2

export default {
  data () {
    return {
      city_id: 101240102,
      city_name: '新建',
      adm1: '',
      adm2: '',
      list: [],
      temperature: '',
      weather: '',
      day_weather_low: '',
      day_weather_high: '',
      wind_direction: '',
      wind_scale: '',
      humidity: '',
      air_quality: '良',
      today_data: [],
      today_temperature: [],
      week_data: [],
      week_weather_low: [],
      week_weather_high: [],
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
      url: '/api/weather/' + this.city_id
    }).then((response) => {
      const res = response.data
      this.temperature = res.temp
      this.weather = res.text
      this.wind_direction = res.windDir
      this.wind_scale = res.windScale
      this.humidity = res.humidity
    })

    this.$ajax({
      method: 'GET',
      url: '/api/location/' + this.city_id
    }).then((response) => {
      const res = response.data
      this.city_name = res[0].name
      this.adm1 = res[0].adm1
      this.adm2 = res[0].adm2
    })

    this.$ajax({
      method: 'GET',
      url: '/api/hourly_weather/' + this.city_id
    }).then((response) => {
      const res = response.data
      this.daily_weather = res
      var i
      var j
      for (i = 0; i < 24; i++) {
        this.daily_weather[i].fxDate = res[i].fxDate
      }
      for (i = 0, j = 0; i < 24; i = i + 2, j++) {
        this.today_data[j] = res[i].fxDate
        this.today_temperature[j] = res[i].temp
      }
      chart1.xAxis[0].setCategories(this.today_data)
      chart1.series[0].setData(this.today_temperature)
      this.daily_weather[0].fxDate = '现在'
    })

    this.$ajax({
      method: 'GET',
      url: '/api/forecast_weather/' + this.city_id
    }).then((response) => {
      const res = response.data
      var i
      this.day_weather_low = res[0].tempMin
      this.day_weather_high = res[0].tempMax
      for (i = 0; i < 7; i++) {
        this.week_weather_low[i] = res[i].tempMin
        this.week_weather_high[i] = res[i].tempMax
        this.week_data[i] = res[i].fxDate.substring(5, 11)
      }
      chart2.xAxis[0].setCategories(this.week_data)
      chart2.series[0].setData(this.week_weather_low)
      chart2.series[1].setData(this.week_weather_high)
    })
  },
  mounted () {
    const a = new F($('li.retrace'))
    a.init()

    // 日平均气温
    chart1 = new Highcharts.Chart('container1', {
      chart: {
        type: 'line',
        backgroundColor: 'rgba(255,255,255,0.3)',
        borderRadius: 10
      },
      credits: {
        enabled: false
      },
      title: {
        text: '未来24小时温度变化'
      },
      xAxis: {
        categories: []
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
        data: []
      }]
    })

    // 周平均气温
    chart2 = new Highcharts.Chart('container2', {
      chart: {
        type: 'line',
        backgroundColor: 'rgba(255,255,255,0.3)',
        borderRadius: 10
      },
      credits: {
        enabled: false
      },
      title: {
        text: '未来一周温度变化'
      },
      xAxis: {
        categories: []
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
        data: []
      }, {
        name: '最低气温',
        data: []
      }]
    })
  },
  methods: {
    getCityName () {
      var name = document.getElementById('city-name').value
      this.$ajax({
        method: 'GET',
        url: '/api/location/' + name
      }).then((response) => {
        const res = response.data
        this.city_id = res[0].locationId
      })

      this.$ajax({
        method: 'GET',
        url: '/api/weather/' + this.city_id
      }).then((response) => {
        const res = response.data
        this.temperature = res.temp
        this.weather = res.text
        this.wind_direction = res.windDir
        this.wind_scale = res.windScale
        this.humidity = res.humidity
      })

      this.$ajax({
        method: 'GET',
        url: '/api/location/' + this.city_id
      }).then((response) => {
        const res = response.data
        this.city_name = res[0].name
        this.adm1 = res[0].adm1
        this.adm2 = res[0].adm2
      })

      this.$ajax({
        method: 'GET',
        url: '/api/hourly_weather/' + this.city_id
      }).then((response) => {
        const res = response.data
        this.daily_weather = res
        var i
        var j
        for (i = 0; i < 24; i++) {
          this.daily_weather[i].fxDate = res[i].fxDate
        }
        for (i = 0, j = 0; i < 24; i = i + 2, j++) {
          this.today_data[j] = res[i].fxDate
          this.today_temperature[j] = res[i].temp
        }
        chart1.xAxis[0].setCategories(this.today_data)
        chart1.series[0].setData(this.today_temperature)
        this.daily_weather[0].fxDate = '现在'
      })

      this.$ajax({
        method: 'GET',
        url: '/api/forecast_weather/' + this.city_id
      }).then((response) => {
        const res = response.data
        var i
        this.day_weather_low = res[0].tempMin
        this.day_weather_high = res[0].tempMax
        for (i = 0; i < 7; i++) {
          this.week_weather_low[i] = res[i].tempMin
          this.week_weather_high[i] = res[i].tempMax
          this.week_data[i] = res[i].fxDate.substring(5, 11)
        }
        chart2.xAxis[0].setCategories(this.week_data)
        chart2.series[0].setData(this.week_weather_low)
        chart2.series[1].setData(this.week_weather_high)
      })
    },

    button () {
      var name = document.getElementById('city-name').value
      console.log(name)
    }
  }
}

</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  @import "../css/index.css";
  @import "../css/demo.css";
</style>
