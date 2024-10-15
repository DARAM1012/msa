<template>
  <header>
    <div class="p-5 bg-slate-500 text-white text-3xl">
      <nav class="flex justify-between">
        <div class="flex space-x-5">
          <div>
            <RouterLink to="/">HOME</RouterLink>
          </div>
          <div>
            <RouterLink to="/user">USER</RouterLink>
          </div>
          <div class="group relative">
            <RouterLink to="/freeboardlist">FREEBOARD</RouterLink>
            <div
              class="opacity-0 group-hover:opacity-100 transition absolute bg-slate-500 p-5 top-8 -left-5 rounded"
            >
              <div>
                <RouterLink to="/freeboardlist">FREEBOARDLIST</RouterLink>
              </div>
              <div>
                <RouterLink to="/freeboardinput">FREEBOARDINPUT</RouterLink>
              </div>
            </div>
          </div>
          <div class="group relative">
            <RouterLink to="/fileupload">FILE</RouterLink>
            <div
              class="opacity-0 group-hover:opacity-100 transition absolute bg-slate-500 p-5 top-8 -left-5 rounded"
            >
              <div>
                <RouterLink to="/fileupload">FILEUPLOAD</RouterLink>
              </div>
              <div>
                <RouterLink to="/fileuploads">FILEUPLOADS</RouterLink>
              </div>
              <div>
                <RouterLink to="/filedownload">FILEDOWNLOAD</RouterLink>
              </div>
            </div>
          </div>
        </div>
        <template v-if="loginPinia.loginCheck">
          <div class="flex space-x-5"> 
            <h1>{{ loginPinia.name }} 님</h1>
            <button @click="logout">
              로그아웃
            </button>
          </div>
        </template>
        <template v-else>
          <div class="flex space-x-5">
            <div>
              <RouterLink to="/join">JOIN</RouterLink>
            </div>
            <div>
              <RouterLink to="/login">LOGIN</RouterLink>
            </div>
          </div>
        </template>
      </nav>
    </div>
    <!-- {{ loginPinia.loginCheck }} -->
  </header>
</template>

<script setup>
import { doLoginCheck } from '@/api/loginApi';
import { useLoginStore } from '@/store/loginPinia';
import { watchEffect } from 'vue';
import { RouterLink } from 'vue-router';

const loginPinia = useLoginStore();
const logout = () => {
  localStorage.removeItem("token");
  loginPinia.logout();
}

watchEffect(async () => {
  const result = await doLoginCheck();
  if (result == false) {
    loginPinia.logout();
  } else {
    if (result.status == 200) {
      loginPinia.login(result.data);
    } else if (result.status == 401) {
      localStorage.removeItem('token');
      loginPinia.logout();
    }
  }
});
</script>

<style lang="scss" scoped></style>

