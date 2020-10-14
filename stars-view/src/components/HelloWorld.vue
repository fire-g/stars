<template>
  <div id="body">
    <div id="header">
      <div id="link-one"></div>
      <div id="header-content">
        <div id="content-current">
          <div id="content-current-left">
            <!--当时天气详情-->
            <div class="content-temperature">
              <p v-if="this.temperatureType == '摄氏度'" class="text-temperature">{{temperature}}℃</p>
              <p v-else class="text-temperature">{{temperature}}℉</p>
              <input type="hidden" v-model="weather">
              <p class="text-weather">{{weather}}</p>
            </div>
            <!--最高 / 最低 温度-->
            <div class="content-maximumTemperature">
              <p v-if="this.temperatureType == '摄氏度'" class="text-up-low">{{day_weather_low}}℃ / {{day_weather_high}}℃</p>
              <p v-else class="text-up-low">{{day_weather_low}}℉ / {{day_weather_high}}℉</p>
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
            <img v-if="weather === '多云' " class="img-weather" src="../assets/index/101.png" alt="">  <!--天气图标-->
            <img v-else-if=" weather === '晴'" class="img-weather" src="../assets/index/100.png" alt="">
            <img v-else-if=" weather === '少云'" class="img-weather" src="../assets/index/102.png" alt="">
            <img v-else-if=" weather === '晴间多云'" class="img-weather" src="../assets/index/103.png" alt="">
            <img v-else-if=" weather === '阴'" class="img-weather" src="../assets/index/104.png" alt="">
            <img v-else-if=" weather === '阵雨'" class="img-weather" src="../assets/index/300.png" alt="">
            <img v-else-if=" weather === '强阵雨'" class="img-weather" src="../assets/index/301.png" alt="">
            <img v-else-if=" weather === '雷阵雨'" class="img-weather" src="../assets/index/302.png" alt="">
            <img v-else-if=" weather === '强雷阵雨'" class="img-weather" src="../assets/index/303.png" alt="">
            <img v-else-if=" weather === '强雷阵雨伴有冰雹'" class="img-weather" src="../assets/index/304.png" alt="">
            <img v-else-if=" weather === '小雨'" class="img-weather" src="../assets/index/305.png" alt="">
            <img v-else-if=" weather === '中雨'" class="img-weather" src="../assets/index/306.png" alt="">
            <img v-else-if=" weather === '大雨'" class="img-weather" src="../assets/index/307.png" alt="">
            <img v-else-if=" weather === '极端降雨'" class="img-weather" src="../assets/index/308.png" alt="">
            <img v-else-if=" weather === '毛毛雨'" class="img-weather" src="../assets/index/309.png" alt="">
            <img v-else-if=" weather === '暴雨'" class="img-weather" src="../assets/index/310.png" alt="">
            <img v-else-if=" weather === '大暴雨'" class="img-weather" src="../assets/index/311.png" alt="">
            <img v-else-if=" weather === '特大暴雨'" class="img-weather" src="../assets/index/312.png" alt="">
            <img v-else-if=" weather === '冻雨'" class="img-weather" src="../assets/index/313.png" alt="">
            <img v-else-if=" weather === '小到中雨'" class="img-weather" src="../assets/index/314.png" alt="">
            <img v-else-if=" weather === '中到大雨'" class="img-weather" src="../assets/index/315.png" alt="">
            <img v-else-if=" weather === '大到暴雨'" class="img-weather" src="../assets/index/316.png" alt="">
            <img v-else-if=" weather === '暴雨到大暴雨'" class="img-weather" src="../assets/index/317.png" alt="">
            <img v-else-if=" weather === '大暴雨到特大暴雨'" class="img-weather" src="../assets/index/318.png" alt="">
            <img v-else-if=" weather === '雨'" class="img-weather" src="../assets/index/399.png" alt="">
            <img v-else-if=" weather === '小雪'" class="img-weather" src="../assets/index/400.png" alt="">
            <img v-else-if=" weather === '中雪'" class="img-weather" src="../assets/index/401.png" alt="">
            <img v-else-if=" weather === '大雪'" class="img-weather" src="../assets/index/402.png" alt="">
            <img v-else-if=" weather === '暴雪'" class="img-weather" src="../assets/index/403.png" alt="">
            <img v-else-if=" weather === '雨夹雪'" class="img-weather" src="../assets/index/404.png" alt="">
            <img v-else-if=" weather === '雨雪天气'" class="img-weather" src="../assets/index/405.png" alt="">
            <img v-else-if=" weather === '阵雨夹雪'" class="img-weather" src="../assets/index/406.png" alt="">
            <img v-else-if=" weather === '阵雪'" class="img-weather" src="../assets/index/407.png" alt="">
            <img v-else-if=" weather === '小到中雪'" class="img-weather" src="../assets/index/408.png" alt="">
            <img v-else-if=" weather === '中到大雪'" class="img-weather" src="../assets/index/409.png" alt="">
            <img v-else-if=" weather === '大到暴雪'" class="img-weather" src="../assets/index/410.png" alt="">
            <img v-else-if=" weather === '雪'" class="img-weather" src="../assets/index/499.png" alt="">
            <img v-else-if=" weather === '阵雨夹雪'" class="img-weather" src="../assets/index/456.png" alt="">
            <img v-else-if=" weather === '阵雪'" class="img-weather" src="../assets/index/457.png" alt="">
            <img v-else-if=" weather === '薄雾'" class="img-weather" src="../assets/index/500.png" alt="">
            <img v-else-if=" weather === '雾'" class="img-weather" src="../assets/index/501.png" alt="">
            <img v-else-if=" weather === '霾'" class="img-weather" src="../assets/index/502.png" alt="">
            <img v-else-if=" weather === '扬沙'" class="img-weather" src="../assets/index/503.png" alt="">
            <img v-else-if=" weather === '浮尘'" class="img-weather" src="../assets/index/504.png" alt="">
            <img v-else-if=" weather === '沙尘暴'" class="img-weather" src="../assets/index/507.png" alt="">
            <img v-else-if=" weather === '强沙尘暴'" class="img-weather" src="../assets/index/508.png" alt="">
            <img v-else-if=" weather === '浓雾'" class="img-weather" src="../assets/index/509.png" alt="">
            <img v-else-if=" weather === '强浓雾'" class="img-weather" src="../assets/index/510.png" alt="">
            <img v-else-if=" weather === '中度霾'" class="img-weather" src="../assets/index/511.png" alt="">
            <img v-else-if=" weather === '重度霾'" class="img-weather" src="../assets/index/512.png" alt="">
            <img v-else-if=" weather === '严重霾'" class="img-weather" src="../assets/index/513.png" alt="">
            <img v-else-if=" weather === '大雾'" class="img-weather" src="../assets/index/514.png" alt="">
            <img v-else-if=" weather === '特强浓雾'" class="img-weather" src="../assets/index/515.png" alt="">
            <img v-else-if=" weather === '热'" class="img-weather" src="../assets/index/900.png" alt="">
            <img v-else-if=" weather === '冷'" class="img-weather" src="../assets/index/901.png" alt="">
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
            <div class="title-text">
              <p id = 'titleText'>
                逐小时预报
              </p>
            </div>
            <div class="move-button">
              <span class="move-right" @click='clickRight()'></span>
              <span class="move-left" @click='clickLeft()'></span>
            </div>
          </div>
          <!--time-1-->
         <div class = 'more-weather'>
           <div class="weather-box"  v-for="(item,index) in daily_weather" v-bind:key="item.id" v-bind:id="weatherBox(index)">
             <ul class="day-weather-ul">
               <li class="day-weather-li"><p class="day-weather-time" style="font-size: 16px">{{item.fxDate}}</p></li>
               <li class="day-weather-li">
                 <p v-if="temperatureType == '摄氏度'" class="day-weather-temperature" style="font-size: 20px">{{item.temp}}℃</p>
                 <p v-else class="day-weather-temperature" style="font-size: 20px">{{item.temp}}℉</p>
               </li>
               <li class="day-weather-li">
                 <img v-if="item.text === '多云' " class="day-weather-weather" src="../assets/index/101.png" alt="">  <!--天气图标-->
                 <img v-else-if=" item.text === '晴'" class="day-weather-weather" src="../assets/index/100.png" alt="">
                 <img v-else-if=" item.text === '少云'" class="day-weather-weather" src="../assets/index/102.png" alt="">
                 <img v-else-if=" item.text === '晴间多云'" class="day-weather-weather" src="../assets/index/103.png" alt="">
                 <img v-else-if=" item.text === '阴'" class="day-weather-weather" src="../assets/index/104.png" alt="">
                 <img v-else-if=" item.text === '阵雨'" class="day-weather-weather" src="../assets/index/300.png" alt="">
                 <img v-else-if=" item.text === '强阵雨'" class="day-weather-weather" src="../assets/index/301.png" alt="">
                 <img v-else-if=" item.text === '雷阵雨'" class="day-weather-weather" src="../assets/index/302.png" alt="">
                 <img v-else-if=" item.text === '强雷阵雨'" class="day-weather-weather" src="../assets/index/303.png" alt="">
                 <img v-else-if=" item.text === '强雷阵雨伴有冰雹'" class="day-weather-weather" src="../assets/index/304.png" alt="">
                 <img v-else-if=" item.text === '小雨'" class="day-weather-weather" src="../assets/index/305.png" alt="">
                 <img v-else-if=" item.text === '中雨'" class="day-weather-weather" src="../assets/index/306.png" alt="">
                 <img v-else-if=" item.text === '大雨'" class="day-weather-weather" src="../assets/index/307.png" alt="">
                 <img v-else-if=" item.text === '极端降雨'" class="day-weather-weather" src="../assets/index/308.png" alt="">
                 <img v-else-if=" item.text === '毛毛雨'" class="day-weather-weather" src="../assets/index/309.png" alt="">
                 <img v-else-if=" item.text === '暴雨'" class="day-weather-weather" src="../assets/index/310.png" alt="">
                 <img v-else-if=" item.text === '大暴雨'" class="day-weather-weather" src="../assets/index/311.png" alt="">
                 <img v-else-if=" item.text === '特大暴雨'" class="day-weather-weather" src="../assets/index/312.png" alt="">
                 <img v-else-if=" item.text === '冻雨'" class="day-weather-weather" src="../assets/index/313.png" alt="">
                 <img v-else-if=" item.text === '小到中雨'" class="day-weather-weather" src="../assets/index/314.png" alt="">
                 <img v-else-if=" item.text === '中到大雨'" class="day-weather-weather" src="../assets/index/315.png" alt="">
                 <img v-else-if=" item.text === '大到暴雨'" class="day-weather-weather" src="../assets/index/316.png" alt="">
                 <img v-else-if=" item.text === '暴雨到大暴雨'" class="day-weather-weather" src="../assets/index/317.png" alt="">
                 <img v-else-if=" item.text === '大暴雨到特大暴雨'" class="day-weather-weather" src="../assets/index/318.png" alt="">
                 <img v-else-if=" item.text === '雨'" class="day-weather-weather" src="../assets/index/399.png" alt="">
                 <img v-else-if=" item.text === '小雪'" class="day-weather-weather" src="../assets/index/400.png" alt="">
                 <img v-else-if=" item.text === '中雪'" class="day-weather-weather" src="../assets/index/401.png" alt="">
                 <img v-else-if=" item.text === '大雪'" class="day-weather-weather" src="../assets/index/402.png" alt="">
                 <img v-else-if=" item.text === '暴雪'" class="day-weather-weather" src="../assets/index/403.png" alt="">
                 <img v-else-if=" item.text === '雨夹雪'" class="day-weather-weather" src="../assets/index/404.png" alt="">
                 <img v-else-if=" item.text === '雨雪天气'" class="day-weather-weather" src="../assets/index/405.png" alt="">
                 <img v-else-if=" item.text === '阵雨夹雪'" class="day-weather-weather" src="../assets/index/406.png" alt="">
                 <img v-else-if=" item.text === '阵雪'" class="day-weather-weather" src="../assets/index/407.png" alt="">
                 <img v-else-if=" item.text === '小到中雪'" class="day-weather-weather" src="../assets/index/408.png" alt="">
                 <img v-else-if=" item.text === '中到大雪'" class="day-weather-weather" src="../assets/index/409.png" alt="">
                 <img v-else-if=" item.text === '大到暴雪'" class="day-weather-weather" src="../assets/index/410.png" alt="">
                 <img v-else-if=" item.text === '雪'" class="day-weather-weather" src="../assets/index/499.png" alt="">
                 <img v-else-if=" item.text === '阵雨夹雪'" class="day-weather-weather" src="../assets/index/456.png" alt="">
                 <img v-else-if=" item.text === '阵雪'" class="day-weather-weather" src="../assets/index/457.png" alt="">
                 <img v-else-if=" item.text === '薄雾'" class="day-weather-weather" src="../assets/index/500.png" alt="">
                 <img v-else-if=" item.text === '雾'" class="day-weather-weather" src="../assets/index/501.png" alt="">
                 <img v-else-if=" item.text === '霾'" class="day-weather-weather" src="../assets/index/502.png" alt="">
                 <img v-else-if=" item.text === '扬沙'" class="day-weather-weather" src="../assets/index/503.png" alt="">
                 <img v-else-if=" item.text === '浮尘'" class="day-weather-weather" src="../assets/index/504.png" alt="">
                 <img v-else-if=" item.text === '沙尘暴'" class="day-weather-weather" src="../assets/index/507.png" alt="">
                 <img v-else-if=" item.text === '强沙尘暴'" class="day-weather-weather" src="../assets/index/508.png" alt="">
                 <img v-else-if=" item.text === '浓雾'" class="day-weather-weather" src="../assets/index/509.png" alt="">
                 <img v-else-if=" item.text === '强浓雾'" class="day-weather-weather" src="../assets/index/510.png" alt="">
                 <img v-else-if=" item.text === '中度霾'" class="day-weather-weather" src="../assets/index/511.png" alt="">
                 <img v-else-if=" item.text === '重度霾'" class="day-weather-weather" src="../assets/index/512.png" alt="">
                 <img v-else-if=" item.text === '严重霾'" class="day-weather-weather" src="../assets/index/513.png" alt="">
                 <img v-else-if=" item.text === '大雾'" class="day-weather-weather" src="../assets/index/514.png" alt="">
                 <img v-else-if=" item.text === '特强浓雾'" class="day-weather-weather" src="../assets/index/515.png" alt="">
                 <img v-else-if=" item.text === '热'" class="day-weather-weather" src="../assets/index/900.png" alt="">
                 <img v-else-if=" item.text === '冷'" class="day-weather-weather" src="../assets/index/901.png" alt="">
                 <img v-else class="day-weather-weather" src="../assets/index/999.png" alt="">
               </li>
               <li class="day-weather-li"><p class="day-weather-windDirection" style="font-size: 16px">{{item.text}}</p></li>
             </ul>
           </div>
         </div>
        </div>
      </div>
    </div>

    <div class="QRcode-outer">
      <div class="QRcode-inner">
        <img class="QRcode" src="../assets/index/100.png">
      </div>
    </div>
    <div class="wrap">
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
                      <img class='picture' src="../assets/yusan.png" alt="">
                      <p v-if="isYS === true" class="picTitle">雨伞&nbsp;需要</p>
                      <p v-else class="picTitle">雨伞&nbsp;不需要</p>
                    </div>
                    <div class='hide'>
                      <span v-if="isYS === true" >
                        下雨了,注意带伞
                      </span>
                      <span v-else >
                        今天的你可不需要雨伞呢
                      </span>
                    </div>
                  </div>
                </div>
              </li>
              <li class="retrace">
                <div class='picBox'>
                  <div class='show'>
                    <div class='picContent'>
                      <img class='picture' src="../assets/yao.png" alt="">
                      <p v-if="isGM === true" class="picTitle">感冒&nbsp;容易</p>
                      <p v-else class="picTitle">感冒&nbsp;不易</p>
                    </div>
                    <div class='hide'>
                      <span v-if="isGM === true">
                        今天有点冷，注意穿衣来抵御感冒哦
                      </span>
                      <span v-else>
                        虽然温度适宜,可不要松懈哦
                      </span>
                    </div>
                  </div>
                </div>
              </li>
              <li class="retrace">
                <div class='picBox'>
                  <div class='show'>
                    <div class='picContent'>
                      <img class='picture' src="../assets/car.png" alt="">
                      <p v-if="isXC === true" class="picTitle">洗车&nbsp;适宜</p>
                      <p v-else class="picTitle">洗车&nbsp;不适宜</p>
                    </div>
                    <div class='hide'>
                      <span v-if="isXC === true">
                        今天风力较小,洗完车可以让爱车发光呢
                      </span>
                      <span v-else>
                        风力较大,洗车后会蒙上灰尘
                      </span>
                    </div>
                  </div>
                </div>
              </li>
              <li class="retrace">
                <div class='picBox'>
                  <div class='show'>
                    <div class='picContent'>
                      <img class='picture' src="../assets/taiyang.png" alt="">
                      <p v-if="isFS === false" class="picTitle">防晒&nbsp;适宜</p>
                      <p v-else class="picTitle">防晒&nbsp;强烈</p>
                    </div>
                    <div class='hide'>
                      <span v-if="isFS === false">阳光正好，让我们一起欢快的跑</span>
                      <span v-else>涂擦SPF20以上,PA++护肤品,避强光</span>
                    </div>
                  </div>
                </div>
              </li>
              <li class="retrace">
                <div class='picBox'>
                  <div class='show'>
                    <div class='picContent'>
                      <img class='picture' src="../assets/basketball.png" alt="">
                      <p v-if="isYD === true" class="picTitle">运动&nbsp;适宜</p>
                      <p v-else class="picTitle">运动&nbsp;不适</p>
                    </div>
                    <div class='hide'>
                      <span v-if="isYD === true">
                        天气正好，出去运动放松一下吧
                      </span>
                      <span v-else>
                        今天比较适合呆在室内哦
                      </span>
                    </div>
                  </div>
                </div>
              </li>
              <li class="retrace">
                <div class='picBox'>
                  <div class='show'>
                    <div class='picContent'>
                      <img class='picture' src="../assets/clother.png" alt="">
                      <p v-if="isCY === 0" class="picTitle">穿衣&nbsp;短袖</p>
                      <p v-else-if="isCY === 1" class="picTitle">穿衣&nbsp;长袖</p>
                      <p v-else-if="isCY === 2" class="picTitle">穿衣&nbsp;夹克</p>
                      <p v-else class="picTitle">穿衣&nbsp;棉袄</p>
                    </div>

                    <div class='hide'>
                      <span v-if="isCY === 0">
                        天气较热,建议穿短袖短裤散热=-=
                      </span>
                      <span v-else-if="isCY === 1">
                        温度适宜,当然是长袖短裤啦
                      </span>
                      <span v-else-if="isCY === 2">
                        温度逐渐凉爽,记得披件夹克哦
                      </span>
                      <span v-else>
                        天气都这么冷了,大棉袄还不整上qaq
                      </span>
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
import HighCharts from 'highcharts'
import $ajax from 'axios'

