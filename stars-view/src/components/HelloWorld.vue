<template>
  <div id="body">
    <div id="header">
      <div id="header-title">
        <img class="img-logo" src="../assets/logo.png" alt="">
        <input id="confirm" class="confirm" type="button" @click="getCityId()" value="确认查询">
        <label>
          <input id="city-name" class="city-place" type="text" placeholder="搜索市、区、县等" list="placeholder" value="" @change="getCityName()">
        </label>
        <datalist id="placeholder"></datalist>
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
            <div class="content-tips">  <!--建议-->
            </div>
            <div class="content-locate">
              <img class="img-nowPlace small-components-logo" src="../assets/now_place.png" alt="">
              <span class="txt-now-place" id="txt-now-place">{{adm1}} {{adm2}} {{city_name}}</span>
              <img class="voice" @click='uploadVoice()' alt="">
            </div>   <!--当前位置-->
          </div>
          <div id="content-current-right">
            <img v-if="weather == '多云' " class="img-weather" src="../assets/index/101.png" alt="">  <!--天气图标-->
            <img v-else-if=" weather == '晴'" class="img-weather" src="../assets/index/100.png" alt="">
            <img v-else-if=" weather == '少云'" class="img-weather" src="../assets/index/102.png" alt="">
            <img v-else-if=" weather == '晴间多云'" class="img-weather" src="../assets/index/103.png" alt="">
            <img v-else-if=" weather == '阴'" class="img-weather" src="../assets/index/104.png" alt="">
            <img v-else-if=" weather == '阵雨'" class="img-weather" src="../assets/index/300.png" alt="">
            <img v-else-if=" weather == '强阵雨'" class="img-weather" src="../assets/index/301.png" alt="">
            <img v-else-if=" weather == '雷阵雨'" class="img-weather" src="../assets/index/302.png" alt="">
            <img v-else-if=" weather == '强雷阵雨'" class="img-weather" src="../assets/index/303.png" alt="">
            <img v-else-if=" weather == '强雷阵雨伴有冰雹'" class="img-weather" src="../assets/index/304.png" alt="">
            <img v-else-if=" weather == '小雨'" class="img-weather" src="../assets/index/305.png" alt="">
            <img v-else-if=" weather == '中雨'" class="img-weather" src="../assets/index/306.png" alt="">
            <img v-else-if=" weather == '大雨'" class="img-weather" src="../assets/index/307.png" alt="">
            <img v-else-if=" weather == '极端降雨'" class="img-weather" src="../assets/index/308.png" alt="">
            <img v-else-if=" weather == '毛毛雨'" class="img-weather" src="../assets/index/309.png" alt="">
            <img v-else-if=" weather == '暴雨'" class="img-weather" src="../assets/index/310.png" alt="">
            <img v-else-if=" weather == '大暴雨'" class="img-weather" src="../assets/index/311.png" alt="">
            <img v-else-if=" weather == '特大暴雨'" class="img-weather" src="../assets/index/312.png" alt="">
            <img v-else-if=" weather == '冻雨'" class="img-weather" src="../assets/index/313.png" alt="">
            <img v-else-if=" weather == '小到中雨'" class="img-weather" src="../assets/index/314.png" alt="">
            <img v-else-if=" weather == '中到大雨'" class="img-weather" src="../assets/index/315.png" alt="">
            <img v-else-if=" weather == '大到暴雨'" class="img-weather" src="../assets/index/316.png" alt="">
            <img v-else-if=" weather == '暴雨到大暴雨'" class="img-weather" src="../assets/index/317.png" alt="">
            <img v-else-if=" weather == '大暴雨到特大暴雨'" class="img-weather" src="../assets/index/318.png" alt="">
            <img v-else-if=" weather == '雨'" class="img-weather" src="../assets/index/399.png" alt="">
            <img v-else-if=" weather == '小雪'" class="img-weather" src="../assets/index/400.png" alt="">
            <img v-else-if=" weather == '中雪'" class="img-weather" src="../assets/index/401.png" alt="">
            <img v-else-if=" weather == '大雪'" class="img-weather" src="../assets/index/402.png" alt="">
            <img v-else-if=" weather == '暴雪'" class="img-weather" src="../assets/index/403.png" alt="">
            <img v-else-if=" weather == '雨夹雪'" class="img-weather" src="../assets/index/404.png" alt="">
            <img v-else-if=" weather == '雨雪天气'" class="img-weather" src="../assets/index/405.png" alt="">
            <img v-else-if=" weather == '阵雨夹雪'" class="img-weather" src="../assets/index/406.png" alt="">
            <img v-else-if=" weather == '阵雪'" class="img-weather" src="../assets/index/407.png" alt="">
            <img v-else-if=" weather == '小到中雪'" class="img-weather" src="../assets/index/408.png" alt="">
            <img v-else-if=" weather == '中到大雪'" class="img-weather" src="../assets/index/409.png" alt="">
            <img v-else-if=" weather == '大到暴雪'" class="img-weather" src="../assets/index/410.png" alt="">
            <img v-else-if=" weather == '雪'" class="img-weather" src="../assets/index/499.png" alt="">
            <img v-else-if=" weather == '阵雨夹雪'" class="img-weather" src="../assets/index/456.png" alt="">
            <img v-else-if=" weather == '阵雪'" class="img-weather" src="../assets/index/457.png" alt="">
            <img v-else-if=" weather == '薄雾'" class="img-weather" src="../assets/index/500.png" alt="">
            <img v-else-if=" weather == '雾'" class="img-weather" src="../assets/index/501.png" alt="">
            <img v-else-if=" weather == '霾'" class="img-weather" src="../assets/index/502.png" alt="">
            <img v-else-if=" weather == '扬沙'" class="img-weather" src="../assets/index/503.png" alt="">
            <img v-else-if=" weather == '浮尘'" class="img-weather" src="../assets/index/504.png" alt="">
            <img v-else-if=" weather == '沙尘暴'" class="img-weather" src="../assets/index/507.png" alt="">
            <img v-else-if=" weather == '强沙尘暴'" class="img-weather" src="../assets/index/508.png" alt="">
            <img v-else-if=" weather == '浓雾'" class="img-weather" src="../assets/index/509.png" alt="">
            <img v-else-if=" weather == '强浓雾'" class="img-weather" src="../assets/index/510.png" alt="">
            <img v-else-if=" weather == '中度霾'" class="img-weather" src="../assets/index/511.png" alt="">
            <img v-else-if=" weather == '重度霾'" class="img-weather" src="../assets/index/512.png" alt="">
            <img v-else-if=" weather == '严重霾'" class="img-weather" src="../assets/index/513.png" alt="">
            <img v-else-if=" weather == '大雾'" class="img-weather" src="../assets/index/514.png" alt="">
            <img v-else-if=" weather == '特强浓雾'" class="img-weather" src="../assets/index/515.png" alt="">
            <img v-else-if=" weather == '热'" class="img-weather" src="../assets/index/900.png" alt="">
            <img v-else-if=" weather == '冷'" class="img-weather" src="../assets/index/901.png" alt="">
            <img v-else class="img-weather" src="../assets/index/999.png" alt="">
          </div> <!-- 当前天气图标 -->
        </div>
        <!--变色当前位置now place cover.png-->
        <!--变色语音播报speech sound cover.png-->
      </div>
    </div>

    <div id="weather-content1">
      <div id="day-weather">
        <div class="day-weather-list">
          <div class="more-weather-nav">
            <p id = 'titleText'>
              逐小时预报
            </p>
          </div>
          <!--time-1-->
         <div class = 'more-weather'>
           <div class="weather-box"  v-for="item in daily_weather" v-bind:key="item.id">
             <ul class="day-weather-ul">
               <li class="day-weather-li"><p class="day-weather-time" style="font-size: 16px">{{item.fxDate}}</p></li>
               <li class="day-weather-li"><p class="day-weather-temperature" style="font-size: 20px">{{item.temp}}℃</p></li>
               <li class="day-weather-li"><img class="day-weather-weather" src="../assets/weather/thundershower.png" style="width: 32px;height: 32px" alt=""></li>
               <li class="day-weather-li"><p class="day-weather-windDirection" style="font-size: 16px">{{item.text}}</p></li>
               <!--<li class="day-weather-li"><p class="day-weather-windDirection" style="font-size: 14px">{{item.windScale}}级</p></li>-->
             </ul>
           </div>
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
              <p id='tipsText'>生活建议</p>
        </div>
        <div class='tipsRetrace'>
          <div class="wrapper">
            <ul class="retraceUl">
              <li class="retrace">
                <div class='picBox'>
                  <div class='show'>
                    <div class='picContent'>
                      <img class='picture' src="../assets/yusan.png">
                      <p v-if="isYS == true" class="picTitle">雨伞&nbsp;需要</p>
                      <p v-else class="picTitle">雨伞&nbsp;不需要</p>
                    </div>
                    <div class='hide'>
                      <h3 v-if="isYS == true" >
                        下雨了,注意带伞
                      </h3>
                      <h3 v-else >
                        今天的你可不需要雨伞呢
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
                      <p v-if="isGM == true" class="picTitle">感冒&nbsp;容易</p>
                      <p v-else class="picTitle">感冒&nbsp;不易</p>
                    </div>
                    <div class='hide'>
                      <h3 v-if="isGM == true">
                        今天有点冷，注意穿衣来抵御感冒哦
                      </h3>
                      <h3 v-else>
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
                      <p v-if="isXC == true" class="picTitle">洗车&nbsp;适宜</p>
                      <p v-else class="picTitle">洗车&nbsp;不适宜</p>
                    </div>
                    <div class='hide'>
                      <h3 v-if="isXC == true">
                        今天风力较小,洗完车可以让爱车发光呢
                      </h3>
                      <h3 v-else>
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
                      <p v-if="isFS == false" class="picTitle">防晒&nbsp;适宜</p>
                      <p v-else class="picTitle">防晒&nbsp;强烈</p>
                    </div>
                    <div class='hide'>
                      <h3 v-if="isFS == false">
                        阳光正好，让我们一起欢快的跑
                      </h3>
                      <h3 v-else>
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
                      <p v-if="isYD == true" class="picTitle">运动&nbsp;适宜</p>
                      <p v-else class="picTitle">运动&nbsp;不适</p>
                    </div>
                    <div class='hide'>
                      <h3 v-if="isYD == true">
                        天气正好，出去运动放松一下吧
                      </h3>
                      <h3 v-else>
                        今天比较适合呆在室内哦
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
                      <p v-if="isCY == 0" class="picTitle">穿衣&nbsp;短袖</p>
                      <p v-else-if="isCY == 1" class="picTitle">穿衣&nbsp;长袖</p>
                      <p v-else-if="isCY == 2" class="picTitle">穿衣&nbsp;夹克</p>
                      <p v-else class="picTitle">穿衣&nbsp;棉袄</p>
                    </div>

                    <div class='hide'>
                      <h3 v-if="isCY == 0">
                        天气较热,建议穿短袖短裤散热=-=
                      </h3>
                      <h3 v-else-if="isCY == 1">
                        温度适宜,当然是长袖短裤啦
                      </h3>
                      <h3 v-else-if="isCY == 2">
                        温度逐渐凉爽,记得披件夹克哦
                      </h3>
                      <h3 v-else>
                        天气都这么冷了,大棉袄还不整上qaq
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
      city_name: '',
      adm1: '',
      adm2: '',
      lookup_city: [
        {
          'locationId': '',
          'place': ''
        }
      ],
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
      isYS: false,
      isGM: false,
      isXC: false,
      isFS: false,
      isYD: false,
      isCY: 0,
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
      if (this.temperature > 30) {
        this.isCY = 0
      } else if (this.temperature > 20) {
        this.isCY = 1
      } else if (this.temperature > 10) {
        this.isCY = 2
      } else {
        this.isCY = 3
        this.isGM = true
      }
      if (this.wind_scale <= 4) {
        this.isXC = true
      }
      if (this.weather.equals('晴') || this.weather.equals('多云') || this.weather.equals('阴')) {
        this.isYD = true
      }
      if (this.weather.equals('晴') && this.temperature > 35) {
        this.isFS = true
      }
      if (this.weather.equals('小雨') || this.weather.equals('大雨') || this.weather.equals('中雨') ||
        this.weather.equals('暴雨') || this.weather.equals('雨')) {
        this.isYS = true
      }
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
        text: '未来12小时温度变化'
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
    getCityId () {
      var name = document.getElementById('city-name').value
      var result = name.split('/')
      name = result[0]
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
        if (this.temperature > 30) {
          this.isCY = 0
        } else if (this.temperature > 20) {
          this.isCY = 1
        } else if (this.temperature > 10) {
          this.isCY = 2
        } else {
          this.isCY = 3
          this.isGM = true
        }
        if (this.wind_scale < 4) {
          this.isXC = true
        }
        if (this.weather.equals('晴') || this.weather.equals('多云') || this.weather.equals('阴')) {
          this.isYD = true
        }
        if (this.weather.equals('晴') && this.temperature > 35) {
          this.isFS = true
        }
        if (this.weather.equals('小雨') || this.weather.equals('大雨') || this.weather.equals('中雨') ||
          this.weather.equals('暴雨') || this.weather.equals('雨')) {
          this.isYS = true
        }
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

    getCityName () {
      var name = document.getElementById('city-name').value
      var result = name.split('/')
      name = result[0]
      this.$ajax({
        method: 'GET',
        url: '/api/location/' + name
      }).then((response) => {
        const res = response.data
        var i
        for (i = 0; i < res.length; i++) {
          this.lookup_city[i] = res[i].name + '/' + res[i].adm2 + '/' + res[i].adm1
          this.locationId = res.locationId
        }
        $('#placeholder').empty()
        for (i = 0; i < this.lookup_city.length; i++) {
          $('#placeholder').append('<option value="' + this.lookup_city[i] + '"></option>')
        }
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
