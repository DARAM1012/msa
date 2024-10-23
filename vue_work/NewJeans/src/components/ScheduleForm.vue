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
        <label for="color">색깔 선택</label>
        <select id="color" v-model="color">
          <option value="PINK">PINK</option>
          <option value="ORANGE">ORANGE</option>
          <option value="YELLOW">YELLOW</option>
          <option value="BLUE">BLUE</option>
          <option value="GREEN">GREEN</option>
          <option value="VIOLET">VIOLET</option>
          <option value="GRAY">GRAY</option>
        </select>
      </div>
      <div>
        <label for="startdate">시작날짜</label>
        <input id="startdate" v-model="startdate" type="datetime-local" />
        <label for="enddate">종료날짜</label>
        <input id="enddate" v-model="enddate" type="datetime-local" />
      </div>
      <div>
        <label for="location">지도 넣는곳</label>
        <input id="location" v-model="location" />
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
import axios from 'axios'
import { useRouter } from 'vue-router'

const props = defineProps({
  selectedDate: String,
});
// ㄴ 프롭스로 받은 선택날짜

// emit 정의
const emit = defineEmits(['closeForm']);

const router = useRouter()  // Vue Router 사용

const title = ref('')
const color = ref('ORANGE')  // 기본 값은 'ORANGE'
const startdate = ref(props.selectedDate || '')
const enddate = ref('')
const location = ref('')
const description = ref('')

const submitSchedule = async () => {
  const scheduleData = {
    title: title.value,
    color: color.value,  // color 값이 드롭다운에서 선택한 값으로 설정됨
    start: startdate.value,
    end: enddate.value,
    location: location.value,
    content: description.value,
    calendarsIdx: 1
  }
  console.log(scheduleData);  // 제출 전 데이터 확인
  try {
    const response = await axios.post('http://localhost:8080/schedule/create', scheduleData, {
      headers: {
        'Content-Type': 'application/json'
      }
    })
    console.log('Schedule Submitted Successfully', response.data)
    emit('closeForm');
  } catch (error) {
    console.error('Failed to submit schedule:', error)
  }
}
</script>

<style scoped>
.schedule-form {
  padding: 20px;
  background-color: white;
  border-radius: 10px;
}
</style>