let chart1
let chart2
var nowPlace = 0

// 鼠标悬停显示二维码
$(document).ready(function () {
  $('.wrap').hover(function () {
    $('.QRcode-outer').css('display', 'block')
  }, function () {
    $('.QRcode-outer').css('display', 'none')
  })
})

export default {
  data () {
    return {
      city_id: '', // 城市id
      city_name: '', // 城市名
      adm1: '', // 城市省级
      adm2: '', // 城市县级
      lookup_city: [ // 城市基本信息
        {
          'adm1': '',
          'adm2': '',
          'country': '',
          'id': '',
          'lat': '',
          'locationId': '',
          'lon': '',
          'name': ''
        }
      ],
      temperature: '', // 温度
      weather: '', // 天气情况
      day_weather_low: '', // 当日最低温
      day_weather_high: '', // 当日最高温
      wind_direction: '', // 风向
      wind_scale: '', // 风速
      humidity: '', // 湿度
      air_quality: '良', // 空气质量
      text: '', // 今日建议
      today_data: [], // 就现在起过后24小时时间
      today_temperature: [], // 就现在起过后24小时的温度
      week_data: [], // 就现在起过后一周日期
      week_weather_low: [], // 就现在起过后一周日期的最低温
      week_weather_high: [], // 就现在起过后一周日期的最高温
      isYS: false, // 生活建议 雨伞
      isGM: false, // 生活建议 感冒
      isXC: false, // 生活建议 洗车
      isFS: false, // 生活建议 防晒
      isYD: false, // 生活建议 运动
      isCY: 0, // 生活建议 穿衣
      temperatureType: '摄氏度', // 显示温度类型
      updateWeather: 1, // 更新天气间隔
      forecaseWeather: 3, // 预报天气数设置
      chart: { // 图表y轴标题
        name: '气温 (°C)'
      },
      daily_weather: [ // 当地天气情况
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
    const city = this.$router.currentRoute.query.id
    if (city !== undefined) {
      this.city_id = city
    } else {
      this.getLocation()
    }

    this.getCityData()
  },
  mounted () {
    const a = new F($('li.retrace'))
    a.init()

    // 日平均气温
    chart1 = new HighCharts.Chart('container1', {
      chart: {
        type: 'line',
        backgroundColor: 'rgba(255,255,255,0.3)',
        borderRadius: 10
      },
      credits: {
        enabled: false
      },
      title: {
        text: '未来逐时温度变化情况'
      },
      xAxis: {
        categories: []
      },
      yAxis: {
        title: {
          text: this.chart.name
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
    chart2 = new HighCharts.Chart('container2', {
      chart: {
        type: 'line',
        backgroundColor: 'rgba(255,255,255,0.3)',
        borderRadius: 10
      },
      credits: {
        enabled: false
      },
      title: {
        text: '未来逐日温度变化情况'
      },
      xAxis: {
        categories: []
      },
      yAxis: {
        title: {
          text: this.chart.name
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
    // ip获取当前位置
    getLocation () {
      $ajax({
        method: 'GET',
        url: 'https://restapi.amap.com/v3/ip?key=945cea1dbf29fd5bfa5f05ac61add885&ip=' + localStorage.getItem('ip')
      }).then((response1) => {
        const res1 = response1.data
        $ajax({
          method: 'GET',
          url: '/api/location/' + res1.city,
          contentType: 'application/x-www-form-urlencoded; charset=utf-8'
        }).then((response2) => {
          const res2 = response2.data
          this.locationId = res2[0].locationId
          this.$router.push('/?id=' + this.locationId)
        })
      })
    },

    // 通过城市名获取城市id
    getCityId (placeName) {
      $ajax({
        method: 'GET',
        url: '/api/location/' + placeName
      }).then((response) => {
        const res = response.data
        this.city_id = res[0].locationId
        let a
        for (a = 0; a < this.lookup_city.length; a++) {
          if (name === this.lookup_city[a].name) {
            this.city_id = this.lookup_city[a].locationId
          }
        }
      })
    },

    // 通过城市id获取各项天气数据
    getCityData () {
      $ajax({
        method: 'GET',
        url: '/api/weather/' + this.city_id,
        contentType: 'application/x-www-form-urlencoded; charset=utf-8'
      }).then((response) => {
        this.temperatureType = this.$cookieStore.getCookie('temperatureType') // 获取cookie的值
        this.updateWeather = this.$cookieStore.getCookie('updateWeather')
        this.forecaseWeather = this.$cookieStore.getCookie('forecaseWeather')
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
        if (this.weather === '晴' || this.weather === '多云' || this.weather === '阴') {
          this.isYD = true
        }
        if (this.weather === '晴' && this.temperature > 35) {
          this.isFS = true
        }
        if (this.weather === '小雨' || this.weather === '中雨' || this.weather === '大雨' ||
          this.weather === '暴雨' || this.weather === '雨') {
          this.isYS = true
        }
        if (this.temperatureType === '华氏度') {
          this.temperature = parseFloat(this.temperature * 1.8 + 32).toFixed(1)
        }
      })

      $ajax({
        method: 'GET',
        url: '/api/location/' + this.city_id
      }).then((response) => {
        const res = response.data
        this.city_name = res[0].name
        this.adm1 = res[0].adm1
        this.adm2 = res[0].adm2
      })

      $ajax({
        method: 'GET',
        url: '/api/hourly_weather/' + this.city_id
      }).then((response) => {
        const res = response.data
        this.daily_weather = res
        let i
        let j
        for (i = 0, j = 0; i < 24; i = i + 2, j++) {
          this.today_data[j] = res[i].fxDate
          this.today_temperature[j] = res[i].temp
        }
        for (i = 0; i < 24; i++) {
          this.daily_weather[i].fxDate = res[i].fxDate
          if (res[i].fxDate === '00:00') {
            this.daily_weather[i].fxDate = '明天'
          }
        }

        if (this.temperatureType === '华氏度') {
          for (i = 0; i < 24; i++) {
            this.daily_weather[i].temp = parseFloat(this.daily_weather[i].temp * 1.8 + 32).toFixed(1)
          }
          for (i = 0; i < 12; i++) {
            this.today_temperature[i] = parseInt(this.today_temperature[i] * 1.8 + 32)
            this.chart.name = '气温 (°F)'
          }
        }
        chart1.xAxis[0].setCategories(this.today_data)
        chart1.series[0].setData(this.today_temperature)
        this.daily_weather[0].fxDate = '现在'
      })

      $ajax({
        method: 'GET',
        url: '/api/forecast_weather/' + this.city_id
      }).then((response) => {
        const res = response.data
        let i
        this.day_weather_low = res[0].tempMin
        this.day_weather_high = res[0].tempMax
        console.log(this.forecaseWeather)
        for (i = 0; i < this.forecaseWeather; i++) {
          this.week_weather_low[i] = res[i].tempMin
          this.week_weather_high[i] = res[i].tempMax
          this.week_data[i] = res[i].fxDate.substring(5, 11)
        }
        if (this.temperatureType === '华氏度') {
          this.day_weather_low = parseFloat(this.day_weather_low * 1.8 + 32).toFixed(1)
          this.day_weather_high = parseFloat(this.day_weather_high * 1.8 + 32).toFixed(1)

          for (i = 0; i < this.forecaseWeather; i++) {
            this.week_weather_low[i] = parseInt(this.week_weather_low[i] * 1.8 + 32)
            this.week_weather_high[i] = parseInt(this.week_weather_high[i] * 1.8 + 32)
          }
        }
        chart2.xAxis[0].setCategories(this.week_data)
        chart2.series[0].setData(this.week_weather_low)
        chart2.series[1].setData(this.week_weather_high)
      })
    },

    // 语音播报
    uploadVoice () {
      const stringVoice = '今天天气,' + (this.weather) + ',当前温度' + this.temperature + this.temperatureType + ',最高气温' +
        this.day_weather_high + '摄氏度,最低气温' + (this.day_weather_low) + '摄氏度,风力,' + (this.wind_direction) +
        (this.wind_scale) + '级,湿度百分之' + (this.humidity) + ',空气质量良好'
      var audio = new Audio()
      audio.addEventListener('canplaythrough', function () {
        audio.play()
      })
      audio.src = 'http://localhost:8080/api/v1/speech/' + stringVoice
    },

    // 为逐时天气情况添加div
    weatherBox (index) {
      return 'weatherBox' + index
    },

    // 逐时天气情况向右滑动
    clickRight () {
      nowPlace = nowPlace + 18
      if (nowPlace > 23) {
        nowPlace = 23
      }
      window.location.hash = '#weatherBox' + nowPlace
    },

    // 逐时天气情况向左滑动
    clickLeft () {
      nowPlace = nowPlace - 18
      if (nowPlace < 0) {
        nowPlace = 0
      }
      window.location.hash = '#weatherBox' + nowPlace
    }
  }
}

</script>

<style scoped>
  h1, h2 {
    font-weight: normal;
  }

  ul {
    list-style-type: none;
    padding: 0;
  }

  li {
    display: inline-block;
    margin: 0 10px;
  }

  a {
    color: #42b983;
  }

  .voice{
    margin-left: 30px;
    width: 32px;
    height: 32px;
    background: url("../assets/yuyin.png");
    border: none;
  }

  .voice:hover{
    background: url("../assets/yuyin-cover.png");
  }

  .small-components-logo {
    width: 32px;
    height: 32px;
    float: left;
  }

  .content-temperature{
    height: 86px;
    margin-bottom: 30px;
  }

  .content-maximumTemperature{
    margin-bottom: 30px;
    height: 40px;
  }

  .content-other{
    width: 900px;
    vertical-align: middle;
    height:25px;
    margin-bottom: 30px;
  }

  .text-temperature{
    display: inline-block;
    font-size: 86px;
    line-height: 86px;
    color: #fff;
    margin:0 auto;
  }

  .text-weather{
    display: inline-block;
    font-size: 20px;
    line-height: 20px;
    color: #c6e6de;
    margin:0 auto;
  }

  .QRcode-outer{
    display: none;
    bottom: 250px;
    right: 20px !important;
    right: 18px;
    width: 130px;
    height:130px;
    position: fixed;
    border-radius: 10%;
    background: rgba(190,231,233,0.3);
    margin-bottom: 20px;
  }

  .QRcode-inner{
    background: rgba(202,233,234,0.3);
    width: 100px;
    height:100px;
    position: fixed;
    border-radius: 10%;
    position:absolute;
    left:0;
    top: 0;
    bottom: 0;
    right: 0;
    margin: auto;
  }

  .QRcode{
    width: 100px;
    height:100px;
    position:absolute;
    left:0;
    top: 0;
    bottom: 0;
    right: 0;
    margin: auto;
  }

  .wrap{
    display: block;
    bottom: 200px;
    right: 60px !important;
    right: 18px;
    width: 48px;
    height:48px;
    position: fixed;
    background: rgba(190,231,233,0.5);
    border-radius: 10%;
    background: url("../assets/qrCode.png");
  }

  .wrap:hover{
    background: url("../assets/qrCode-cover.png");
  }

  .text-up-low{
    display: inline-block;
    font-size: 20px;
    line-height: 20px;
    color: #c6e6de;
    margin:0 auto;
  }

  .img-weather{
    width:300px;
    height: 300px;
  }

  .txt{
    line-height: 20px;
    color: #c6e6de;
    display: inline-block;
    font-size: 19px;
    margin-left: 10px;
    float: left;
  }

  .txt-now-place{
    line-height: 32px;
    color: #c6e6de;
    display: inline-block;
    font-size: 25px;
    margin-left: 10px;
    float: left;
  }

  .icon{
    width: 20px;
    height: 20px;
  }

  .windDirection{
    margin-top:1px;
    float: left;
  }

  .item{
    display: inline-block;
    margin-right: 42px;
    color: #c6e6de;
    height: 20px;
    line-height: 20px;
    font-size: 0;
  }

  .title-text{
    width: 50%;
    height: 100%;
    float: left;
  }

  .move-button{
    width: 50%;
    height: 100%;
    float: right;
  }

  .move-left{
    width: 25px;
    height: 25px;
    float: right;
    margin-right: 1%;
    margin-top: 10px;
    background: url("../assets/left.png");
  }

  .move-left:hover{
    background: url("../assets/left-cover.png");
  }

  .move-right{
    width: 25px;
    height: 25px;
    float: right;
    margin-right: 8%;
    margin-top: 10px;
    background: url("../assets/right.png");
  }

  .move-right:hover{
    background: url("../assets/right-cover.png");
  }

  .day-weather-ul{
    width: 6%;
    height: 90%;
  }

  .day-weather-li{
    width: 100px;
    height: 30%;
    float: left;
  }

  .day-weather-time{
    font-size: 20px;
    color: #767987;
    margin:0 auto;
    padding-top: 10px;
    text-align: center;
  }

  .day-weather-temperature{
    font-size: 35px;
    color: #241e1e;
    margin:0 auto;
    text-align: center;
  }

  .day-weather-weather{
    width: 40px;
    height: 40px;
    display: table-cell;
    vertical-align: middle;
    margin:0 auto;
  }

  .day-weather-windDirection{
    font-size: 20px;
    color: #767987;
    margin:0 auto;
    padding-top: 5px;
    text-align: center;
  }

  .tipsRetrace{
    width: 100%;
    height: 90%;
    display: block;
    float: left;
    border-radius: 3%;
    box-shadow: 0 0 14px 0 rgba(0,0,0,0.3);
  }

  .tipsDiv{
    height: 9%;
    width: 100%;
    margin: 0;
    padding: 0;
    font-size: 18px;
  }

  .more-weather-nav{
    height: 10%;
    margin-left: 30px;
    margin-top: 5px;
    font-size: 18px;
  }

  .more-weather{
    margin-top: 10px;
    width: 100%;
    height: 80%;
    overflow-x: hidden;
    overflow-y: hidden;
    white-space: nowrap;
  }

  .weather-box{
    width: 10%;
    height: 100%;
    display: inline-block;
  }

  .day-weather-list{
    height: 100%;
    width: 100%;
  }

  /*.more-weather::-webkit-scrollbar { !*滚动条整体样式*!*/
  /*  width: 0; !*高宽分别对应横竖滚动条的尺寸*!*/
  /*  height: 4px;*/
  /*}*/

  /*.more-weather::-webkit-scrollbar-thumb { !*滚动条里面小方块*!*/
  /*  border-radius: 5px;*/
  /*  -webkit-box-shadow: inset 0 0 5px rgba(0, 0, 0, 0.2);*/
  /*  background: rgba(0, 0, 0, 0.2);*/
  /*}*/

  /*.more-weather::-webkit-scrollbar-track { !*滚动条里面轨道*!*/
  /*  -webkit-box-shadow: inset 0 0 5px rgba(0, 0, 0, 0.2);*/
  /*  border-radius: 0;*/
  /*  background: rgba(0, 0, 0, 0.1);*/
  /*}*/

  #titleText:before,#tipsText:before{
    content: '';
    float: left;
    height: 7px;
    width: 7px;
    overflow: hidden;
    margin-right: 10px;
    background: #344665;
    border-radius: 50%;
    margin-top: 8px;
  }
  .wrapper {
    max-width: 100%;
    height: 100%;
  }

  .retraceUl{
    height: 100%;
  }

  .wrapper li {
    position: relative;
    width: 45%;
    height: 30%;
    list-style: none;
    margin: 5px;
    display: inline-block;
    perspective: 300px;
  }

  .picBox {
    position: absolute;
    top: 0;
    right: 0;
    bottom: 0;
    left: 0;
    transform-style: preserve-3d;
    transform-origin: 50% 50% -45px;
    animation: 200ms ease-out 0ms 1 normal forwards;
    width: 90px;
    height: 90px;
    margin-left: 16px;
    margin-top: 10px;
  }

  .picContent {
    background: rgba(161,216,229,0.5);
    width: 90px;
    height: 90px;
    border-radius: 5%;
  }

  .picTitle {
    font-family: "PingFang SC", "Microsoft YaHei", Simsun, Helvetica, Arial, sans-serif;
    font-size: 12px;
    color: #384c78;
    margin-top: 5px;
    text-align: center;
  }

  .picture {
    height: 30px;
    width: 30px;
    margin-left: 30px;
    margin-top: 15px;
  }

  .show,
  .hide {
    background: rgba(255,255,255,0.9);
    width: 90px;
    height: 90px;
    position: absolute;
    top: 0;
    right: 0;
    bottom: 0;
    left: 0;
    border-radius: 3%;
    display:table-cell;
    vertical-align:middle;
  }

  .hide {
  / / 隐藏文字样式   color: rgba(255,255,255,0.1);
    background-color: rgba(161,216,229,0.9);
    display:table-cell;
    text-align: center;
    /*line-height: 20px;*/
    font-size: 14px;
    vertical-align:center;
    transform: translate3d(0, 0, -1px);
    /* 3D空间内移动一个元素的位置 */
  }

  .in-top .hide,
  .out-top .hide {
    transform-origin: 0 100%;
    transform: translate3d(0, -100%, 0) rotate3d(1, 0, 0, 90deg);
  }

  .in-top .picBox {
    animation-name: in-top;
    animation-play-state: running;
  }

  .out-top .picBox {
    animation-name: out-top;
    animation-play-state: running;
  }

  @keyframes in-top {
    from {
      transform: rotate3d(0, 0, 0, 0deg)
    }
    to {
      transform: rotate3d(-1, 0, 0, 90deg)
    }
  }

  @keyframes out-top {
    from {
      transform: rotate3d(-1, 0, 0, 90deg)
    }
    to {
      transform: rotate3d(0, 0, 0, 0deg)
    }
  }

  .in-right .hide,
  .out-right .hide {
    transform-origin: 0 0;
    transform: translate3d(100%, 0, 0) rotate3d(0, 1, 0, 90deg);
  }

  .in-right .picBox {
    animation-name: in-right;
    animation-play-state: running;
  }

  .out-right .picBox {
    animation-name: out-right;
    animation-play-state: running;
  }

  @keyframes in-right {
    from {
      transform: rotate3d(0, 0, 0, 0deg)
    }
    to {
      transform: rotate3d(0, -1, 0, 90deg)
    }
  }

  @keyframes out-right {
    from {
      transform: rotate3d(0, -1, 0, 90deg)
    }
    to {
      transform: rotate3d(0, 0, 0, 0deg)
    }
  }

  .in-bottom .hide,
  .out-bottom .hide {
    transform-origin: 0 0;
    transform: translate3d(0, 100%, 0) rotate3d(-1, 0, 0, 90deg);
  }

  .in-bottom .picBox {
    animation-name: in-bottom;
    animation-play-state: running;
  }

  .out-bottom .picBox {
    animation-name: out-bottom;
    animation-play-state: running;
  }

  @keyframes in-bottom {
    from {
      transform: rotate3d(0, 0, 0, 0deg)
    }
    to {
      transform: rotate3d(1, 0, 0, 90deg)
    }
  }

  @keyframes out-bottom {
    from {
      transform: rotate3d(1, 0, 0, 90deg)
    }
    to {
      transform: rotate3d(0, 0, 0, 0deg)
    }
  }

  .in-left .hide,
  .out-left .hide {
    transform-origin: 100% 0;
    transform: translate3d(-100%, 0, 0) rotate3d(0, -1, 0, 90deg);
  }

  @keyframes in-left {
    from {
      transform: rotate3d(0, 0, 0, 0deg)
    }
    to {
      transform: rotate3d(0, 1, 0, 90deg)
    }
  }

  @keyframes out-left {
    from {
      transform: rotate3d(0, 1, 0, 90deg)
    }
    to {
      transform: rotate3d(0, 0, 0, 0deg)
    }
  }

  .in-left .picBox {
    animation-name: in-left;
    animation-play-state: running;
  }

  .out-left .picBox {
    animation-name: out-left;
    animation-play-state: running;
  }
</style>
