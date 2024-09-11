<template>
  <div>
    <div class="flex flex-col items-center justify-center">
      <h1>{{ myVar }}</h1>
      <TheHeader></TheHeader>
      <RouterView />
    </div>
  </div>
</template>

<script setup>
import TheHeader from "./components/TheHeader.vue";
import { RouterView } from "vue-router";

const myVar = "안녕하세요";
</script>

<style lang="scss" scoped></style>
