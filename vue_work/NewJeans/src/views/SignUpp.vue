<template>
  <div class="signup-container">
    <div class="logo">
      <img src="@/assets/logo.png" alt="Logo" @click="goToMainPage" />
    </div>
    <form @submit.prevent="handleSignUp">
      <div class="form-group">
        <input
          type="email"
          placeholder="이메일 (아이디)"
          v-model="email"
          required
        />
      </div>
      <div class="form-group">
        <input
          type="password"
          placeholder="비밀번호"
          v-model="password"
          required
        />
      </div>
      <div class="form-group">
        <input
          type="password"
          placeholder="비밀번호 확인"
          v-model="confirmPassword"
          required
        />
        <p class="password-rule">
          영문/숫자/특수문자 중 2가지 이상 포함,<br />
          8자 이상 20자 이하 입력 (공백 제외)
        </p>
      </div>
      <div class="form-group">
        <input
          type="text"
          placeholder="별명 (Username)"
          v-model="nickname"
          required
        />
      </div>
      <button type="submit" class="signup-button">회원가입</button>
    </form>
  </div>
</template>

<script setup>
import { ref } from 'vue'
import { useRouter } from 'vue-router' // 라우터 사용을 위해 import
import axios from 'axios'

const email = ref('')
const password = ref('')
const confirmPassword = ref('') // 비밀번호 확인 필드
const nickname = ref('') // 별명 필드
const router = useRouter() // 라우터 객체 초기화

const handleSignUp = async () => {
  // 비밀번호 확인 (예: 비밀번호와 비밀번호 확인이 일치하는지 검사)
  if (password.value !== confirmPassword.value) {
    alert('비밀번호가 일치하지 않습니다.')
    return
  }

  try {
    //회원가입 데이터 객체
    const signUpDate = {
      email: email.value,
      password: password.value,
      nickname: nickname.value,
    }

    //백엔드로 회원가입 요청 보내기(백엔드에서 url 받아서 집어넣으면 됨)
    const response = await axios.post(
      'https://your-backend-url.com/api/signup',
      signUpDate,
    )

    // 성공적으로 회원가입이 완료된 경우
    if (response.status === 200) {
      alert('회원가입이 완료되었습니다!')
      router.push('/login') // 회원가입 후 로그인 페이지로 이동
    }
  } catch (error) {
    // 오류가 발생한 경우
    console.error('회원가입 오류:', error)
    if (error.response && error.response.data && error.response.data.message) {
      alert(`회원가입 실패: ${error.response.data.message}`)
    } else {
      alert('회원가입 중 오류가 발생했습니다. 다시 시도해 주세요.')
    }
  }
}

// 로고 클릭 시 메인 페이지로 이동
const goToMainPage = () => {
  router.push('/') // 메인 페이지 경로로 이동
}
</script>

<style scoped>
.signup-container {
  width: 400px; /* 원하는 너비 설정 */
  height: 400px; /* 높이는 내용에 따라 자동 조정 */
  margin: 0 auto;
  padding: 30px;
  background: #fff;
  border-radius: 8px;
  box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
  position: fixed; /* 화면에 고정 */
  top: 50%; /* 화면의 세로 중앙 */
  left: 50%; /* 화면의 가로 중앙 */
  transform: translate(
    -50%,
    -50%
  ); /* 정확한 중앙 정렬을 위해 수평, 수직으로 이동 */
  z-index: 1000; /* 필요 시 다른 요소 위에 오게 설정 */
}

.logo {
  padding-bottom: 10%;
  padding-left: 33%;
  cursor: pointer;
}

.logo img {
  height: 40px; /* 로고 크기 설정 */
}

.form-group {
  margin-bottom: 15px;
  text-align: center; /* 입력 필드와 버튼을 가운데 정렬 */
}

input {
  width: 70%;
  padding: 10px;
  border: 1px solid #ccc;
  border-radius: 4px;
  margin-bottom: 10px;
  display: block; /* 블록 요소로 설정 */
  margin: 0 auto; /* 중앙 정렬 */
}

.signup-button {
  width: 70%; /* 버튼도 가운데 정렬 */
  padding: 10px;
  background-color: #ffffff;
  color: rgb(0, 0, 0);
  border: 1px solid #6e6e6e;
  border-radius: 10px;
  cursor: pointer;
  font-size: 16px;
  display: block; /* 블록 요소로 설정 */
  margin: 20px auto 0; /* 중앙 정렬 및 위쪽 여백 추가 */
}

.password-rule {
  font-size: 12px;
  color: #888; /* 비밀번호 규칙 설명에 연한 색 적용 */
  margin-top: 10px; /* 비밀번호 입력 필드와의 간격 */
  margin-bottom: 10px; /* 다른 입력 필드와의 간격 */
  text-align: center; /* 규칙 설명도 가운데 정렬 */
}
</style>
