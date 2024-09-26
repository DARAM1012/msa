<template>
  <div class="header">
    <ul>
      <li><RouterLink to="/">홈</RouterLink></li>
      <li><RouterLink to="/board">게시판</RouterLink></li>
      <li><RouterLink to="/login">로그인</RouterLink></li>
    </ul>
  </div>
  <div class="image-container">
    <img src="D:/work/w9w9/w9w9/src/assets/header2.jpg" alt="Header Image" />
  </div>
</template>

<script setup></script>

<style scoped>
.header {
  display: flex;
  justify-content: flex-end; /* 오른쪽 정렬 */
  background-color: rgba(0, 0, 0, 0.2); /* 검정색 배경에 투명도 70% */
  padding: 15px; /* 패딩 추가 */
  position: absolute; /* 절대 위치 설정 */
  top: 0; /* 상단에 배치 */
  left: 0; /* 왼쪽 끝에 붙이기 */
  right: 0; /* 오른쪽 끝에 붙이기 */
  box-sizing: border-box; /* padding을 포함한 총 폭 계산 */
}

ul {
  list-style-type: none; /* 불릿 제거 */
  padding: 0; /* 패딩 제거 */
  margin: 10px 50px 10px 0; /* 마진 제거 */
  display: flex; /* 수평 정렬을 위해 flex 사용 */
}

li {
  margin-left: 30px; /* 간격 추가 */
  text-shadow: 1px 2px 3px rgba(0, 0, 0, 0.7); /* 그림자 추가 */
}
.image-container img {
  width: 1902px; /* 원하는 넓이로 조정*/
}
</style>
