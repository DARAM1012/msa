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
          <div class="hidden group-hover:block absolute bg-pink-300 p-5 rounded opacity-90">
            <div>
              <RouterLink to="/freeboardlist">Freeboardlist</RouterLink>
            </div>
            <div>
              <RouterLink to="/freeboardinput">Freeboardinput</RouterLink>
            </div>
          </div>
        </div>
        <div>
          <RouterLink to="/fileupload">fileupload</RouterLink>
        </div>
      </nav>
    </div>
    <RouterView />
  </header>
</template>

<style scoped></style>
