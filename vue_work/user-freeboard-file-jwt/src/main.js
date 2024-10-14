import './assets/main.css'

// import {aa} from './AA';
import { createApp } from 'vue'
import App from './App.vue'
// import TheHome from './views/TheHome.vue'
import router from './router/index.js'
import { createPinia } from 'pinia';


const pinia = createPinia();

// Pinia를 Vue 앱에 등록

const app = createApp(App)

app.use(router)
app.use(pinia);

app.mount('#QWER')
