import Vue from 'vue'
import Router from 'vue-router'
import Content from '../components/Content'

Vue.use(Router);

export default new Router({
  routes: [
    {
      path: '/content',
      name: 'Content',
      component: Content
    }
  ]
})
