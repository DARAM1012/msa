<script setup>
import { RouterView } from 'vue-router'
import HEADER from './components/HEADER.vue'
import FOOTER from './components/FOOTER.vue'
</script>

<template>
  <div id="nav">
    <HEADER></HEADER>
    <FOOTER></FOOTER>
  </div>

  <RouterView />
</template>

<style scoped></style>
