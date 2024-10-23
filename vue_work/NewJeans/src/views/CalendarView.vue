<script setup>
import { ref, watch } from 'vue'
import dayjs from 'dayjs'
import ScheduleForm from '@/components/ScheduleForm.vue'
import DiaryForm from '@/components/DiaryForm.vue'
import ScheduleDayForm from '@/components/ScheduleDayForm.vue'

const now = ref(dayjs())
const columns = ref([])
const groupColumns = ref([])

const selectDate = ref(null)
const isFlipped = ref(false)

const isScheduleFormVisible = ref(false)
const isDiaryFormVisible = ref(false)

const flipBack = () => {
  isFlipped.value = false
  isScheduleFormVisible.value = false
  isDiaryFormVisible.value = false
}

const subMonth = () => {
  now.value = dayjs(now.value).subtract(1, 'month')
}
const addMonth = () => {
  now.value = dayjs(now.value).add(1, 'month')
}
const selectDateFn = date => {
  selectDate.value = dayjs(date).format('YYYY-MM-DD')
  isFlipped.value = true
}
const goToday = () => {
  now.value = dayjs()
}

const showScheduleForm = () => {
  isScheduleFormVisible.value = true
  isDiaryFormVisible.value = false
}

const showDiaryForm = () => {
  isDiaryFormVisible.value = true
  isScheduleFormVisible.value = false
}

// 스케줄 폼 닫기
const closeScheduleForm = () => {
  isScheduleFormVisible.value = false
}

const weeksInMonth = ref(6) // 기본 6주로 설정 (최대 6주)

watch(
  now,
  () => {
    columns.value = []
    groupColumns.value = []
    const startday = dayjs(now.value).startOf('month')
    const lastday = dayjs(now.value).endOf('month')
    const startdayOfWeek = startday.get('day')
    const lastdayOfWeek = lastday.get('day')

    // 주차 수 계산: 시작일과 끝일의 요일에 따라 달의 주차를 계산
    const totalDays = lastday.diff(startday, 'day') + 1
    const daysFromLastMonth = startdayOfWeek
    const daysFromNextMonth = 6 - lastdayOfWeek
    const totalCells = totalDays + daysFromLastMonth + daysFromNextMonth
    weeksInMonth.value = Math.ceil(totalCells / 7) // 몇 주인지 계산

    // 이전 달의 날짜 추가
    for (let i = 1; i <= startdayOfWeek; i++) {
      columns.value.unshift(dayjs(startday).subtract(i, 'day'))
    }

    // 해당 월의 날짜 추가
    for (let i = 0; i < lastday.get('date'); i++) {
      columns.value.push(dayjs(startday).add(i, 'day'))
    }

    // 다음 달의 날짜 추가
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
  <div
    class="calendar-wrapper"
    :style="{
      height:
        weeksInMonth === 5 ? '780px' : Math.max(weeksInMonth * 150, 600) + 'px',
    }"
  >
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

      <!-- 뒤집힌 화면에서 일정 및 다이어리 버튼, 폼 렌더링 -->
      <div class="flipped-content">
        <div class="button-group">
          <button class="schedule-btn" @click="showScheduleForm">
            Schedule
          </button>
          <button class="flip-back-btn" @click="flipBack">&orarr;</button>
          <!-- ㄴ 달력 다시 뒤집기 버튼 -->
          <button class="diary-btn" @click="showDiaryForm">Diary</button>
        </div>

        <!-- ScheduleForm 컴포넌트 렌더링 -->
        <div v-if="isScheduleFormVisible" class="form-container">
          <ScheduleForm
            :selectedDate="selectDate"
            @closeForm="closeScheduleForm"
          />
        </div>

        <!-- DiaryForm 컴포넌트 렌더링 -->
        <div v-if="isDiaryFormVisible" class="form-container">
          <DiaryForm :selectedDate="selectDate" />
        </div>

        <div>
          <ScheduleDayForm :selectedDate="selectDate" />
        </div>
      </div>
    </div>
  </div>
</template>

<style scoped>
/* 달력의 전체적인 구조 */
.calendar-wrapper {
  background-color: white;
  border-radius: 10px;
  perspective: 1000px;
  display: flex;
  align-items: flex-start;
  padding-bottom: 20px;
  padding-left: 50px;
  padding-right: 50px;
  min-height: 500px;
  width: 65%;
  padding-top: 30px;
  margin-left: 50px;
  margin-right: 50px;
  overflow: hidden;
  box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.1); /* 그림자 추가 */
}

