<template>
  <div>
    <h1 class="text-5xl">HOME</h1>
    <div class="p-5">
      <table class="border border-gray-500 w-full">
        <tr>
          <th>idx</th>
          <th>name</th>
          <th>age</th>
          <th>password</th>
          <th>email</th>
        </tr>
        <tr v-for="user in list" v-bind:key="user.idx">
          <td class="border border-gray-500">idx = {{ user.idx }}</td>
          <td class="border border-gray-500">name = {{ user.name }}</td>
          <td class="border border-gray-500">age = {{ user.age }}</td>
          <td class="border border-gray-500">passward = {{ user.passward }}</td>
          <td class="border border-gray-500">email = {{ user.email }}</td>
        </tr>
      </table>
      <button @click="select" class="bg-yellow-200 p-3 hover:border-yellow-100 border-gray-300">
        불러오기
      </button>
    </div>
    <div v-for="num in mylist" v-bind:key="num">num = {{ num }}</div>
    <div>
      name =
      <input
        class="border border-yellow-400 focus:ring-2 focus:ring-yellow-500 focus:outline-none rounded-lg p-3 w-64 text-yellow-900 placeholder-yellow-500 bg-yellow-100 transition-all duration-300 shadow-md hover:bg-yellow-200 hover:shadow-lg"
        type="text"
        name="name"
        id=""
        v-model="name"
      /><br />
      age =
      <input
        class="border border-yellow-400 focus:ring-2 focus:ring-yellow-500 focus:outline-none rounded-lg p-3 w-64 text-yellow-900 placeholder-yellow-500 bg-yellow-100 transition-all duration-300 shadow-md hover:bg-yellow-200 hover:shadow-lg"
        type="number"
        name="age"
        id=""
        v-model="age"
      /><br />
      password =
      <input
        class="border border-yellow-400 focus:ring-2 focus:ring-yellow-500 focus:outline-none rounded-lg p-3 w-64 text-yellow-900 placeholder-yellow-500 bg-yellow-100 transition-all duration-300 shadow-md hover:bg-yellow-200 hover:shadow-lg"
        type="text"
        name="password"
        id=""
        v-model="password"
      /><br />
      email =
      <input
        class="border border-yellow-400 focus:ring-2 focus:ring-yellow-500 focus:outline-none rounded-lg p-3 w-64 text-yellow-900 placeholder-yellow-500 bg-yellow-100 transition-all duration-300 shadow-md hover:bg-yellow-200 hover:shadow-lg"
        type="text"
        name="email"
        id=""
        v-model="email"
      /><br />
    </div>
    <br />
    <button @click="insert" class="p-5 border border-yellow-400 bg-yellow-200">입력</button>
  </div>
</template>

<script>
import { ref } from 'vue'

export default {
  setup() {
    const mylist = [10, 20, 30]
    const list = ref([
      {
        idx: 1,
        name: '바꾸세요',
        age: 100,
        password: '1234',
        email: 'xx0215223@naver.com'
      }
    ])

    const name = ref('')
    const age = ref('')
    const password = ref('')
    const email = ref('')

    const select = () => {
      fetch(`http://localhost:8080/user/select`)
        .then((res) => {
          return res.json()
        })
        .then((result) => {
          list.value = result
          // console.log(result;)
        })
        .catch((e) => {
          console.log('예외가 발생하였습니다.')
          console.log(e)
        })
      // list.value = [{ idx: 1, name: '강제로 바꿈' }]
    }
    const insert = () => {
      const data = {
        name: name.value,
        age: age.value,
        password: password.value,
        email: email.value
      }
      try {
        fetch('http://localhost:8080/user/insert', {
          method: 'POST',
          headers: {
            'Content-Type': 'application/json' // JSON 형식으로 보낼 때의 헤더 설정
          },
          body: JSON.stringify(data)
        }).then((res) => {
          if (!res.status.toString().startsWith('2')) alert('입력이 실패했습니다')
          else {
            alert('입력하였습니다.')
          }
        })
      } catch (e) {
        console.log(e)
      }
    }
    return { list, mylist, select, insert, name, password, age, email }
  }
}
</script>

<style lang="scss" scoped></style>
