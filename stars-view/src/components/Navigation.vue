<template>
  <div id="header-title">
    <img class="img-logo" src="../assets/logo.png" alt="">
    <input id="confirm" class="confirm" type="button" @click="getCityId()" value="确认查询">
    <label>
      <input id="city-name" class="city-place" type="text" :value="city" placeholder="搜索市、区、县等" list="placeholder">
    </label>
    <datalist id="placeholder"></datalist>
  </div>
</template>

<script>

export default {
  name: 'Nav',
  data () {
    return {
      city: ''
    }
  },
  created () {
    const city = this.$router.currentRoute.query.city
    if (city !== undefined) {
      this.city = city
    }
  },
  methods: {
    getCityId () {
      const name = document.getElementById('city-name').value
      this.city = name
      // 使用Vue路由进行跳转
      this.$router.push('/search?city=' + name)
    }
  }
}
</script>

<style scoped>
  #header-title {
    width:100%;
    height:80px;
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

  .img-logo{
    float: left;
    width: 200px;
    height: 80px;
    margin-left: 10%;
  }

  .confirm{
    float: right;
    width: 80px;
    height: 40px;
    margin-top: 1%;
    margin-right: 10%;
    padding-left:10px;
    border-radius: 8px;
  }

  .city-place {
    float: right;
    width: 240px;
    height: 35px;
    margin-top: 1%;
    margin-bottom: 0;
    margin-right: 1%;
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
