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
          <!--当时天气详情-->
          <div class="content-temperature">
            <p class="text-temperature">28℃</p>
            <img class="img-weather" src="../assets/sun to cloud.png">  <!--天气图标-->
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
        <!--变色当前位置nowplace cover.png-->
        <!--变色语音播报speech sound cover.png-->
      </div>
    </div>

    <div id="weather-content1"></div>
    <div id="link-two"></div>
    <div id="weather-content2"></div>
  </div>
</template>

<script>

</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
@import "../css/index.css";

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

  .title {
    float: left;
    width:150px;
    margin-top: 0.5%;
    margin-bottom: 0px;
    margin-left: 20%;
    color: #2c3e50;
    font-size: 200%;
    font-style: italic;
  }

  .img-logo{
    float: left;
    width: 200px;
    height: 80px;
    margin-left: 10%;
  }

  .img-place {
    float: left;
    width: 36px;
    height: 36px;
    margin-top: 0.5%;
    margin-bottom: 0px;
    margin-left: 35%;
  }

  .city-place {
    float: right;
    width: 250px;
    height: 30px;
    margin-top: 0.5%;
    margin-bottom: 0px;
    margin-right: 10%;
    padding-left:10px;
    border-radius: 20px;
    background-color: #ffffff;

    -webkit-box-shadow: inset 0 1px 1px rgba(0,0,0,.075);
    box-shadow: inset 0 1px 1px rgba(0,0,0,.075);
    -webkit-transition: border-color ease-in-out .15s,-webkit-box-shadow ease-in-out .15s;
    -o-transition: border-color ease-in-out .15s,box-shadow ease-in-out .15s;
    transition: border-color ease-in-out .15s,box-shadow ease-in-out .15s
  }

  .city-place:focus {
    border-color: #66afe9;
    outline: 0;
    -webkit-box-shadow: inset 0 1px 1px rgba(0,0,0,.075),0 0 8px rgba(102,175,233,.6);
    box-shadow: inset 0 1px 1px rgba(0,0,0,.075),0 0 8px rgba(102,175,233,.6)
  }

  .small-componentslogo {
    width: 32px;
    height: 32px;
  }

</style>