/* 달력 제목과 관련된 스타일들  */

.Calender-title {
  display: flex;
  justify-content: center; /* 가운데 정렬 */
  align-items: center;
  gap: 5rem; /* 버튼과 연도/월 사이 간격 */
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
.YMYM {
  width: 120px; /* 고정 너비를 설정하여 월 이름에 상관없이 동일한 너비 유지 */
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
  white-space: nowrap; /* 텍스트가 줄바꿈되지 않도록 설정 */
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

/* 플립 애니메이션 */
.calendar-container {
  width: 95%;
  transition: transform 0.8s;
  transform-style: preserve-3d;
  margin: 0 auto;
  height: 100%;
  min-height: 400px;
}

.flipped {
  transform: rotateY(180deg);
}

/* 달력 앞면과 뒷면 */
.vv {
  width: 100%;
  height: 100%;
  position: absolute;
  top: 0;
  left: 0;
  backface-visibility: hidden;
  min-height: 750px;
}
.flipped-content {
  width: 100%;
  height: 100%;
  position: absolute;
  top: 0;
  left: -20px;
  backface-visibility: hidden;
  min-height: 750px;
}

/* 달력 앞면 */
.vv {
  display: block;
  backface-visibility: hidden;
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
  aspect-ratio: 1 / 1; /* 정사각형 유지 */
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

/* flipped-content 스타일 */
.flipped-content {
  transform: rotateY(180deg);
  display: flex;
  flex-direction: column;
  justify-content: flex-start;
  align-items: center;
  padding: 20px;
  height: 100%;
  position: relative;
  max-height: 100%; /* 부모 요소 높이에 맞추어 최대 높이 설정 */
  overflow-y: auto;
}

/* 버튼 그룹 스타일 */
.button-group {
  display: flex;
  justify-content: center; /* 중앙 정렬 */
  align-items: center;
  gap: 20px;
  margin-top: 0;
  position: absolute;
  top: 20px; /* 상단에 위치 */
}

/* 버튼 스타일 수정 */
.schedule-btn,
.diary-btn {
  background-color: #333;
  color: white;
  padding: 0; /* 패딩을 제거해 크기에 영향 미치지 않도록 설정 */
  display: flex; /* 버튼 내부의 텍스트를 중앙에 정렬하기 위한 flexbox */
  justify-content: center; /* 수평 중앙 정렬 */
  align-items: center; /* 수직 중앙 정렬 */
  border-radius: 10px;
  cursor: pointer;
  border: none;
  font-size: 1.2rem;
  transition: background-color 0.3s;
  height: 60px;
  width: 120px;
}

.flip-back-btn {
  background-color: white;
  box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
  color: black;
  padding: 0; /* 패딩을 제거해 크기에 영향 미치지 않도록 설정 */
  display: flex; /* 버튼 내부의 텍스트를 중앙에 정렬하기 위한 flexbox */
  justify-content: center; /* 수평 중앙 정렬 */
  align-items: center; /* 수직 중앙 정렬 */
  border-radius: 50%;
  cursor: pointer;
  border: none;
  font-size: 1.2rem;
  transition: background-color 0.3s;
  height: 60px;
  width: 60px;
}

.flip-back-btn:hover {
  background-color: #b4b4b4;
}

.schedule-btn:hover,
.diary-btn:hover {
  background-color: #555;
}

/* 폼을 담는 컨테이너 스타일 */
.form-container {
  /* background-color: white;/// */
  padding: 20px;
  border-radius: 8px;
  /* box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1); */
  width: 80%;
  max-width: 600px;
}
</style>
