<template>
  <div id="body">
    <div id="header">
      <div id="header-title">
        <img class="img-logo" src="../assets/logo.png">
        <input class="city-place" type="text" placeholder="搜索市、区、县等">
        <input class="back-home" type="button" value="返回" onclick="window.location.href='/'">
      </div>
      <div id="link-one"></div>
      <div id="header-content">
        <!-- 趋势图 -->
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

<style scoped>
  @import "../css/index.css";
</style>
