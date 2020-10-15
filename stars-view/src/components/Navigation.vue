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
            <b-form-group label="定时语音播报（演示-秒）" label-for="dropdown-form-password">
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
      <div id="city-search">
        <b-button class="confirm" @click="getCityId()">确认查询</b-button>
        <b-form-input id="city-name" class="city-place" type="text" :value="city" placeholder="搜索市、区、县等"></b-form-input>
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
      forecaseWeather: 3,
      timing: 0
    }
  },
  created () {
    this.setCookie()
    const city = this.$router.currentRoute.query.city
    if (city !== undefined) {
      this.city = city
    }
    // this.$cookieStore.setCookie('temperatureType', this.temperatureType)
    // this.$cookieStore.setCookie('forecaseWeather', this.forecaseWeather)
    // this.$cookieStore.setCookie('timing', this.timing)
  },
  methods: {
    getCityId () {
      const name = document.getElementById('city-name').value
      this.city = name
      if (this.city === '') {
        alert('请不要输入空的城市名！！！')
      } else {
        // 使用Vue路由进行跳转
        this.$router.push('/search?city=' + name)
      }
    },
    getMessage () {
      this.$cookieStore.setCookie('temperatureType', this.temperatureType)
      this.$cookieStore.setCookie('forecaseWeather', this.forecaseWeather)
      this.$cookieStore.setCookie('timing', this.timing)
      history.go(0)
    },

    // 设置cookie初始值
    setCookie () {
      if (this.$cookieStore.getCookie('temperatureType') === '') {
        this.$cookieStore.setCookie('temperatureType', this.temperatureType)
      } else {
        this.temperatureType = this.$cookieStore.getCookie('temperatureType')
      }
      if (this.$cookieStore.getCookie('forecaseWeather') === '') {
        this.$cookieStore.setCookie('forecaseWeather', this.forecaseWeather)
      } else {
        this.forecaseWeather = this.$cookieStore.getCookie('forecaseWeather')
      }
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
    margin-top: 5px;
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
    margin-top: 6px;
    margin-left: 10px;
  }

  .city-place {
    float: right;
    width: 200px;
    margin-top: 6px;
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
