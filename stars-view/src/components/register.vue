<template>
  <div id="app">
    <div style="height:100%">
      <div class="logo"></div>
      <div class="form-item">
        <input id="emil" type="text" autocomplete="off" placeholder="邮箱" onchange="checkEmail()">
        <p class="tip" id='registerEmail'>邮箱格式不正确</p>
      </div>
      <div class="form-item">
        <input id="varife" type="text" autocomplete="off" placeholder="验证码">
        <input type = 'button' id="getCode" onclick = 'nowTime(this)' value = '获取验证码'>
      </div>
      <div class="form-item">
        <input id="password" type="password" autocomplete="off" placeholder="登录密码" onchange="checkPassword()">
      </div>
      <div class="form-item">
        <input id="passwordRepeat" type="password" autocomplete="off" placeholder="确认密码" onchange="checkPassword()">
        <p class="tip" id='registerPrompt'>密码输入不一致</p>
      </div>

      <div class="form-item">
        <input id="sno" type="text" autocomplete="off" placeholder="学号">
      </div>
      <div class="form-item">
        <input id="name" type="text" autocomplete="off" placeholder="姓名">
      </div>
      <div class="form-item">
        <button id="submit" onclick = "submitMessage()">注  册</button>
      </div>
      <div class="reg-bar">
        <p style='color: #ffffff; font-family: Tahoma,Arial,"宋体";'>已有账号？点击这里 <a href="login">登录</a></p>
      </div>
    </div>
    <div style="text-align:center;"></div>
  </div>
</template>

<script>
import $ajax from 'axios'
export default {
  data () {
    return {
      emil: '',
      checkCode: '',
      password: '',
      repeatPassword: '',
      countdown: 60
    }
  },
  created () {
  },
  methods: {
    getEmail () {

    },
    checkEmail () {

    },
    checkPassword () {

    },
    submit () {

    },
    nowTime (val) {
      if (val.value === '获取验证码') {
        // eslint-disable-next-line no-undef
        getEmail(val)
      }
    },
    refreshTime (val) {
      // eslint-disable-next-line eqeqeq
      if (this.countdown == 0) {
        val.value = '获取验证码'
        this.countdown = 60
        return false
      } else {
        val.value = this.countdown
        this.countdown--
      }

      setTimeout(function () { // 设置一个定时器，每秒刷新一次
        // eslint-disable-next-line no-undef
        refreshTime(val)
      }, 1000)
    }

  }
}
</script>

<style scoped>
/*@import "../css/register.css";*/

</style>
