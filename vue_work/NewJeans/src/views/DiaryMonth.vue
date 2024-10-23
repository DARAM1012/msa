<template>
    <div class="calendar">
      <h2>{{ year }}년 {{ month }}월</h2>
      <div class="calendar-grid">
        <div class="day" v-for="day in daysInMonth" :key="day.date">
          <div class="date">{{ day.date.getDate() }}</div>
          <div v-if="day.hasDiary" class="diary-indicator">📝</div>
        </div>
      </div>
    </div>
  </template>
  
  <script setup>
  import { ref, onMounted } from 'vue'
  import axios from 'axios'
  
  const year = ref(new Date().getFullYear())
  const month = ref(new Date().getMonth() + 1) // 0부터 시작하므로 +1
  const daysInMonth = ref([])
  
  const fetchDiaries = async () => {
    const idx = 1; // 사용자의 idx를 여기에 설정
    try {
      const response = await axios.get(`http://localhost:8080/diary/${idx}/${year.value}/${month.value}`)
      const diaries = response.data
  
      // 달력의 날짜와 일기 여부를 매칭
      daysInMonth.value = generateDaysInMonth(diaries)
    } catch (error) {
      console.error('Failed to fetch diaries:', error)
    }
  }
  
  const generateDaysInMonth = (diaries) => {
    const days = []
    const totalDays = new Date(year.value, month.value, 0).getDate() // 해당 월의 총 일수
    for (let day = 1; day <= totalDays; day++) {
      const date = new Date(year.value, month.value - 1, day) // 월은 0부터 시작
      const hasDiary = diaries.some(diary => new Date(diary.date).toDateString() === date.toDateString())
      days.push({ date, hasDiary })
    }
    return days
  }
  
  onMounted(() => {
    fetchDiaries()
  })
  </script>
  
  <style scoped>
  .calendar {
    display: flex;
    flex-direction: column;
    align-items: center;
  }
  .calendar-grid {
    display: grid;
    grid-template-columns: repeat(7, 1fr);
    gap: 10px;
    margin-top: 20px;
  }
  .day {
    border: 1px solid #ccc;
    padding: 10px;
    text-align: center;
    position: relative;
  }
  .diary-indicator {
    position: absolute;
    bottom: 5px;
    right: 5px;
  }
  </style>