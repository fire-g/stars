<template>
  <div id="app">
    <Nav/>
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
  }

  #weather-content2 {
    width:100%;
    height:39%;
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
    width: 80%;
    height: 90%;
    margin-left: 10%;
    margin-top: 10px;
    border-radius: 10px;
    box-shadow: 0 0 14px 0 rgba(0,0,0,0.3);
  }

  #day-weather-trend{
    width: 30%;
    height: 90%;
    float: left;
    margin-left: 10%;
    margin-top: 1%;
    border-radius: 10px;
    box-shadow: 0 0 14px 0 rgba(0,0,0,0.3);
  }

  #week-weather-trend{
    width: 30%;
    height: 90%;
    float: left;
    margin-left: 1%;
    margin-top: 1%;
    border-radius: 10px;
    box-shadow: 0 0 14px 0 rgba(0,0,0,0.3);
  }

  #system-propose{
    width: 18%;
    height: 90%;
    float: left;
    margin-left: 1%;
    margin-top: 1%;
  }

  #trend-body{
    width:100%;
    height: 100%;
    padding: 0;
    margin: 0;
  }

  #container1{
    width:100%;
    height: 100%;
  }

  #container2{
    width:100%;
    height: 100%;
  }

</style>
