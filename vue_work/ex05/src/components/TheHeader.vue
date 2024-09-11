<template>
  <div>
    <h1>TheHeader</h1>
    <RouterLink to="/">Home</RouterLink>
    <RouterLink to="/join">JOIN</RouterLink>
    <RouterLink to="/about">TheAbout</RouterLink>
  </div>
</template>

<script setup>
import { RouterLink } from "vue-router";
</script>

<style lang="scss" scoped></style>
