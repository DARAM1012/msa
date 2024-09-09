import { createRouter, createWebHistory } from 'vue-router';
import TheInsert from '../views/TheInsert.vue';
import TheSelect from '../views/TheSelect.vue';
import TheDelete from '../views/TheDelete.vue';
import TheHome from '../views/TheHome.vue';
import TheUpdate from '../views/TheUpdate.vue';

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: TheHome
    },
    {
      path: '/insert',
      name: 'Insert',
      component: TheInsert
    },
    {
      path: '/update',
      name: 'update',
      component: TheUpdate
    },
    {
      path: '/delete',
      name: 'delete',
      component: TheDelete
    },
    {
      path: '/select',
      name: 'select',
      component: TheSelect
    }
  ]
});

export default router;
