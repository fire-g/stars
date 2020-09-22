<template>
  <div id="header">
    <div id="header-title">
      <img class="img-logo" src="../assets/logo.png">
      <input class="city-place" type="text" placeholder="搜索市、区、县等">
      <input class="back-home" type="button" value="返回" onclick="window.location.href='/'">
    </div>
    <div id="link-one"></div>
    <div id="header-content">
      <!-- 趋势图 -->
    </div>
  </div>
</template>

<script>
export default {
  name: 'Nav'
}
</script>

<style scoped>

</style>
