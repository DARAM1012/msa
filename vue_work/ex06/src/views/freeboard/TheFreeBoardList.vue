<template>
  <div>
    <h1 class="aaa">FreeboardList</h1>
    <div class="px-5">
      <table class="border border-b-gray-500 w-full">
        <thead>
          <tr>
            <td class="border text-center">IDX</td>
            <td class="border text-center">title</td>
            <td class="border text-center">author</td>
            <td class="border text-center">regDate</td>
            <td class="border text-center">viewCount</td>
          </tr>
        </thead>
        <tbody>
            <tr v-for="item in arr" :key="item.idx">
                <td class="border text-center">{{ item.idx }}</td>
                <td class="border text-center">{{ item.title }}</td>
                <td class="border text-center">{{ item.creAuthor }}</td>
                <td class="border text-center">{{ item.regDate }}</td>
                <td class="border text-center">{{ item.view_count }}</td>
            </tr>
        </tbody>
      </table>
    </div>
  </div>
</template>

<script setup>
import axios from 'axios'
import { ref } from 'vue'
import { useRoute } from 'vue-router'

const title = ref('')
const content = ref('')

const route = useRoute()
const arr = ref([]);
  
console.log('route.params.aa = ' + route.params.aa)
console.log('route.params.aa = ' + route.params.bb)


//이거 쓰면 데이타 가져오는 거임
axios
  .get('http://localhost:8080/freeboard')
  .then(res => {
    console.log(res.data);
    arr.value = res.data;
  })
  .catch((e) => {
    console.log(e)
  })
</script>

<style scoped></style>
