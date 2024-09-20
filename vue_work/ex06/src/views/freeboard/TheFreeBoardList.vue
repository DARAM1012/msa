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
          <tr
            v-for="item in arr"
            :key="item.idx"
            class="cursor-pointer hover:bg-slate-200"
            @click="viewPage(item.idx)"
          >
            <td class="border text-center text-lg p-2">{{ item.idx }}</td>
            <td class="border text-center text-lg p-2">{{ item.title }}</td>
            <td class="border text-center text-lg p-2">{{ item.creAuthor }}</td>
            <td class="border text-center text-lg p-2">{{ item.regDate }}</td>
            <td class="border text-center text-lg p-2">{{ item.view_count }}</td>
          </tr>
        </tbody>
      </table>
    </div>
    <div class="flex justify-center mt-5">
      <ul class="flex space-x-2">
        <li
          class="cursor-pointer p-3"
          v-for="num in totalPages"
          v-bind:key="num"
          @click="setPageNum(num - 1)"
        >
          {{ num }}
        </li>
      </ul>
    </div>
  </div>
</template>

<script setup>
import axios from 'axios'
import { ref } from 'vue'
import { useRouter } from 'vue-router'

// const title = ref('')
// const content = ref('')

const router = useRouter()
const arr = ref([])
const totalPages = ref(10)
const pageNum = ref(0)

const setPageNum = (num) => {
  pageNum.value = num;
  getFreeBoard(num);
}

const viewPage = (idx) => {
  const data = {name:'freeboardview',params:{idx}};
  router.push(data);
}

const getFreeBoard = (pageNum) => {
  if(pageNum==undefined) pageNum=0;
  axios.get(`http://localhost:8080/freeboard?pageNum=${pageNum}`)
    .then((res) => {
      arr.value = res.data.list
      totalPages.value = res.data.totalPages
    })
    .catch((e) => {
      console.log(e)
    })
}


//page 호출되자마자 자동실행

getFreeBoard()
</script>

<style scoped></style>
