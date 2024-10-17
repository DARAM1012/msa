<template>
  <div class="profile">
    <div class="profile-container" v-if="isLoggedIn">
      <img 
        :src="profileImage" 
        alt="Profile Picture" 
        class="profile-image" 
      />
      <p>Welcome, {{ userName }}!</p>
    </div>
    <div class="profile-container" v-else>
      <img 
        src="@/assets/profile.png" 
        alt="Default Profile Picture" 
        class="profile-image" 
      />
      <div class="welcome-text">
        <p class="f1">Welcome!</p>
        <p class="f2">로그인 후 이용해주세요</p>
      </div>
    </div>
  </div>
</template>

<script setup>
// props를 정의하고 템플릿에서 직접 사용할 수 있도록 설정
const { isLoggedIn, userName, profileImage } = defineProps({
  isLoggedIn: {
    type: Boolean,
    default: false
  },
  userName: {
    type: String,
    default: '사용자명'
  },
  profileImage: {
    type: String,
    default: 'default-profile.png'
  }
});
</script>

<style scoped>
.profile {
  display: flex;
  flex-direction: column; /* 세로 방향으로 정렬 */
  align-items: flex-start; /* 왼쪽 정렬 */
}

.profile-container {
  display: flex;
  flex-direction: column; /* 세로 방향으로 정렬 */
  align-items: center; /* 수평 정렬 */
  margin-bottom: 10px; /* 각 프로필 블록 간의 간격 */
}

.profile-image {
  border-radius: 50%; /* 프로필 이미지를 둥글게 */
  width: 100px; /* 이미지 너비 */
  height: 100px; /* 이미지 높이 */
  border: 1px solid #ccc; /* 선으로 된 원의 색상 및 두께 */
  padding: 5px; /* 이미지와 테두리 간의 간격 */
  box-sizing: border-box; /* padding을 포함하여 크기를 계산 */
}

.welcome-text {
  text-align: center; /* 텍스트 중앙 정렬 */
}
.f1{font-weight: 600;}
.f2{  color: #ccc;}
</style>
