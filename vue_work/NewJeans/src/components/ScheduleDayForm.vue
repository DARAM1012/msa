<template>
  <div>
    <!-- 일정 및 일기 조회 섹션 -->
    <div class="day-form" v-if="showDayView">
      <h2>{{ formattedDate }} 일정 및 일기</h2>

      <h1>ㅁㅁㅁㅁㅁ {{ selectedDate }}</h1>
      <div class="schedule-section">
        <h3>일정</h3>
        <div v-if="schedules.length > 0">
          <div
            v-for="(schedule, index) in schedules"
            :key="index"
            class="schedule-item"
            :style="{ backgroundColor: schedule.color }"
            @click="toggleExpand(index)"
          >
            <h4>{{ schedule.title }}</h4>
            <p>{{ schedule.content }}</p>
            <p><strong>장소:</strong> {{ schedule.location }}</p>

            <div v-if="isScheduleExpanded[index]">
              <p><strong>시작:</strong> {{ schedule.start }}</p>
              <p><strong>종료:</strong> {{ schedule.end }}</p>
            </div>
          </div>
        </div>
        <div v-else>
          <p>해당 날짜에 등록된 일정이 없습니다.</p>
        </div>
      </div>

      <div class="diary-section">
        <h3>일기</h3>
        <div v-if="diaries.length > 0">
          <div v-for="(diary, index) in diaries" :key="index" class="diary-item">
            <h4>{{ diary.title }}</h4>
            <p>{{ diary.content }}</p>
            <p><strong>카테고리:</strong> {{ diary.category }}</p>
          </div>
        </div>
        <div v-else>
          <p>해당 날짜에 작성된 일기가 없습니다.</p>
        </div>
      </div>
    </div>

    <!-- 일정 작성 섹션 -->
    <div class="schedule-form" v-else>
      <h2>일정 작성</h2>
      <form @submit.prevent="submitSchedule">
        
        <div>
          <label for="title">제목</label>
          <input id="title" v-model="title" />
        </div>
        <div>
          <label for="color">색깔 넣는곳</label>
          <input id="color" v-model="color" />
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
  </div>
</template>

<script setup>
import { ref, onMounted, watch } from 'vue'
import axios from 'axios'
import { useRouter, useRoute } from 'vue-router'

const router = useRouter()
const route = useRoute()

// props로 받은 selectedDate 처리
const props = defineProps({
  selectedDate: String, // 날짜를 프롭스로 받음
});

// 날짜가 변경되면 해당 날짜에 대한 일정을 불러오기
watch(() => props.selectedDate, async (newDate) => {
  if (newDate) {
    await fetchDayData(newDate); // 날짜가 바뀌면 데이터 가져오기
  }
}, { immediate: true });


// 일정 및 일기 조회 관련 상태
const schedules = ref([])  // 일정 목록
const diaries = ref([])    // 일기 목록
const formattedDate = ref('')
const isScheduleExpanded = ref([]) // 일정 확장/축소 상태
const showDayView = ref(true)  // 일정 및 일기 조회 화면이 보일지 여부

// 일정 작성 관련 상태
const title = ref('')
const color = ref('ORANGE')
const startdate = ref('')
const enddate = ref('')
const location = ref('')
const description = ref('')

// 날짜 포맷팅 함수
const formatDate = (year, month, day) => {
  return `${year}.${month}.${day}`
}

// 일정 및 일기 조회 함수
// const fetchDayData = async () => {
//   // route.params가 유효한지 확인하고, 유효하지 않으면 기본 값을 제공
//   const params = route.params || {};  // params가 undefined일 경우 빈 객체로 대체
//   const { idx = 1, year = '', month = '', day = '' } = params;  // params에서 값 추출, 기본값 제공

// 아래 fetchDayData 함수에서 selectedDate를 활용
const fetchDayData = async (selectedDate) => {
  const [year, month, day] = selectedDate.split('-'); // 선택된 날짜를 분해하여 year, month, day 값 생성
  const idx = 1; // 테스트를 위한 고정 idx 값


  try {
    // 값 출력해서 확인
    console.log('idx = ' + idx);
    console.log('year = ' + year);
    console.log('month = ' + month);
    console.log('day = ' + day);

    // 일정 조회
    const scheduleResponse = await axios.get(`http://localhost:8080/schedule/${idx}/${year}/${month}/${day}`);
    schedules.value = scheduleResponse.data;

    // 일정 수만큼 isScheduleExpanded 배열 초기화
    isScheduleExpanded.value = schedules.value.map(() => false);

    // 일기 조회
    const diaryResponse = await axios.get(`http://localhost:8080/diary/${idx}/${year}/${month}/${day}`);
    diaries.value = diaryResponse.data;

    formattedDate.value = formatDate(year, month, day);
  } catch (error) {
    console.error('데이터 조회 실패:', error);
  }
};

// 일정 작성 후 조회 페이지로 이동
const submitSchedule = async () => {
  const scheduleData = {
    title: title.value,
    color: color.value,
    start: startdate.value,
    end: enddate.value,
    location: location.value,
    content: description.value,
    calendarsIdx: 1
  }
  
  try {
    const response = await axios.post('http://localhost:8080/schedule/create', scheduleData, {
      headers: {
        'Content-Type': 'application/json'
      }
    })
    console.log('Schedule Submitted Successfully', response.data)

    // 일정 저장이 완료되면 일정 조회 페이지로 이동
    showDayView.value = true
    fetchDayData() // 새로운 데이터 조회
  } catch (error) {
    console.error('Failed to submit schedule:', error)
  }
}

// 일정 확장/축소 상태 토글 함수
const toggleExpand = (index) => {
  isScheduleExpanded.value[index] = !isScheduleExpanded.value[index]
}

// 컴포넌트가 마운트될 때 데이터 조회 함수 호출
onMounted(fetchDayData)
</script>

<style scoped>
.day-form {
  padding: 20px;
  background-color: white;
  border-radius: 10px;
}

.schedule-form {
  padding: 20px;
  background-color: white;
  border-radius: 10px;
}

.schedule-section, .diary-section {
  margin-bottom: 20px;
}

.schedule-item, .diary-item {
  margin-bottom: 15px;
  padding: 15px;
  border-radius: 8px;
  color: black;
  cursor: pointer;
  transition: max-height 0.3s ease, opacity 0.3s ease;
  overflow: hidden;
}

.schedule-item h4, .diary-item h4 {
  margin: 0;
  font-size: 1.5rem;
}

.schedule-item p, .diary-item p {
  margin: 5px 0;
}
</style>
