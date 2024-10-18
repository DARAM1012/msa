<script setup>
// ref를 import합니다.
import { ref } from 'vue'
import Profile from './ProfileSide.vue'
// Font Awesome 아이콘 관련 import
import { FontAwesomeIcon } from '@fortawesome/vue-fontawesome'
import {
  faCalendarAlt,
  faBook,
  faUsers,
  faCog,
  faSignInAlt,
} from '@fortawesome/free-solid-svg-icons'

// 반응형 데이터 정의
const isLoggedIn = ref(false) // 로그인 상태 관리 (초기값 false)
const userName = ref('John Doe') // 사용자 이름
const profileImage = ref('john-doe-profile.png') // 프로필 이미지

// signIn 메서드 추가 (모달 구현할 때 사용할 수 있음)
const signIn = () => {
  // 로그인 로직을 여기에 구현하세요.
}
</script>

<template>
  <header>
    <div class="wrapper">
      <Profile
        :isLoggedIn="isLoggedIn"
        :userName="userName"
        :profileImage="profileImage"
      />
      <nav class="menu-grid">
        <RouterLink to="/" class="menu-item">
          <FontAwesomeIcon :icon="faCalendarAlt" />
          <!-- Calendar 아이콘 -->
          Calendar
        </RouterLink>
        <RouterLink to="/diary" class="menu-item">
          <FontAwesomeIcon :icon="faBook" />
          <!-- Diary 아이콘 -->
          Diary
        </RouterLink>
        <RouterLink to="/teams" class="menu-item">
          <FontAwesomeIcon :icon="faUsers" />
          <!-- Teams 아이콘 -->
          Teams
        </RouterLink>
        <RouterLink to="/setting" class="menu-item">
          <FontAwesomeIcon :icon="faCog" />
          <!-- Setting 아이콘 -->
          Setting
        </RouterLink>
        <button class="menu-item sign-in" @click="signIn">
          <FontAwesomeIcon :icon="faSignInAlt" />
          <!-- Sign In 아이콘 -->
          Sign In
        </button>
      </nav>
    </div>
  </header>
</template>

<style scoped>
.wrapper {
  display: flex;
  flex-direction: column; /* 세로 방향으로 정렬 */
  align-items: flex-start; /* 왼쪽 정렬 */
  padding: 20px; /* 여백 추가 */
  background-color: #f9f9f9; /* 배경색 */
}

.menu-grid {
  display: grid;
  grid-template-columns: repeat(2, 1fr); /* 2개의 열 */
  grid-template-rows: repeat(3, 75px); /* 3개의 행 */
  gap: 0; /* 상자 사이의 간격을 없앰 */
  width: 10%; /* 가로 너비 설정 */
  margin-top: 20px; /* 프로필과 메뉴 간의 간격 */
}

/* 각 메뉴 항목의 스타일 */
.menu-item {
  padding: 15px; /* 버튼 패딩 */
  background-color: #f5f5f5; /* 버튼 배경색 */
  color: #5c5c5c; /* 텍스트 색상 */
  border: 1px solid #ccc; /* 테두리 추가 */
  text-align: center; /* 텍스트 중앙 정렬 */
  cursor: pointer; /* 커서 변경 */
  font-size: 14px; /* 폰트 크기 조정 */
  text-decoration: none; /* 링크 텍스트 밑줄 제거 */
  display: flex;
  flex-direction: column; /* 아이콘과 텍스트가 세로로 정렬되도록 설정 */
  align-items: center;
}

/* Calendar 메뉴 */
.menu-item:nth-child(1) {
  border-top-left-radius: 10px; /* 왼쪽 상단 모서리 둥글게 */
  border: 1px solid #ccc; /* 기본 테두리 */
  border-right: 1px solid #ccc; /* 오른쪽 테두리만 굵게 조절 */
  border-bottom: 0px solid #ccc;
}

/* Diary 메뉴 */
.menu-item:nth-child(2) {
  border-top-right-radius: 10px; /* 오른쪽 상단 모서리 둥글게 */
  border: 1px solid #ccc; /* 기본 테두리 */
  border-left: none; /* 왼쪽 테두리 제거 */
  border-bottom: 0px solid #ccc;
}

/* Teams 메뉴 */
.menu-item:nth-child(3) {
  border: 1px solid #ccc; /* 기본 테두리 */
  border-bottom-left-radius: 0; /* 왼쪽 하단 둥글게 하지 않음 */
  border-right: 1px solid #ccc; /* 오른쪽 테두리만 굵게 조절 */
  border-bottom: 0px solid #ccc;
}

/* Setting 메뉴 */
.menu-item:nth-child(4) {
  border: 1px solid #ccc; /* 기본 테두리 */
  border-bottom-left-radius: 0; /* 왼쪽 하단 둥글게 하지 않음 */
  border-left: none; /* 왼쪽 테두리 제거 */
  border-bottom: 0px solid #ccc;
}

/* 메뉴 항목에 hover 효과 */
.menu-item:hover {
  background-color: #0056b3; /* 호버 시 배경색 변경 */
  color: white; /* 호버 시 텍스트 색상 변경 */
}

/* 바깥쪽 모서리만 둥글게 적용 */
.menu-item:first-child {
  border-top-left-radius: 10px; /* 왼쪽 상단 둥글게 */
}

.menu-item:nth-child(2) {
  border-top-right-radius: 10px; /* 오른쪽 상단 둥글게 */
}

/* 'Sign In' 메뉴 */
.sign-in {
  grid-column: span 2; /* 마지막 줄에서 두 칸 병합 */
  border-bottom-right-radius: 10px; /* 오른쪽 하단 모서리 둥글게 */
  border-bottom-left-radius: 10px; /* 왼쪽 하단 모서리 둥글게 */
}
</style>
