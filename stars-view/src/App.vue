<template>
  <div id="app">
<!--    <img src="./assets/logo.png">-->
    <router-view/>
  </div>
</template>

<script>
export default {
  name: 'App'
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  color: #2c3e50;
  margin-top: 0px;
}

  #body{
    width:100%;
    height:1200px;
  }

  #header {
    width:100%;
    height:60%;
    background: url("../src/assets/background.jpg") no-repeat left;
    background-size: cover;
  }

  #weather-content1 {
    width:100%;
    height:20%;
    background-color: #42b983;
  }

  #weather-content2 {
    width:100%;
    height:40%;
    background-color: #2c3e50;
  }

  #header-title {
    width:100%;
    height:9%;
  }

  #link {
    width:100%;
    height:1%;
    border-top:solid #ACC0D8 1px;
  }

  #header-content {
    width:100%;
    height:90%;
  }

</style>
