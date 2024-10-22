import { createRouter, createWebHistory } from 'vue-router'
import Calendar from '../views/CalendarView.vue'
import Diary from '../views/DiaryView.vue'
import Teams from '../views/TeamsView.vue'
import Setting from '../views/SettingView.vue'
import SignUpp from '../views/SignUpp.vue';

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'calendar',
      component: Calendar,
    },
    {
      path: '/diary',
      name: 'diary',
      component: Diary,
    },
    {
      path: '/teams',
      name: 'teams',
      component: Teams,
    },
    {
      path: '/setting',
      name: 'setting',
      component: Setting,
    },
    {
      path: '/signUpp',
      name: 'signUpp',
      component: SignUpp,
    },
  ],
})

export default router
