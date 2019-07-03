import Vue from 'vue'
import Router from 'vue-router'
import Main from '../views/Main'
import Login from '../views/Login'
import UserProfile from '../views/user/UserProfile'
import UserList from '../views/user/UserList'

import NotFound from '../views/error/NotFound'

Vue.use(Router);

export default new Router({
  mode: 'history', // 去掉路径的#号
  routes: [
    {
      // 登录页
      path: '/login',
      name: 'Login',
      component: Login
    },
    {
      // 首页
      // path: '/main/:username',
      path: '/main',
      name: 'Main',
      component: Main,
      children: [
        {
          path: '/user/profile/:id',
          name: 'UserProfile',
          component: UserProfile,
          props: true // 允许以props的方式来传递参数
        },
        {
          path: '/user/list',
          name: 'UserList',
          component: UserList
        },
        {
          path: '/goMain/:username',
          redirect: '/main/:username'
        }
      ]
    },
    {
      path: '*',
      component: NotFound
    }
  ]
})
