<template>
  <div>
    <h1 class="text-5xl">안녕 tailwind</h1>
    <div class="p-5 flex space-x-5 bg-slate-500">
      <router-link class="text-white hover:text-gray-200 cursor-pointer" to="/">HOME</router-link>
      <router-link class="text-white hover:text-gray-200 cursor-pointer" to="/insert">INSERT</router-link>
      <router-link class="text-white hover:text-gray-200 cursor-pointer" to="/select">SELECT</router-link>
      <router-link class="text-white hover:text-gray-200 cursor-pointer" to="/update">UPDATE</router-link>
      <router-link class="text-white hover:text-gray-200 cursor-pointer" to="/delete">DELETE</router-link>
    </div>
    <router-view></router-view>
  </div>
</template>

<script>
import TheInsertVue from './views/TheInsert.vue';
export default {
  components: [TheInsertVue],
  setup() {
    return {};
  }
};
</script>

<style lang="scss" scoped></style>
