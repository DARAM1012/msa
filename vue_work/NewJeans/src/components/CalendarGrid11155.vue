<script setup>
import { ref, watch } from 'vue'
import dayjs from 'dayjs'
import ScheduleForm from './ScheduleForm.vue' 
import DiaryForm from './DiaryForm.vue' 

const now = ref(dayjs())
const columns = ref([])
const groupColumns = ref([])

// selectDate 가 값이 null일때는 false 값이 date 로 바뀌면 true;
const selectDate = ref(null)
const isFlipped = ref(false) // 달력이 뒤집혔는지 여부를 관리하는 상태

const isScheduleFormVisible = ref(false) // ScheduleForm의 가시성 관리
const isDiaryFormVisible = ref(false) // DiaryForm의 가시성 관리


const subMonth = () => {
  now.value = dayjs(now.value).subtract(1, 'month')
}
const addMonth = () => {
  now.value = dayjs(now.value).add(1, 'month')
}
const selectDateFn = date => {
  console.log('dateClick', dayjs(date).format('YYYY-MM-DD'))
  selectDate.value = dayjs(date).format('YYYY-MM-DD')
  isFlipped.value = true // 날짜를 클릭하면 달력이 플립
}
const goToday = () => {
  now.value = dayjs() // 오늘 날짜로 돌아가기
}

// 스케줄, 다이어리 소환
const showScheduleForm = () => {
  isScheduleFormVisible.value = true
  isDiaryFormVisible.value = false
}

const showDiaryForm = () => {
  isDiaryFormVisible.value = true
  isScheduleFormVisible.value = false
}

watch(
  now,
  (newValue, _) => {
    columns.value = [] // 원래 있던 값 제거
    groupColumns.value = [] // 원래 있던 값 제거
    const startday = dayjs(now.value).startOf('month')
    const lastday = dayjs(now.value).endOf('month')
    const startdayOfWeek = startday.get('day')
    const lastdayOfWeek = lastday.get('day')

    // 저번달에 날짜 추가
    for (let i = 1; i <= startdayOfWeek; i++) {
      columns.value.unshift(dayjs(startday).subtract(i, 'day'))
    }
    // 현재 달력에 날짜 추가
    for (let i = 0; i < lastday.get('date'); i++) {
      columns.value.push(dayjs(startday).add(i, 'day'))
    }
    // 다음달에 날짜 추가
    for (let i = 1; i <= 6 - lastdayOfWeek; i++) {
      columns.value.push(dayjs(lastday).add(i, 'day'))
    }

    for (let i = 0; i < columns.value.length; i += 7) {
      groupColumns.value.push(columns.value.slice(i, i + 7))
    }
  },
  {
    immediate: true,
    deep: true,
  },
)



</script>

<template>
  <div class="calendar-wrapper">
    <!-- 달력이 뒤집힌 상태에 따라 조건부 렌더링 -->
    <div class="calendar-container" :class="{ flipped: isFlipped }">
      <!-- 달력 앞면 영역 -->
      <div class="vv front">
        <h1 class="Calender-title">
          <button @click="goToday" class="Today-button">Today</button>
          <button @click="subMonth()" class="B-Month-button">
            <i><</i>
          </button>
          <div class="YMYM">
            <span class="year">{{ now.format('YYYY') }}</span>
            <span class="month">{{ now.format('MMMM') }}</span>
          </div>
          <button @click="addMonth()" class="A-Month-button">
            <i>></i>
          </button>
        </h1>
        <div class="DOWgrid">
          <div class="Sun">Sun</div>
          <div class="Dayss">Mon</div>
          <div class="Dayss">Tue</div>
          <div class="Dayss">Wed</div>
          <div class="Dayss">Thur</div>
          <div class="Dayss">Fri</div>
          <div class="Sat">Sat</div>
        </div>
        <div class="CALgrid" v-for="group in groupColumns" :key="group.length">
          <div
            @click="selectDateFn(column)"
            v-for="(column, index) in group"
            :key="column.format('YYYY-MM-DD')"
            class="Datecell"
            :class="{
              sundays: index % 7 == 0,
              saturdays: index % 7 == 6,
              notthisMdays: !column.isSame(now, 'month'),
              today: column.isSame(dayjs(), 'day'),
            }"
          >
            <span class="date-number">{{ column.get('date') }}</span>
          </div>
        </div>
      </div>

      <!-- 뒤집힌 화면에서 일정 및 다이어리 버튼 -->
      <div class="flipped-content">
        <div v-if="!isScheduleFormVisible && !isDiaryFormVisible" class="button-group">
          <button class="schedule-btn" @click="showScheduleForm">
            Schedule
          </button>
          <button class="diary-btn" @click="showDiaryForm">
            Diary
          </button>
        </div>
      </div>
    </div>

    <!-- ScheduleForm 컴포넌트 렌더링 -->
    <ScheduleForm v-if="isScheduleFormVisible" />

    <!-- DiaryForm 컴포넌트 렌더링 -->
    <DiaryForm v-if="isDiaryFormVisible" />
  </div>
