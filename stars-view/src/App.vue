<template>
  <div id="app">
    <Nav/>
<!--    <img src="./assets/logo.png">-->
    <router-view/>
  </div>
</template>

<script>
import Nav from './components/Nav'
export default {
  name: 'App',
  components: {Nav}
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  color: #2c3e50;
  margin-top: 0;
}

  #body{
    width:100%;
    height:1200px;
    background: url("../src/assets/background.jpg") no-repeat left;
    background-size: cover;
  }

  #header {
    width:100%;
    height:40%;
  }

  #weather-content1 {
    width:100%;
    height:20%;
    background-color: gray;
    opacity: 0.3;
  }

  #weather-content2 {
    width:100%;
    height:20%;
    background-color: gray;
    opacity: 0.3;
  }

  #header-title {
    width:100%;
    height:17%;
  }

  #link-one {
    width:100%;
    height:1%;
    border-top:solid #ACC0D8 1px;
  }

  #header-content {
    width:100%;
    height:80%;
  }

  #link-two {
    width:100%;
    height:1%;
    border-top:solid #ACC0D8 1px;
  }

  #content-current{
    width: 100%;
    height: 100%;
    border: solid 0px #c6e6de;
  }

  #content-current-left{
    width: 50%;
    float: left;
    margin-left: 10%;
    margin-top: 3%;
    border: solid 0px #c6e6de;
  }

  #content-current-right{
    width: 20%;
    float: right;
    margin-right: 10%;
    margin-top: 3%;
    border: solid 0px #c6e6de;
  }

  *,body,html{
    font-family: "PingFang SC","Microsoft YaHei",Simsun,Helvetica,Arial,sans-serif;
  }

  div{
    display: block;
  }

  #day-weather{
    width: 90%;
    height: 90%;
    margin-left: 5%;
    padding-top: 10px;
  }

  #weather-trend{
    width: 40%;
    height: 90%;
    float: left;
    margin-left: 5%;
  }

  #system-propose{
    width: 40%;
    height: 90%;
    float: right;
    margin-right: 5%;
  }

  #trend-body{
    width:100%;
    height: 100%;
    padding: 0;
    margin: 0;
  }

</style>
