<template>
  <div></div>
<!--  <div id="header">-->
<!--    <div id="header-title">-->
<!--      <img class="img-logo" src="../assets/logo.png" alt="">-->
<!--      <input id="confirm" class="confirm" type="button" @click="getCityId()" value="确认查询">-->
<!--      <label>-->
<!--        <input id="city-name" class="city-place" type="text" placeholder="搜索市、区、县等" list="placeholder" value="" @change="getCityName()">-->
<!--      </label>-->
<!--      <datalist id="placeholder"></datalist>-->
<!--    </div>-->
<!--    <div id="link-one"></div>-->
<!--    <div id="header-content">-->
<!--      <div id="content-current">-->
<!--        <div id="content-current-left">-->
<!--          &lt;!&ndash;当时天气详情&ndash;&gt;-->
<!--          <div class="content-temperature">-->
<!--            <p class="text-temperature">{{temperature}}℃</p>-->
<!--            <input type="hidden" v-model="weather">-->
<!--            <p class="text-weather">{{weather}}</p>-->
<!--          </div>-->
<!--          &lt;!&ndash;最高 / 最低 温度&ndash;&gt;-->
<!--          <div class="content-maximumTemperature">-->
<!--            <p class="text-up-low">{{day_weather_low}}℃ / {{day_weather_high}}℃</p>-->
<!--          </div>-->
<!--          <div class="content-other">-->
<!--            &lt;!&ndash;风向&ndash;&gt;-->
<!--            <p class="item">-->
<!--              <img class="icon windDirection" src="../assets/wind direction.png" alt="">-->
<!--              <span class="txt">{{wind_direction}} {{wind_scale}}级</span>-->
<!--            </p>-->
<!--            &lt;!&ndash;湿度&ndash;&gt;-->
<!--            <p class="item">-->
<!--              <img class="icon windDirection" src="../assets/humidity.png" alt="">-->
<!--              <span class="txt">湿度&nbsp;{{humidity}}%</span>-->
<!--            </p>-->
<!--            &lt;!&ndash;空气质量&ndash;&gt;-->
<!--            <p class="item">-->
<!--              <img class="icon windDirection" src="../assets/air quality.png" alt="">-->
<!--              <span class="txt">空气质量&nbsp;{{air_quality}}</span>-->
<!--            </p>-->
<!--          </div>-->
<!--          <div class="content-tips">  &lt;!&ndash;建议&ndash;&gt;-->
<!--          </div>-->
<!--          <div class="content-locate">-->
<!--            <img class="img-nowPlace small-components-logo" src="../assets/now_place.png" alt="">-->
<!--            <span class="txt-now-place" id="txt-now-place">{{adm1}} {{adm2}} {{city_name}}</span>-->
<!--            <img class="voice" @click='uploadVoice()' alt="">-->
<!--          </div>   &lt;!&ndash;当前位置&ndash;&gt;-->
<!--        </div>-->
<!--        <div id="content-current-right">-->
<!--          <img v-if="weather == '多云' " class="img-weather" src="../assets/index/101.png" alt="">  &lt;!&ndash;天气图标&ndash;&gt;-->
<!--          <img v-else-if=" weather == '晴'" class="img-weather" src="../assets/index/100.png" alt="">-->
<!--          <img v-else-if=" weather == '少云'" class="img-weather" src="../assets/index/102.png" alt="">-->
<!--          <img v-else-if=" weather == '晴间多云'" class="img-weather" src="../assets/index/103.png" alt="">-->
<!--          <img v-else-if=" weather == '阴'" class="img-weather" src="../assets/index/104.png" alt="">-->
<!--          <img v-else-if=" weather == '阵雨'" class="img-weather" src="../assets/index/300.png" alt="">-->
<!--          <img v-else-if=" weather == '强阵雨'" class="img-weather" src="../assets/index/301.png" alt="">-->
<!--          <img v-else-if=" weather == '雷阵雨'" class="img-weather" src="../assets/index/302.png" alt="">-->
<!--          <img v-else-if=" weather == '强雷阵雨'" class="img-weather" src="../assets/index/303.png" alt="">-->
<!--          <img v-else-if=" weather == '强雷阵雨伴有冰雹'" class="img-weather" src="../assets/index/304.png" alt="">-->
<!--          <img v-else-if=" weather == '小雨'" class="img-weather" src="../assets/index/305.png" alt="">-->
<!--          <img v-else-if=" weather == '中雨'" class="img-weather" src="../assets/index/306.png" alt="">-->
<!--          <img v-else-if=" weather == '大雨'" class="img-weather" src="../assets/index/307.png" alt="">-->
<!--          <img v-else-if=" weather == '极端降雨'" class="img-weather" src="../assets/index/308.png" alt="">-->
<!--          <img v-else-if=" weather == '毛毛雨'" class="img-weather" src="../assets/index/309.png" alt="">-->
<!--          <img v-else-if=" weather == '暴雨'" class="img-weather" src="../assets/index/310.png" alt="">-->
<!--          <img v-else-if=" weather == '大暴雨'" class="img-weather" src="../assets/index/311.png" alt="">-->
<!--          <img v-else-if=" weather == '特大暴雨'" class="img-weather" src="../assets/index/312.png" alt="">-->
<!--          <img v-else-if=" weather == '冻雨'" class="img-weather" src="../assets/index/313.png" alt="">-->
<!--          <img v-else-if=" weather == '小到中雨'" class="img-weather" src="../assets/index/314.png" alt="">-->
<!--          <img v-else-if=" weather == '中到大雨'" class="img-weather" src="../assets/index/315.png" alt="">-->
<!--          <img v-else-if=" weather == '大到暴雨'" class="img-weather" src="../assets/index/316.png" alt="">-->
<!--          <img v-else-if=" weather == '暴雨到大暴雨'" class="img-weather" src="../assets/index/317.png" alt="">-->
<!--          <img v-else-if=" weather == '大暴雨到特大暴雨'" class="img-weather" src="../assets/index/318.png" alt="">-->
<!--          <img v-else-if=" weather == '雨'" class="img-weather" src="../assets/index/399.png" alt="">-->
<!--          <img v-else-if=" weather == '小雪'" class="img-weather" src="../assets/index/400.png" alt="">-->
<!--          <img v-else-if=" weather == '中雪'" class="img-weather" src="../assets/index/401.png" alt="">-->
<!--          <img v-else-if=" weather == '大雪'" class="img-weather" src="../assets/index/402.png" alt="">-->
<!--          <img v-else-if=" weather == '暴雪'" class="img-weather" src="../assets/index/403.png" alt="">-->
<!--          <img v-else-if=" weather == '雨夹雪'" class="img-weather" src="../assets/index/404.png" alt="">-->
<!--          <img v-else-if=" weather == '雨雪天气'" class="img-weather" src="../assets/index/405.png" alt="">-->
<!--          <img v-else-if=" weather == '阵雨夹雪'" class="img-weather" src="../assets/index/406.png" alt="">-->
<!--          <img v-else-if=" weather == '阵雪'" class="img-weather" src="../assets/index/407.png" alt="">-->
<!--          <img v-else-if=" weather == '小到中雪'" class="img-weather" src="../assets/index/408.png" alt="">-->
<!--          <img v-else-if=" weather == '中到大雪'" class="img-weather" src="../assets/index/409.png" alt="">-->
<!--          <img v-else-if=" weather == '大到暴雪'" class="img-weather" src="../assets/index/410.png" alt="">-->
<!--          <img v-else-if=" weather == '雪'" class="img-weather" src="../assets/index/499.png" alt="">-->
<!--          <img v-else-if=" weather == '阵雨夹雪'" class="img-weather" src="../assets/index/456.png" alt="">-->
<!--          <img v-else-if=" weather == '阵雪'" class="img-weather" src="../assets/index/457.png" alt="">-->
<!--          <img v-else-if=" weather == '薄雾'" class="img-weather" src="../assets/index/500.png" alt="">-->
<!--          <img v-else-if=" weather == '雾'" class="img-weather" src="../assets/index/501.png" alt="">-->
<!--          <img v-else-if=" weather == '霾'" class="img-weather" src="../assets/index/502.png" alt="">-->
<!--          <img v-else-if=" weather == '扬沙'" class="img-weather" src="../assets/index/503.png" alt="">-->
<!--          <img v-else-if=" weather == '浮尘'" class="img-weather" src="../assets/index/504.png" alt="">-->
<!--          <img v-else-if=" weather == '沙尘暴'" class="img-weather" src="../assets/index/507.png" alt="">-->
<!--          <img v-else-if=" weather == '强沙尘暴'" class="img-weather" src="../assets/index/508.png" alt="">-->
<!--          <img v-else-if=" weather == '浓雾'" class="img-weather" src="../assets/index/509.png" alt="">-->
<!--          <img v-else-if=" weather == '强浓雾'" class="img-weather" src="../assets/index/510.png" alt="">-->
<!--          <img v-else-if=" weather == '中度霾'" class="img-weather" src="../assets/index/511.png" alt="">-->
<!--          <img v-else-if=" weather == '重度霾'" class="img-weather" src="../assets/index/512.png" alt="">-->
<!--          <img v-else-if=" weather == '严重霾'" class="img-weather" src="../assets/index/513.png" alt="">-->
<!--          <img v-else-if=" weather == '大雾'" class="img-weather" src="../assets/index/514.png" alt="">-->
<!--          <img v-else-if=" weather == '特强浓雾'" class="img-weather" src="../assets/index/515.png" alt="">-->
<!--          <img v-else-if=" weather == '热'" class="img-weather" src="../assets/index/900.png" alt="">-->
<!--          <img v-else-if=" weather == '冷'" class="img-weather" src="../assets/index/901.png" alt="">-->
<!--          <img v-else class="img-weather" src="../assets/index/999.png" alt="">-->
<!--        </div> &lt;!&ndash; 当前天气图标 &ndash;&gt;-->
<!--      </div>-->
<!--      &lt;!&ndash;变色当前位置now place cover.png&ndash;&gt;-->
<!--      &lt;!&ndash;变色语音播报speech sound cover.png&ndash;&gt;-->
<!--    </div>-->
<!--  </div>-->
<!--  <div id="header-title">-->
<!--    <img class="img-logo" src="../assets/logo.png" alt="">-->
<!--    <label>-->
<!--      <input id="city-name" class="city-place" type="text" placeholder="搜索市、区、县等" list="placeholder" value="新建">-->
<!--    </label>-->
<!--    <datalist id="placeholder">-->
<!--      <option value="南昌-上饶"/>-->
<!--      <option value="南昌-宜春"/>-->
<!--      <option value="南昌-新余"/>-->
<!--      <option value="南昌-广丰"/>-->
<!--      <option value="重庆-重庆"/>-->
<!--      <option value="北京/北京/北京"/>-->
<!--      <option value="北京/北京/海淀"/>-->
<!--      <option value="北京/北京/朝阳"/>-->
<!--      <option value="北京/北京/顺义"/>-->
<!--      <option value="北京/北京/怀柔"/>-->
<!--      <option value="北京/北京/通州"/>-->
<!--      <option value="北京/北京/昌平"/>-->
<!--      <option value="北京/北京/延庆"/>-->
<!--      <option value="北京/北京/丰台"/>-->
<!--    </datalist>-->
<!--    <input id="aaa" class="bbb" type="button" @click="getCityName()" value="搜索">-->
<!--  </div>-->
</template>

<script>
export default {
  name: 'Nav'
}
</script>

<style scoped>
  @import "../css/index.css";
  @import "../css/demo.css";
</style>