</template>

<style lang="scss" scoped>
/* 달력의 전체적인 구조 */
.calendar-wrapper {
  background-color: white;
  border-radius: 10px;
  perspective: 1000px;
  display: flex;
  align-items: flex-start; /* 상단 정렬로 변경 */
  height: auto; /* vh 설정 대신 auto로 */
  padding-bottom: 20px; /* 하단에도 패딩 추가 */
  padding-left: 100px;
  min-height: 500px; /* 최소 높이 설정 */
  width: 60%; /* 전체 너비 사용 */
  height: 750px;
  padding-top: 30px;
  margin-left: 100px;
  overflow: hidden; /* 스크롤 방지 */
}

/* 달력과 플립 애니메이션 적용 */
.calendar-container {
  width: 100%;
  transition: transform 0.8s;
  transform-style: preserve-3d;
  position: relative;
  height: 100%;
  min-height: 400px; /* 최소 높이 설정 */
  padding: 10px;
}

.flipped {
  transform: rotateY(180deg); /* 180도 회전 */
}

/* 달력 앞면과 뒷면 */
.vv,
.flipped-content {
  width: 100%;
  height: 100%;
  position: absolute;
  top: 0;
  left: -50px;
  backface-visibility: hidden; /* 뒷면이 보이지 않도록 */
  min-height: 750px; /* 최소 높이 설정 */
}

.flipped-content {
  transform: rotateY(180deg); /* 뒤집힌 상태에서도 뒷면이 보이도록 */
  justify-content: center;
  width: 1000px;
}

/* 달력 스타일 */
.calendar {
  backface-visibility: hidden; /* 플립 시 뒷면이 보이지 않도록 */
}

.flipped-content {
  backface-visibility: hidden;
  transform: rotateY(180deg); /* 뒤집힌 상태에서도 올바르게 보이도록 */
}

.flipped-content {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  height: 100%;
  padding: 20px;
}

/* 버튼 그룹 스타일 */
.button-group {
  display: flex;
  justify-content: center;
  gap: 20px;
  margin-top: 2rem;
}

.schedule-btn,
.diary-btn {
  background-color: #333;
  color: white;
  padding: 1rem;
  border-radius: 8px;
  cursor: pointer;
  border: none;
  font-size: 1.2rem;
  transition: background-color 0.3s;
}

.schedule-btn:hover,
.diary-btn:hover {
  background-color: #555;
}


/* 달력 상단 월 이동 버튼 및 월 스타일 */
.Calender-title {
  display: flex;
  justify-content: center; /* 가운데 정렬 */
  align-items: center;
  gap: 1rem; /* 버튼과 연도/월 사이 간격 */
  font-size: 2rem;
  font-weight: 500;
  margin-bottom: 1rem;
  position: relative; /* Today 버튼 고정을 위한 상대 위치 */
}

.Today-button {
  background-color: #333;
  color: white;
  border: none;
  padding: 0.5rem 1rem;
  border-radius: 20px;
  font-size: 0.9rem;
  cursor: pointer;
  position: absolute; /* 절대 위치 설정 */
  left: 10px; /* 왼쪽 정렬 */
}

.B-Month-button,
.A-Month-button {
  background-color: white;
  border: none;
  width: 2rem;
  height: 2rem;
  cursor: pointer;
  font-size: 1.25rem;
}

.YMYM {
  display: flex;
  flex-direction: column;
  align-items: center;
}

.year,
.month {
  display: block;
  text-align: center;
}

.year {
  font-size: 1.5rem;
}

.month {
  font-size: 1.2rem;
}

/* 달력 그리드와 날짜 셀 스타일 */
.DOWgrid,
.CALgrid {
  display: grid;
  grid-template-columns: repeat(7, 1fr); /* 7열 그리드 */
  gap: 15px;
  text-align: center;
  margin-bottom: 1rem;
}

.Datecell {
  background-color: #f7f7f7;
  border-radius: 3px;
  font-size: 1rem;
  cursor: pointer;
  aspect-ratio: 1 / 1;
  display: flex;
  align-items: center;
  justify-content: center;
  position: relative;
  transition:
    background-color 0.2s,
    border 0.2s;
}

.date-number {
  position: absolute;
  top: 10px;
  right: 10px;
  font-size: 1rem;
}

.Datecell:hover {
  background-color: #e1e1e1;
}

/* 요일 스타일 */
.Sun {
  padding: 0.75rem;
  color: red;
  font-weight: 500;
}

.Dayss {
  padding: 0.75rem;
  color: black;
  font-weight: 500;
}

.Sat {
  padding: 0.75rem;
  color: blue;
  font-weight: 500;
}

/* 특수 날짜 스타일 */
.sundays {
  color: #dc2626;
}

.saturdays {
  color: #2563eb;
}

.notthisMdays {
  opacity: 0.35;
}

.today {
  border: 2px solid black;
}
</style>
