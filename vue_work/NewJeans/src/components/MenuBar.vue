<template>
  <header>
    <div class="nav_wrapper">
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
        <!-- Sign In 버튼 클릭 시 모달 표시 -->
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
import { ref } from 'vue'
import Profile from './ProfileSide.vue'
import Modal from './MoDal.vue' // Modal 컴포넌트 import
import { FontAwesomeIcon } from '@fortawesome/vue-fontawesome'
import {
  faCalendarAlt,
  faBook,
  faUsers,
  faCog,
  faSignInAlt,
} from '@fortawesome/free-solid-svg-icons'

// 로그인 상태 관리
const isLoggedIn = ref(false)
const userName = ref('John Doe')
const profileImage = ref('john-doe-profile.png')

// 모달 표시 상태 관리
const showModal = ref(false) // 기본값 false로 시작
</script>

<style scoped>
.nav_wrapper {
  display: flex;
  flex-direction: column; /* 세로 방향으로 정렬 */
  align-items: flex-start; /* 왼쪽 정렬 */
  padding: 5vh 0 0 17vw; /* vh와 vw 단위로 패딩 설정 */
}

.menu-grid {
  display: grid;
  grid-template-columns: repeat(2, 1fr); /* 2개의 열 */
  grid-template-rows: repeat(3, 10vh); /* vh 단위로 행 높이 설정 */
  gap: 0;
  width: 12vw; /* 전체 너비를 vw 단위로 설정 */
  margin-top: 2vh; /* 프로필과 메뉴 간의 간격 */
}

/* 각 메뉴 항목의 스타일 */
.menu-item {
  padding: 1.5rem 1rem; /* rem 단위로 패딩 설정 */
  background-color: #f5f5f5;
  color: #5c5c5c;
  border: 1px solid #ccc;
  text-align: center;
  cursor: pointer;
  font-size: 1rem; /* rem 단위로 폰트 크기 설정 */
  text-decoration: none;
  display: flex;
  flex-direction: column;
  align-items: center;
  transition: all 0.3s ease;
  border-radius: 0;
}

/* 아이콘과 텍스트 간격 */
.menu-item .fa-icon {
  margin-bottom: 0.5rem; /* rem 단위로 간격 설정 */
}

/* 활성화된 메뉴 (클릭 후 유지되는 상태) */
.active {
  background-color: white;
  color: black;
  transform: scale(1.1); /* 버튼을 살짝 키워서 다른 버튼들과 겹침 */
  z-index: 1; /* 다른 버튼들 위로 올라옴 */
  border-color: transparent; /* 테두리 색을 투명하게 만들어 테두리 제거 */
  border-radius: 0.8rem; /* rem 단위로 둥근 모서리 설정 */
}

/* Calendar 메뉴 */
.menu-item:nth-child(1) {
  border-top-left-radius: 1rem; /* 좌측 상단 모서리 둥글게 */
}

/* Diary 메뉴 */
.menu-item:nth-child(2) {
  border-top-right-radius: 1rem; /* 우측 상단 모서리 둥글게 */
}

/* Sign In 버튼 */
.sign-in {
  grid-column: span 2; /* 마지막 줄에서 두 칸 병합 */
  border-bottom-right-radius: 1rem;
  border-bottom-left-radius: 1rem;
}

/* 반응형 디자인을 위한 미디어 쿼리 */
/*화면 너비가 768px 이하일 때,
grid-template-columns를 1열로 변경하여 작은 화면에서도 메뉴가 보기 좋게 정렬되도록 설정했습니다.*/
@media (max-width: 768px) {
  .menu-grid {
    grid-template-columns: 1fr; /* 작은 화면에서는 1열로 변경 */
    width: 80vw; /* 너비를 화면 전체에 맞추기 */
    grid-template-rows: repeat(5, 8vh); /* 높이를 5행으로 변경 */
  }

  .menu-item {
    font-size: 0.9rem; /* 작은 화면에서 폰트 크기를 줄임 */
    padding: 1rem 0.5rem; /* 패딩을 줄여서 작은 화면에서도 보기 좋게 설정 */
  }
}
</style>
