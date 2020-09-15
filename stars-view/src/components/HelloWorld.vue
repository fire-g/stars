<template>
  <div id="body">
    <div id="header">
      <div id="header-title">
        <p class="title">星乐天气</p>
        <img class="img-place" src="../assets/place.png">
        <input class="city-place" type="text" placeholder="搜索市、区、县等">
      </div>
      <div id="link-one"></div>
      <div id="header-content">
        <img class="img-nowPlace" src="../assets/nowplace.png">  <!--当前位置-->
        <img class="img-weather" src="../assets/sun to cloud.png">  <!--天气图标-->
        <img class="img-windDirection" src="../assets/wind direction.png">  <!--风向-->
        <img class="img-humidity" src="../assets/humidity.png">  <!--湿度-->
        <img class="img-airQuality" src="../assets/air quality.png">  <!--空气质量-->
        <img class="img-speechSound" src="../assets/speech sound.png">  <!--语音播报-->

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

  .img-place {
    float: left;
    width: 36px;
    height: 36px;
    margin-top: 0.5%;
    margin-bottom: 0px;
    margin-left: 35%;
  }

  .city-place {
    float: left;
    width: 250px;
    height: 30px;
    margin-top: 0.5%;
    margin-bottom: 0px;
    margin-left: 0%;
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

</style>
