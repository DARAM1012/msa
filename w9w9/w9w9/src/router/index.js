import { createRouter, createWebHistory } from 'vue-router'
import RECIPEBOARD from '../views/RECIPEBOARD.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'RECIPEBOARD',
      component: RECIPEBOARD
    }
  ]
})

export default router
