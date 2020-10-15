<template>
  <div style="margin: auto;width: 800px">
    <b-list-group v-for="item in list" v-bind:key="item.locationId" @click="click(item.locationId)">
      <b-list-group-item v-if="item.locationId === '0'" class="list-group">搜索城市不存在，返回主界面</b-list-group-item>
      <b-list-group-item v-else class="list-group">{{item.country}} {{item.adm1}} {{item.adm2}} {{item.name}}</b-list-group-item>
    </b-list-group>
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
        locationId: '0',
        name: '南昌',
        lat: 40.14478,
        lon: 117,
        adm1: '江西',
        adm2: '南昌',
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
      if (this.list[0].locationId === '0') {
        this.list[0].locationId = this.$cookieStore.getCookie('locationId')
        this.$router.push('/?id=' + this.list[0].locationId)
      } else {
        // 使用Vue路由进行跳转
        this.$router.push('/?id=' + id)
      }
    }
  }
}
</script>

<style scoped>
  .list-group {
    text-align: center;
  }

  .list-group:hover {
    background: #ACC0D8;
  }
</style>
