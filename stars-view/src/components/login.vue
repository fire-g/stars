<template>
  <div>
    <div class="logo"></div>
    <div class="form-item" id='form-div1'>
      <input id="emil" type="text" autocomplete="off" placeholder="邮箱">
    </div>
    <div class="form-item" id='form-div2'>
      <input id="password" type="password" autocomplete="off" placeholder="登录密码">
      <div class='forgot'><a href="register.vue"
                             style='color: #1cccf4;font-size: 16px;text-decoration: none;'>忘记密码?</a></div>
      <p class="tip" id='loginPrompt'>邮箱或密码不正确</p>
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
      <button id="submit">登 录</button>
    </div>
    <div class="reg-bar">
      <p style='color: #ffffff; font-family: Tahoma,Arial,"宋体",serif;'>还没有账号？点击这里 <a href="register.vue">进行注册</a></p>
    </div>
  </div>
</template>

<script>
</script>

<style scoped>
@import "../css/login.css";
</style>
