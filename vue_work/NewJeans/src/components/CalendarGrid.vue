<script setup>
import { ref, watch } from 'vue'
import dayjs from 'dayjs'

const now = ref(dayjs())
const columns = ref([])
const groupColumns = ref([])

// selectDate 가 값이 null일때는 false 값이 date 로 바뀌면 true;
const selectDate = ref(null)
const title = ref('')
const content = ref('')

const subMonth = () => {
  now.value = dayjs(now.value).subtract(1, 'month')
}
const addMonth = () => {
  now.value = dayjs(now.value).add(1, 'month')
}
const selectDateFn = date => {
  console.log('dateClick', dayjs(date).format('YYYY-MM-DD'))
  selectDate.value = dayjs(date).format('YYYY-MM-DD')
}
const goToday = () => {
  now.value = dayjs() // 오늘 날짜로 돌아가기
}

watch(
  now,
  (newValue, _) => {
    columns.value = [] // 원래 있던 값 제거
    groupColumns.value = [] // 원래 있던 값 제거
    // 제일 처음 로딩 할때는 now는 현재 달력...
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

    // groupColumns.value.push(columns.value.slice(0, 7))
    // groupColumns.value.push(columns.value.slice(7, 14))
    // groupColumns.value.push(columns.value.slice(14, 21))
    // groupColumns.value.push(columns.value.slice(21, 28))
    // groupColumns.value.push(columns.value.slice(28, 35))
  },
  {
    immediate: true, // 현재페이지 처음 로딩 될때 도 실행
    deep: true, // 안에 값이 객체이면 객체 안에 변수도 변경 될때 watch안에 있는 함수 실행
  },
)
</script>

<template>
  <div>
    <div class="aa">
      <div class="vv">
        <h1 class="Calender-title">
          <button @click="goToday" class="Today-button">Today</button>
          <button @click="subMonth()" class="B-Month-button">
            <i><</i>
          </button>
          <!-- {{ now.format('YYYY MMMM') }} -->
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
              'sundays': index % 7 == 0,
              'saturdays': index % 7 == 6,
              'notthisMdays': !column.isSame(now, 'month'),
            }"
          >
            <span class="date-number">{{ column.get('date') }}</span>
            <!-- <span class="딴거"> 딴거 넣을예정 </span> -->
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<style lang="scss" scoped>
.aa {
  //전체 껍데기
  display:block;
  justify-content: center;
  position: absolute;
  padding: 5px;
  // background-color: deeppink;
  z-index: 1000;
  top:13%;
  left: 25%;
  width: 65%;
}

.vv {
  // 달력 껍데기
  width: 95%;
  background-color: white;
  padding: 1.5rem;
  // text-align: center;
  border-radius: 15px;
}

// <<<<< 달력 제목과 그 친구들 >>>>>

.Calender-title {
  font-size: 2rem;
  font-weight:500;
  margin-bottom: 1rem;
  
  display: flex;
  justify-content: center; /* 가운데 정렬 */
  align-items: center; /* 세로 가운데 정렬 */
  gap: 1rem; /* 버튼과 YMYM 사이의 간격 조정 */

  .B-Month-button,
  .A-Month-button {
    background-color: white;
    border: none;
    width: 2rem;
    height: 2rem;
    // display: inline-flex;
    justify-content: center;
    align-items: center;
    cursor: pointer;
    font-size: 1.25rem;
    margin: 0;
  }

  .YMYM {
    display: flex;
    flex-direction: column;
    align-items: center;
    width: 150px;
  }

  .year, .month {
    display: block;
    text-align: center;
    white-space: nowrap; /* 텍스트가 줄바꿈되지 않도록 설정 */
  }

  .year {
    font-size: 1.5rem;
  }

  .month {
    font-size: 1.2rem;
  }

  .Today-button {
    position: absolute; /* 절대 위치 설정 */
    left: 80px; /* 왼쪽으로 고정 */
  }
  
}

.Today-button {
  background-color: #333;
  color: white;
  border: none;
  padding: 0.5rem 1rem;
  border-radius: 20px;
  font-size: 0.9rem;
  cursor: pointer;
}


// .B-Month-button{
//     margin-left: 0.5rem;
// }
// .A-Month-button{
//     margin-right: 0.5rem;
// }


// <<<<< 요일 그리드>>>>>> 

.DOWgrid {
  display: grid;
  grid-template-columns: repeat(7, 1fr);
  gap: 0.5rem;
  text-align: center;
  margin-bottom: 1rem;
}

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

// <<<<<< 여기부터 달력부분 >>>>>>>
.CALgrid {
  display: grid;
  grid-template-columns: repeat(7, 1fr);
  gap: 15px;
  margin-bottom: 1rem;
}

.Datecell {
  position: relative;
  background-color: #f7f7f7;
  border-radius: 3px;
  font-size: 1rem;
  cursor: pointer;
  // border: 1px solid black;
  transition: background-color 0.2s, border 0.2s;

  aspect-ratio: 1 / 1;
  
  display: flex;
  align-items: center;
  justify-content: center;
}

.date-number{
  position: absolute;
  top: 10px;
  right: 10px;
  font-size: 1rem;
}

.Datecell:hover {
  background-color: #e1e1e1;
}

.sundays {
  color: #dc2626;
}

.saturdays {
  color: #2563eb;
}

.notthisMdays {
  opacity: 0.35;
}

</style>
