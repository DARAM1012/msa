<template>
  <div class="diary-view-container">
    <!-- <h2>일기 목록</h2> -->

    <!-- 카테고리 버튼과 정렬 버튼을 포함한 툴바 -->
    <div class="toolbar">
      <!-- 카테고리 버튼 섹션 -->
      <div class="category-buttons">
        <button
          v-for="category in categories"
          :key="category.value"
          @click="fetchDiaries(category.value)"
          :class="{ selected: selectedCategory === category.value }"
        >
          {{ category.label }}
        </button>
      </div>

      <!-- 정렬 버튼 섹션 -->
      <div class="sort-buttons">
        <button
          @click="sortDiaries('LATEST')"
          :class="{ selected: sortOrder === 'LATEST' }"
        >
          최신순
        </button>
        <button
          @click="sortDiaries('OLDEST')"
          :class="{ selected: sortOrder === 'OLDEST' }"
        >
          오래된순
        </button>
      </div>
    </div>

    <!-- 일기 목록 출력 -->
    <div class="diary-list" v-if="diaries.length > 0">
      <div
        v-for="(diary, index) in sortedDiaries"
        :key="index"
        class="diary-item"
      >
        <h3>{{ diary.title }}</h3>
        <p>{{ diary.date }}</p>
        <p>{{ diary.category }}</p>
      </div>
    </div>
    <div v-else>
      <p>해당 카테고리의 일기가 없습니다.</p>
    </div>

    <!-- 페이지네이션 추가 -->
    <div class="pagination">
      <button
        v-for="page in totalPages"
        :key="page"
        @click="goToPage(page)"
        :class="{ active: currentPage === page }"
      >
        {{ page }}
      </button>
    </div>
  </div>
</template>

<script setup>
import { ref, onMounted, computed } from 'vue'
import axios from 'axios'

// 다이어리 목록 상태
const diaries = ref([])
const sortOrder = ref('LATEST') // 기본 정렬은 최신순
const selectedCategory = ref('ALL') // 기본 카테고리는 전체보기

// 카테고리 목록
const categories = [
  { label: '전체보기', value: 'ALL' },
  { label: '#일기', value: 'DAILY' },
  { label: '#성장일지', value: 'GROWTH' },
  { label: '#운동', value: 'EXERCISE' },
  { label: '#여행', value: 'TRIP' },
  { label: '#기타', value: 'ETC' },
]

// 유저 idx
const userIdx = 1 // 예시로 고정값, 실제로는 로그인한 유저의 idx를 가져와야 함

// 일기 조회 함수
const fetchDiaries = async category => {
  selectedCategory.value = category
  let url = ''

  // 카테고리가 ALL일 경우에는 여러 카테고리를 합쳐서 조회
  if (category === 'ALL') {
    url = `http://localhost:8080/diary/${userIdx}/ALL`
  } else {
    url = `http://localhost:8080/diary/${userIdx}/${category}`
  }

  try {
    const response = await axios.get(url)
    diaries.value = response.data
    // 리스트 가져온 후 기본 정렬은 최신순으로
    sortOrder.value = 'LATEST'
  } catch (error) {
    console.error('일기 조회 중 오류 발생:', error)
  }
}

// 정렬 함수
const sortDiaries = order => {
  sortOrder.value = order
}

// 정렬된 다이어리 목록 (computed로 동적 정렬)
const sortedDiaries = computed(() => {
  return [...diaries.value].sort((a, b) => {
    if (sortOrder.value === 'LATEST') {
      return new Date(b.date) - new Date(a.date)
    } else {
      return new Date(a.date) - new Date(b.date)
    }
  })
})

// 컴포넌트가 처음 로드될 때 전체보기 호출
onMounted(() => {
  fetchDiaries('ALL')
})
</script>

<style scoped>
.diary-view-container {
  width: 70%;
  height: 130%;
  padding: 20px;
  border-radius: 10px;
  margin: 2vh 5vh;
  background-color: white;
  text-align: center; /* 전체를 가운데 정렬 */
  box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
}

.toolbar {
  display: flex;
  justify-content: center; /* 전체 중앙 정렬 */
  align-items: center;
  margin-bottom: 20px;
  margin-top: 50px;
}

.category-buttons {
  display: flex;
  gap: 10px;
  margin-right: 70px; /* 카테고리와 정렬 버튼 사이 간격 조정 */
}

.category-buttons button {
  padding: 10px 20px;
  border: 1px solid #ccc;
  background-color: white;
  color: black;
  border-radius: 20px;
  cursor: pointer;
}

.category-buttons button.selected {
  background-color: black;
  color: white;
}

.sort-buttons {
  display: flex;
  gap: 10px;
}

.sort-buttons button {
  padding: 10px 20px;
  border: 1px solid #ccc;
  background-color: white;
  color: black;
  border-radius: 20px;
  cursor: pointer;
}

.sort-buttons button.selected {
  background-color: black;
  color: white;
}

.diary-list {
  margin-top: 20px;
}

.diary-item {
  padding: 15px;
  border-bottom: 1px dashed #ccc;
  display: flex;
  justify-content: space-between;
  align-items: center;
}

.pagination {
  display: flex;
  justify-content: center;
  margin-top: 20px;
}

.pagination button {
  padding: 10px;
  margin: 0 5px;
  background-color: white;
  border: 1px solid #ccc;
  border-radius: 50%;
  cursor: pointer;
}

.pagination button.active {
  background-color: black;
  color: white;
}
</style>
