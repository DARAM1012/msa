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
      <img src="@/assets/logo.png" alt="Logo" />
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
  padding: 20px;
  position: relative; /* 로고 위치를 설정하기 위해 relative로 변경 */
}

.logo {
  position: absolute;
  right: 210px; /* 로고를 오른쪽 끝에 배치 */
}

.logo img {
  height: 40px; /* 로고 크기 설정 */
}

.search-container {
  display: flex;
  justify-content: center;
  align-items: center;
  width: 100%;
  max-width: 450px;
  position: relative;
  left: 135px;
}

.search-input {
  width: 50%;
  padding: 10px;
  border: 1px solid #ccc;
  border-radius: 20px;
  font-size: 16px;
}

.search-btn {
  background: none;
  border: none;
  margin-left: -35px;
  cursor: pointer;
  font-size: 16px;
}

.search-btn i {
  font-size: 20px; /* 아이콘 크기 */
  color: #555; /* 아이콘 색상 */
}
</style>
