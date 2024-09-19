<script setup>
import { RouterLink, RouterView } from 'vue-router'
</script>

<template>
  <header>
    <div class="p-5 bg-pink-300 text-white text-3xl">
      <nav class="flex space-x-5">
        <div>
          <RouterLink to="/">Home</RouterLink>
        </div>
        <div>
          <RouterLink to="/user">User</RouterLink>
        </div>
        <div class="group relative">
          <RouterLink to="/freeboardlist">Freeboard</RouterLink>
          <div class="hidden group-hover:block absolute bg-slate-400 p-5 rounded">
            <div>
              <RouterLink to="/freeboardlist">Freeboardlist</RouterLink>
            </div>
            <div>
              <RouterLink to="/freeboardinput">Freeboardinput</RouterLink>
            </div>   
          </div>
        </div>
      </nav>
    </div>
    <RouterView />
  </header>
</template>

<style scoped></style>
