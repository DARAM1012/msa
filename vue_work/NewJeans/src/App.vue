<script setup>
import { RouterLink, RouterView } from 'vue-router'
import MenuBar from './components/MenuBar.vue'
import HeaderTop from './components/HeaderTop.vue'
import CalendarView from './views/CalendarView.vue';
</script>

<template>
  <HeaderTop />
  <MenuBar class="Menubar" />
  <CalendarView />

  <RouterView />
</template>

<style scoped>
.Menubar{
  position: relative; 
}

.CalendarGrid{
  position: absolute;
  top: 20%; 
  left: 40%;
  ;
}
</style>
