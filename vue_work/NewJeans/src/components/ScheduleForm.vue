<template>
    <div class="schedule-form">
      <h2>일정 작성</h2>
      <form @submit.prevent="submitSchedule">
        <!-- 일정 작성 폼 예시 -->
        <div>
          <label for="title">제목</label>
          <input id="title" v-model="title" />
        </div>
        <div>
          <label for="date">날짜</label>
          <input id="date" v-model="date" type="date" />
        </div>
        <div>
          <label for="description">내용</label>
          <textarea id="description" v-model="description"></textarea>
        </div>
        <button type="submit">저장</button>
      </form>
    </div>
  </template>
  
  <script setup>
  import { ref } from 'vue'
  
  const title = ref('')
  const date = ref('')
  const description = ref('')
  
  const submitSchedule = () => {
    console.log('Schedule Submitted', { title: title.value, date: date.value, description: description.value })
  }
  </script>
  
  <style scoped>
  /* 스타일링 */
  .schedule-form {
    padding: 20px;
    background-color: white;
    border-radius: 10px;
  }
  </style>
  