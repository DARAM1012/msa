<template>
  <div>
    <h1>TheInsert</h1>
    <button @click="userSend">전송</button>
  </div>
</template>

<script>
export default {
  setup() {
    const mydata = {
      name: '다람이',
      age: 20,
      email: 'xx0215@naver.com',
      password: 'password',
      wdate: '2024-09-06T11:18:45.773728'
    }
    const userSend = () => {
      fetch('http://localhost:8080/user/insert', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(mydata)
      }).then((res) => {
        console.log(res)
      })
    }
    return { userSend }
  }
}
</script>

<style lang="scss" scoped></style>
