import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '../components/HelloWorld'
import DayTrend from '../components/DayTrend'
import WeekTrend from '../components/WeekTrend'

Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    {
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld
    },
    {
      path: '/day-trend',
      name: 'DayTrend',
      component: DayTrend
    },
    {
      path: '/week-trend',
      name: 'WeekTrend',
      component: WeekTrend
    }
  ]
})
