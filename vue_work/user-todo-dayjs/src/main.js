import './assets/main.css';

import { createApp } from 'vue';
import { createPinia } from 'pinia';

import App from './App.vue';
import router from './router';

const app = createApp(App);

app.use(createPinia());
app.use(router);

window.Kakao.init('477ea0788a39a67ac40fa6b1bc49e7d8'); // 사용하려는 앱의 JavaScript 키 입력

app.mount('#app');
