<template>
  <div style="margin: auto;width: 800px">
    <li  v-for="item in list" v-bind:key="item.locationId" @click="click(item.locationId)">
      <span>{{item.country}}</span>
      <span>{{item.adm1}}</span>
      <span>{{item.adm2}}</span>
      <span>{{item.name}}</span>
    </li>
  </div>
</template>

<script>
import $ajax from 'axios'

export default {
  name: 'Search',
  data () {
    return {
      city: '',
      list: [{
        id: 0,
        locationId: '101011500',
        name: '平谷',
        lat: 40.14478,
        lon: 117,
        adm1: '北京',
        adm2: '北京',
        country: '中国'
      }]
    }
  },
  created () {
    this.city = this.$router.currentRoute.query.city
    $ajax({
      method: 'GET',
      url: '/api/location/' + this.city,
      contentType: 'application/x-www-form-urlencoded; charset=utf-8'
    }).then((response) => {
      this.list = response.data
    })
  },
  methods: {
    click (id) {
      // 使用Vue路由进行跳转
      this.$router.push('/?id=' + id)
    }
  }
}
</script>

<style scoped>

</style>
