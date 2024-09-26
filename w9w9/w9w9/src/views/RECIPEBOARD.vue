<template>
  <div>
    <h1 class="title">| OUR RECIPES |</h1>
    <p class="title2"><b>와구와구</b>와 맛있는 음식을 만들어보세요</p>
    <div class="grid">
      <div v-for="item in arr" :key="item" class="card" @click="viewPage(item.idx)">
        <img :src="item.imageUrl" alt="게시글 이미지" class="image" />
        <h2 class="card-title">My Recipe: {{ item.title }}</h2>
        <!-- 제목 변경 -->
      </div>
    </div>
    <div class="pagination">
      <ul class="pagination-list">
        <li class="arrow" v-if="pageNum > 0" @click="setPageNum(pageNum - 1)">
          &lt;
          <!-- 왼쪽 화살표 -->
        </li>
        <li
          class="page-number"
          v-for="num in totalPages"
          v-bind:key="num"
          @click="setPageNum(num - 1)"
        >
          {{ num }}
        </li>
        <li class="arrow" v-if="pageNum < totalPages - 1" @click="setPageNum(pageNum + 1)">
          &gt;
          <!-- 오른쪽 화살표 -->
        </li>
      </ul>
    </div>
  </div>
</template>

<script setup>
import axios from 'axios'
import { ref } from 'vue'
import { useRouter } from 'vue-router'

const router = useRouter()
const arr = ref([])
// const arr = ref([
//   { idx: 1, imageUrl: 'image1.jpg', title: 'Recipe 1' },
//   { idx: 2, imageUrl: 'image2.jpg', title: 'Recipe 2' },
//   { idx: 3, imageUrl: 'image3.jpg', title: 'Recipe 3' },
//   { idx: 4, imageUrl: 'image4.jpg', title: 'Recipe 4' },
//   { idx: 5, imageUrl: 'image5.jpg', title: 'Recipe 5' },
//   { idx: 6, imageUrl: 'image6.jpg', title: 'Recipe 6' },
//   { idx: 7, imageUrl: 'image7.jpg', title: 'Recipe 7' },
//   { idx: 8, imageUrl: 'image8.jpg', title: 'Recipe 8' }
//   // 추가 항목...
// ])

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
  if (pageNum === undefined) pageNum = 0
  axios
    .get(`http://localhost:10000/freeboard?pageNum=${pageNum}`)
    .then((res) => {
      arr.value = res.data.list
      totalPages.value = res.data.totalPages
    })
    .catch((e) => {
      console.error(e)
    })
}

// 페이지 호출 시 자동 실행
getFreeBoard()
</script>

<style scoped>
.title {
  text-align: center;
  font-size: 2rem;
  margin: 70px 0;
}

.title2 {
  text-align: center;
}

.grid {
  display: grid;
  grid-template-columns: repeat(5, 200px); /* 가로 5개 */
  grid-template-rows: repeat(3, 200px); /* 세로 3줄 */
  gap: 20px; /* 카드 간격 */
  text-align: center;
  justify-content: center;
}

.card {
  border: 1px solid #ccc;
  padding: 10px;
  cursor: pointer;
  transition: box-shadow 0.3s ease;
}

.card:hover {
  box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
}

.image {
  width: 100%;
  height: auto;
  margin-bottom: 10px;
}

.card-title {
  text-align: center;
  font-size: 1.2rem;
}

.pagination {
  display: flex;
  justify-content: center;
  margin-top: 20px;
}

.pagination-list {
  list-style-type: none; /* 리스트 스타일 제거 */
  display: flex;
  gap: 10px;
  padding: 0;
}

.arrow {
  cursor: pointer;
  padding: 10px;
}

.page-number {
  cursor: pointer;
  padding: 10px;
}
</style>
