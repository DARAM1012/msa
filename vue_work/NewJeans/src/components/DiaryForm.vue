<template>
    <div class="diary-form">
      <h2>다이어리 작성</h2>
      <form @submit.prevent="submitDiary">
        <!-- 다이어리 작성 폼 예시 -->
        <div>
          <label for="title">제목</label>
          <input id="title" v-model="title" />
        </div>
        <div>
          <label for="date">날짜</label>
          <input id="date" v-model="date" type="date" />
        </div>
        <div>
          <label for="content">내용</label>
          <textarea id="content" v-model="content"></textarea>
        </div>
        <button type="submit">저장</button>
      </form>
    </div>
  </template>
  
  <script setup>
  import { ref } from 'vue'
  
  const title = ref('')
  const date = ref('')
  const content = ref('')
  
  const submitDiary = () => {
    console.log('Diary Submitted', { title: title.value, date: date.value, content: content.value })
  }
  </script>
  
  <style scoped>
  /* 스타일링 */
  .diary-form {
    padding: 20px;
    background-color: white;
    border-radius: 10px;
  }
  </style>
  