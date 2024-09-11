import TheHome from '@/views/TheHome.vue';
import TheJoin from '@/views/TheJoin.vue';
import TheAbout from '@/views/TheAbout.vue';
import { createRouter, createWebHistory } from 'vue-router';

const router = createRouter({
  history: createWebHistory(),
  routes: [
    { path: '/', component: TheHome },
    { path: '/join', component: TheJoin },
    { path: '/about', component: TheAbout }
  ]
});

export default router;