<script setup>
import { RouterView } from 'vue-router'
import HEADER from './components/HEADER.vue'
import FOOTER from './components/FOOTER.vue'
import RECIPEBOARD from './views/RECIPEBOARD.vue'
</script>

<template>
  <div id="nav">
    <HEADER></HEADER>
    <FOOTER></FOOTER>
  </div>
  <div>
    <RECIPEBOARD></RECIPEBOARD>
  </div>
  <RouterView />
</template>

<style scoped></style>
