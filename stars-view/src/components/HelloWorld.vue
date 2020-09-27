<template>
  <div id="body">
    <div id="header">
      <div id="header-title">
        <img class="img-logo" src="../assets/logo.png">
        <!--<img class="img-place" src="../assets/place.png">-->
        <input class="city-place" type="text" placeholder="搜索市、区、县等">
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
                <img class="icon windDirection" src="../assets/humidity.png">
                <span class="txt">东北风&nbsp;1级</span>
              </p>
              <!--湿度-->
              <p class="item">
                <i class="icon humidity"></i>
                <span class="txt">湿度&nbsp;80%</span>
              </p>
              <!--空气质量-->
              <p class="item">
                <i class="icon airQuality"></i>
                <span class="txt">空气质量&nbsp;优</span>
              </p>
            </div>
            <!--建议-->
            <div class="content-tips">
            </div>
            <!--当前位置-->
            <div class="content-locate">
              <img class="img-nowPlace small-componentslogo"  src="../assets/nowplace.png">
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
        <ul class="day-weather-ul">
          <li class="day-weather-li"><p class="day-weather-time">18:00</p></li>
          <li class="day-weather-li"><p class="day-weather-temperature">28℃</p></li>
          <li class="day-weather-li"><img class="day-weather-weather" src="../assets/sun to cloud.png"></li>
          <li class="day-weather-li"><p class="day-weather-windDirection">东北风&nbsp;1级</p></li>
          <li class="day-weather-li"><p class="day-weather-airQuality">优</p></li>
        </ul>
      </div>
    </div>

    <div id="link-two"></div>

    <div id="weather-content2">
      <div id="weather-trend">
        <input class="day-trend" type="button" value="本日温度趋势图" onclick="window.location.href='/day-trend'">
        <input class="week-trend" type="button" value="本周天气趋势图" onclick="window.location.href='/week-trend'">

        <!-- <router-link to="/">小广告专用</router-link> -->
      </div>
      <div id="system-propose"></div>
    </div>
  </div>
</template>

<script>

</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  @import "../css/index.css";
</style>
