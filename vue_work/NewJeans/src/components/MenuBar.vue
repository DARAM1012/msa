<template>
  <header>
    <div class="wrapper">
      <Profile
        :isLoggedIn="isLoggedIn"
        :userName="userName"
        :profileImage="profileImage"
      />
      <nav class="menu-grid">
        <RouterLink to="/" class="menu-item" active-class="active">
          <FontAwesomeIcon class="fa-icon" :icon="faCalendarAlt" />
          Calendar
        </RouterLink>
        <RouterLink to="/diary" class="menu-item" active-class="active">
          <FontAwesomeIcon class="fa-icon" :icon="faBook" />
          Diary
        </RouterLink>
        <RouterLink to="/teams" class="menu-item" active-class="active">
          <FontAwesomeIcon class="fa-icon" :icon="faUsers" />
          Teams
        </RouterLink>
        <RouterLink to="/setting" class="menu-item" active-class="active">
          <FontAwesomeIcon class="fa-icon" :icon="faCog" />
          Setting
        </RouterLink>
        <button class="menu-item sign-in" @click="showModal = true">
          <FontAwesomeIcon class="fa-icon" :icon="faSignInAlt" />
          Sign In
        </button>
      </nav>

      <!-- Modal 컴포넌트 -->
      <Modal :show="showModal" @close="showModal = false" />
    </div>
  </header>
</template>

<script setup>
// ref를 import합니다.
import { ref } from 'vue';
import Profile from './ProfileSide.vue';
import Modal from './Modal.vue'; // Modal 컴포넌트 import
// Font Awesome 아이콘 관련 import
import { FontAwesomeIcon } from '@fortawesome/vue-fontawesome';
import {
  faCalendarAlt,
  faBook,
  faUsers,
  faCog,
  faSignInAlt,
} from '@fortawesome/free-solid-svg-icons';

// 반응형 데이터 정의
const isLoggedIn = ref(false); // 로그인 상태 관리 (초기값 false)
const userName = ref('John Doe'); // 사용자 이름
const profileImage = ref('john-doe-profile.png'); // 프로필 이미지

// 모달 표시 상태 관리
const showModal = ref(false);
</script>

<style scoped>
.wrapper {
  display: flex;
  flex-direction: column; /* 세로 방향으로 정렬 */
  align-items: flex-start; /* 왼쪽 정렬 */
  padding: 50px 0 0 150px; /* 여백 추가 */
}

.menu-grid {
  display: grid;
  grid-template-columns: repeat(2, 1fr); /* 2개의 열 */
  grid-template-rows: repeat(3, 75px); /* 3개의 행 */
  gap: 0; /* 상자 사이의 간격을 없앰 */
  width: 13%; /* 가로 너비 설정 */
  margin-top: 20px; /* 프로필과 메뉴 간의 간격 */
}

/* 각 메뉴 항목의 스타일 */
.menu-item {
  padding: 20px 15px 10px; /* 버튼 패딩 */
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
  transition: all 0.3s ease; /* 애니메이션 효과 추가 */
  border-radius: 0; /* 기본적으로 모든 모서리를 직선으로 설정 */
}

/* 아이콘과 텍스트 간격 */
.menu-item .fa-icon {
  margin-bottom: 8px; /* 아이콘과 텍스트 사이 간격 */
}

/* 활성화된 메뉴 (클릭 후 유지되는 상태) */
.active {
  background-color: white; /* 배경을 흰색으로 변경 */
  color: black; /* 글씨와 아이콘 색을 검정색으로 변경 */
  transform: scale(1.1); /* 버튼을 살짝 키워서 다른 버튼들과 겹침 */
  z-index: 1; /* 다른 버튼들 위로 올라옴 */
  border-color: transparent; /* 테두리 색을 투명하게 만들어 테두리 제거 */
  border-radius: 10px !important; /* 클릭 후 모든 모서리를 둥글게 */
}

/* Calendar 메뉴 */
.menu-item:nth-child(1) {
  border-top-left-radius: 10px; /* 좌측 상단 모서리만 둥글게 */
  border-top-right-radius: 0;
  border-bottom-left-radius: 0;
  border-bottom-right-radius: 0;
  border-bottom-width: 0;
  border-right-width: 0;
}

/* Diary 메뉴 */
.menu-item:nth-child(2) {
  border-top-left-radius: 0;
  border-top-right-radius: 10px; /* 우측 상단 모서리만 둥글게 */
  border-bottom-left-radius: 0;
  border-bottom-right-radius: 0;
  border-bottom-width: 0;
}

/* Teams 메뉴 */
.menu-item:nth-child(3) {
  border-radius: 0; /* 활성화 전에는 둥근 모서리 없음 */
  border-bottom-width: 0;
  border-right-width: 0;
}

/* Setting 메뉴 */
.menu-item:nth-child(4) {
  border-radius: 0; /* 활성화 전에는 둥근 모서리 없음 */
  border-bottom-width: 0;
}

/* Sign In 버튼 */
.sign-in {
  grid-column: span 2; /* 마지막 줄에서 두 칸 병합 */
  border-bottom-right-radius: 10px; /* 오른쪽 하단 모서리 둥글게 */
  border-bottom-left-radius: 10px; /* 왼쪽 하단 모서리 둥글게 */
  border-top-left-radius: 0px; /* 왼쪽 상단 모서리 둥글게 */
  border-top-right-radius: 0px; /* 오른쪽 상단 모서리 둥글게 */
}
</style>
