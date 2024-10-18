import './assets/main.css'

import { createApp } from 'vue'
import { createPinia } from 'pinia'

import App from './App.vue'
import router from './router'

const app = createApp(App)

app.use(createPinia())
app.use(router)

window.Kakao.init('99f806e6a12394255f93d08473d7c714'); // 사용하려는 앱의 JavaScript 키 입력

app.mount('#app')
