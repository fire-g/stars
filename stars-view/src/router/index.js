import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '../components/HelloWorld'
import DayTrend from '../components/DayTrend'
import WeekTrend from '../components/WeekTrend'
import login from '../components/login'
import register from '../components/register'

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
    },
    {
      path: '/login',
      name: 'login',
      component: login
    },
    {
      path: '/register',
      name: 'register',
      component: register
    }
  ]
})
