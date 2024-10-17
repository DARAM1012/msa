<script setup>
import { RouterLink, RouterView } from 'vue-router'

</script>

<template>
  <header class="flex space-x-10">
   <RouterLink to="/">HOME</RouterLink>
   <RouterLink to="/month">MONTH</RouterLink>
   <RouterLink to="/about">ABOUT</RouterLink>
  </header>
  <RouterView />
</template>

<style scoped></style>
