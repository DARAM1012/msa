<script setup>
import dayjs from 'dayjs'

// import utc from 'dayjs/plugin/utc';

const now = dayjs();

console.log(now);
console.log(now.format('YYYY년MM월DD일 HH시mm분ss초'));
console.log(now.format('YYYY-MM-DD HH:mm:ss'));
console.log(now.format('MM-DD HH:mm:ss'));
console.log(now.format('MM-DD'));
console.log(now.format('DD'));

const firstday = dayjs().startOf('month');
const lastday = dayjs().endOf('month');

console.log(dayjs().startOf('year').format('YYYY/MM/DD'));
console.log(dayjs().startOf('month').format('YYYY/MM/DD'));
console.log(dayjs().endOf('month').format('YYYY/MM/DD'));

// 0 일요일 1 월요일 2 화요일 3 수요일 4 목요일 5 금요일 6 토요일
console.log(dayjs().day());
console.log(firstday.day());
console.log(lastday.day());

// 10월 17일 -> 9월 17일
const beforeMonth = dayjs().subtract(1,'month').format('YYYY/MM/DD');

// 9월 마지막 날
const sepLastday = dayjs(beforeMonth).endOf('month');
console.log("sepLastday = "+sepLastday.format('YYYY/MM/DD'));

// 10월 17일 -> 9월 17일
const afterMonth = dayjs().subtract(1,'month').format('YYYY/MM/DD');

// 11월 마지막 날
const novLastday = dayjs(afterMonth).endOf('month');
console.log("sepLastday = "+novLastday.format('YYYY/MM/DD'));

//9월 달과 현재 달의 달을 비교
console.log("dayjs().isSame(sepLastday,'month') = "+dayjs().isSame(sepLastday,'month'));
//11월 달과 현재 달의 달을 비교
console.log("dayjs().isSame(sepLastday,'month') = "+dayjs().isSame(novLastday,'month'));
// 현재 달의 1일이 (isSame=같은것) 현재 달의 17일(오늘날짜)을 비교했을 때 같은 달에 포함되어있는 지.
// 현재 달에 두 날짜가 포함되어 있는지 비교를 통해서 확인하는 것.
console.log("dayjs().isSame(dayjs().startOf('month'),'month') = "+dayjs().isSame(dayjs().startOf('month'),'month'));
// 현재달의 31일 월 isSame 현재달의 17일 월을 비교
console.log("dayjs().isSame(dayjs().endOf('month'),'month') = "+dayjs().isSame(dayjs().endOf('month'),'month'));

</script>

<template>
  <main>
    <h1>HOME 달력 연습</h1>

    <h1 class="text-5xl">{{ now.format('YYYY/MM/DD') }}</h1>
    <h1 class="text-5xl">{{ now.get('month') }}월</h1>
    <h1 class="text-5xl">
      {{ now.subtract(1, 'month').format('YYYY/MM/DD') }}
    </h1>
    <h1 class="text-5xl">{{ now.subtract(1, 'day').format('YYYY/MM/DD') }}</h1>
    <h1 class="text-5xl">{{ now.subtract(1, 'year').format('YYYY/MM/DD') }}</h1>

    <h1 class="text-5xl">{{ now.add(1, 'month').format('YYYY/MM/DD') }}</h1>
    <h1 class="text-5xl">{{ now.add(1, 'day').format('YYYY/MM/DD') }}</h1>
    <h1 class="text-5xl">{{ now.add(1, 'year').format('YYYY/MM/DD') }}</h1>

    <hr />
    <h1 class="text-5xl">
      첫날 {{ now.startOf('month').format('YYYY/MM/DD') }}
    </h1>
    <h1 class="text-5xl">
      마지막날 {{ now.endOf('month').format('YYYY/MM/DD') }}
    </h1>
  </main>
</template>

<style lang="scss" scoped></style>
