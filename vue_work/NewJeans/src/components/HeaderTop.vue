<template>
  <header class="header">
    <div class="search-container">
      <input type="text" placeholder="Search" class="search-input" />
      <button class="search-btn">
        <!-- Font Awesome의 돋보기 아이콘을 사용 -->
        <font-awesome-icon :icon="['fas', 'search']" />
      </button>
    </div>
    <div class="logo">
      <!-- RouterLink를 사용하여 홈 경로로 이동 -->
      <RouterLink to="/">
        <img src="@/assets/logo.png" alt="Logo" />
      </RouterLink>
    </div>
  </header>
</template>

<script setup>
// Font Awesome Vue 아이콘 컴포넌트는 이미 main.js에 설정되어 있으므로 추가적으로 가져올 필요는 없습니다.
</script>

<style scoped>
.header {
  display: flex;
  justify-content: center; /* 요소를 수평 중앙에 배치 */
  align-items: center;
  padding: 2rem; /* rem 단위로 패딩 설정 */
  position: relative;
}

.logo {
  position: absolute;
  right: 17vw; /* 화면 너비의 10% 오른쪽에 배치 */
}

.logo img {
  height: 5vh; /* 로고 크기를 vh 단위로 설정하여 화면 크기에 맞춤 */
}

.search-container {
  display: flex;
  justify-content: center;
  align-items: center;
  width: 100%;
  max-width: 30vw; /* 화면 너비의 40%로 설정 */
  position: relative;
  left: 7vw; /* 화면 왼쪽으로 5vw 만큼 이동 */
}

.search-input {
  width: 40%; /* 검색창의 너비를 60%로 설정 */
  border: 1px solid #ccc;
  border-radius: 1.5rem; /* 둥근 모서리 크기를 rem 단위로 설정 */
  font-size: 1rem; /* 폰트 크기 설정 */
  padding: 0.5rem 1rem; /* 패딩을 줄여 검색창 높이를 줄임 */
  height: 1.5rem; /* 검색창의 높이를 줄임 */
}

.search-btn {
  background: none;
  border: none;
  margin-left: -3rem; /* 버튼이 입력창 내부로 겹치도록 마진을 음수로 설정 */
  cursor: pointer;
  font-size: 1rem;
}

.search-btn i {
  font-size: 1.2rem; /* 아이콘 크기 */
  color: #555;
}

/* 반응형 디자인을 위한 미디어 쿼리 */
@media (max-width: 768px) {
  .header {
    flex-direction: column; /* 작은 화면에서는 세로로 정렬 */
    padding: 1.5rem;
  }

  .logo {
    position: static; /* 작은 화면에서는 절대 위치를 제거하고 일반 정렬로 변경 */
    margin-bottom: 1rem;
  }

  .logo img {
    height: 4vh; /* 작은 화면에서 로고 크기를 줄임 */
  }

  .search-container {
    left: 0;
    max-width: 90vw; /* 검색창의 너비를 화면의 90%로 설정 */
  }

  .search-input {
    width: 80%; /* 검색창 너비를 조금 더 크게 설정 */
    font-size: 0.9rem; /* 작은 화면에서는 폰트 크기를 줄임 */
  }

  .search-btn {
    font-size: 1rem; /* 버튼 크기를 조금 줄임 */
    margin-left: -2rem;
  }
}
</style>
