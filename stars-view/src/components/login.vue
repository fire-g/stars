<template>
  <div id="app">
    <div class="logo"></div>
    <div class="form-item" id='form-div1'>
      <input id="emil" type="text" autocomplete="off" placeholder="邮箱" :value="emil">
    </div>
    <div class="form-item" id='form-div2'>
      <input id="password" type="password" autocomplete="off" placeholder="登录密码" :value="password">
      <div class='forgot'><a href="register"
                             style='color: #1cccf4;font-size: 16px;text-decoration: none;'>忘记密码?</a></div>
      <p class="tip">{{this.loginPrompt}}</p>
    </div>
    <!-- <div class="form-item">
        <select id = 'getId'>
          <option value ="volvo" style = 'text-align:center;'>超级管理员</option>
          <option value ="saab" style = 'text-align:center;'>社团助理</option>
          <option value="opel" style = 'text-align:center;'>学生</option>
        </select>
    </div>
    -->
    <div class="form-item">
      <button id="submit" @click="login()">登 录</button>
    </div>
    <div class="reg-bar">
      <p style='color: #ffffff; font-family: Tahoma,Arial,"宋体",serif;'>还没有账号？点击这里 <a href="register">进行注册</a></p>
    </div>
  </div>
</template>

<script>
import $ajax from 'axios'
export default {
  data () {
    return {
      emil: '',
      password: '',
      loginPrompt: '',
      isSuccess: false
    }
  },
  created () {
  },
  methods: {
    login () {
      var emil = document.getElementById('emil').value
      var password = document.getElementById('password').value
      var form = new FormData()
      form.append('email', emil)
      form.append('password', password)
      $ajax({
        method: 'POST',
        url: '/api/login/',
        data: form
      }).then((response) => {
        const res = response.data
        // eslint-disable-next-line eqeqeq
        if (res.code == 400) {
          this.isSuccess = false
          this.loginPrompt = '邮箱或密码错误'
          // eslint-disable-next-line eqeqeq
        } else if (res.code == 0) {
          this.$router.push('/')
          this.isSuccess = true
        } else {
          this.isSuccess = false
          this.loginPrompt = '请输入密码'
        }
        console.log(res.loginPrompt)
        console.log(res.message)
      })
    }
  }
}
</script>

<style scoped>
/*@import "../css/login.css";*/
</style>
