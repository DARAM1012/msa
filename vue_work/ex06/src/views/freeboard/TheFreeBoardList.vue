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
            <td class="border text-center">img</td>
          </tr>
        </thead>
        <tbody>
          <template v-if="arr && arr.length > 0">
            <!-- && <- 앞에꺼 true이면 뒤에꺼 확인해봅니다. -->
            <!-- || <- 앞에꺼 false이면 뒤에꺼 확인해봅니다. -->

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
              <template v-if="item.list[0]">
                <td class="border text-center text-lg p-1">
                  <img
                    :src="`http://localhost:10000/file/download/${item.list[0].name}`"
                    alt=""
                    srcset=""
                    width="150"
                  />
                </td>
              </template>
              <template v-else>
                <td class="border text-center text-lg p-1">없음</td>
              </template>
            </tr>
          </template>
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
  <div v-if="temp">
    <h1>나올 수도 있고...</h1>
  </div>
  <div>
    <button @click="changeTemp">나오게 하기</button>
  </div>
</template>

<script setup>
import axios from 'axios'
import { ref } from 'vue'
import { useRouter } from 'vue-router'

// 프론트에는 vue, angular,react 를 사용함
// javascript -> 다 사용가능
// null [] -> false

const temp = ref(null)
const changeTemp = () => {
  temp.value = !temp.value
}

const router = useRouter()
const arr = ref([])
const totalPages = ref(10)
const pageNum = ref(0)

const setPageNum = (num) => {
  pageNum.value = num
  getFreeBoard(num)
}

const viewPage = (idx) => {
  const data = { name: 'freeboardview', params: { idx } }
  router.push(data)
}

const getFreeBoard = (pageNum) => {
  if (pageNum == undefined) pageNum = 0
  axios
    .get(`http://localhost:10000/freeboard?pageNum=${pageNum}`)
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
