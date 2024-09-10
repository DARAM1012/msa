<template>
  <div>
    <h1>HOME</h1>
    <ul>
      <li v-for="user in list" v-bind:key="user.idx">
        idx = {{ user.idx }}
        name = {{ user.name }}
      </li>
    </ul>
    <button @click="select" class="bg-yellow-200 p-3 hover:border-yellow-100 border-gray-300">불러오기</button>
    <div v-for="num in mylist" v-bind:key="num">
      num = {{ num }}
    </div>
  </div>
</template>

<script>
import { ref } from 'vue';

export default {
  setup () {
    const mylist = [10,20,30];
  const list = ref([
  {
        "idx":1,
        "name": "바꾸세요",
        "age": 100,
        "email": "xx0215223@naver.com",
        "password": "1234",
        "wdate": "2024-09-06T11:18:45.773728"
    },
    {
        "idx":2,
        "name": "안되나",
        "age": 100,
        "email": "xx0215223@naver.com",
        "password": "1234",
        "wdate": "2024-09-06T11:18:45.773728"
    },
    {
        "idx":3,
        "name": "되나",
        "age": 100,
        "email": "xx0215223@naver.com",
        "password": "1234",
        "wdate": "2024-09-06T11:18:45.773728"
    }
  ]);
const select = ()=>{
  list.value = [{idx:1,name:"강제로 바꿈"}];
}
    fetch(`192.168.0.29:8080/user/select`)

    return {list,mylist,select}
  }
}
</script>

<style lang="scss" scoped>

</style>