<template>
  <div id = "background">
    <div id="header-title">
      <img class="img-logo" src="../assets/logo.png" alt="">
      <div class="dropdownV">
        <b-dropdown id="dropdown-form" right text="设置" ref="dropdown" class="m-2">
          <b-dropdown-form>
            <b-form-group label="温度显示设置" label-for="dropdown-form-email" @submit.stop.prevent>
              <b-form-select id="getTemperatureType" v-model="temperatureType">
                <option>摄氏度</option>
                <option>华氏度</option>
              </b-form-select>
            </b-form-group>
            <b-form-group label="预报天气设置" label-for="dropdown-form-password">
              <b-form-select v-model='forecaseWeather' id="forecaseWeather">
                <option>3</option>
                <option>7</option>
              </b-form-select>
            </b-form-group>
            <b-form-group label="定时播报（测试-秒）" label-for="dropdown-form-password">
              <b-form-select v-model='timing' id="timing">
                <option>0</option>
                <option>5</option>
                <option>10</option>
                <option>15</option>
              </b-form-select>
            </b-form-group>

            <b-button variant="primary" size="sm" @click="getMessage">确认</b-button>
          </b-dropdown-form>
          <b-dropdown-divider></b-dropdown-divider>
          <b-dropdown-item-button>星乐天气-设置</b-dropdown-item-button>
        </b-dropdown>
      </div>
<!--      <span class="setting"></span>-->
      <div id="city-search">
        <label>
          <input id="city-name" class="city-place" type="text" :value="city" placeholder="搜索市、区、县等">
        </label>
        <b-button class="confirm" variant="outline-primary" @click="getCityId()">确认查询</b-button>
      </div>
    </div>
  </div>
</template>

<script>

export default {
  name: 'Nav',
  data () {
    return {
      city: '',
      temperatureType: '摄氏度',
      updateWeather: 1,
      forecaseWeather: 3,
      timing: 0
    }
  },
  created () {
    this.temperatureType = this.$cookieStore.getCookie('temperatureType') // 获取cookie的值
    this.updateWeather = this.$cookieStore.getCookie('updateWeather')
    this.forecaseWeather = this.$cookieStore.getCookie('forecaseWeather')
    this.timing = this.$cookieStore.getCookie('timing')
    const city = this.$router.currentRoute.query.city
    if (city !== undefined) {
      this.city = city
    }
    this.$cookieStore.setCookie('temperatureType', this.temperatureType)
    this.$cookieStore.setCookie('updateWeather', this.updateWeather)
    this.$cookieStore.setCookie('forecaseWeather', this.forecaseWeather)
    this.$cookieStore.setCookie('timing', this.timing)
  },
  methods: {
    getCityId () {
      const name = document.getElementById('city-name').value
      this.city = name
      // 使用Vue路由进行跳转
      this.$router.push('/search?city=' + name)
    },
    getMessage () {
      this.$cookieStore.setCookie('temperatureType', this.temperatureType)
      this.$cookieStore.setCookie('updateWeather', this.updateWeather)
      this.$cookieStore.setCookie('forecaseWeather', this.forecaseWeather)
      this.$cookieStore.setCookie('timing', this.timing)
      history.go(0)
    }
  }
}
</script>

<style scoped>
  #header-title {
    width:100%;
    height:60px;
  }

  #city-search {
    width:300px;
    height:100%;
    float:right;
    margin-right: 5%;
    margin-top: 5px;
  }

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

  #background{
    background: url("../assets/back-up.png");
  }

  .img-logo{
    float: left;
    width: 180px;
    height: 60px;
    margin-left: 10%;
  }

  .dropdownV{
    float: right;
    margin-top: 4px;
    margin-right: 10px;
  }

  .setting{
    width: 32px;
    height: 32px;
    float: right;
    margin-top: 14px;
    margin-right: 3px;
    background: url("../assets/set.png");
  }

  .setting:hover{
    background: url("../assets/set-cover.png");
  }

  .confirm{
    float: right;
    width: 90px;
    height: 45px;
    border-radius: 15px;
  }

  .city-place {
    float: right;
    width: 200px;
    height: 45px;
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

  .wrapper li {
    position: relative;
    width: 45%;
    height: 30%;
    list-style: none;
    margin: 5px;
    display: inline-block;
    perspective: 300px;
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

</style>
