<template>
  <div>
    <h1 class="text-5xl">Insert</h1>
    <label for="email">email</label>
    <input type="text" name="" id="email" v-model="email" />
    <h1 class="text=3xl">{{ email }}</h1>
    <button
      @click="doInsert"
      class="bg-green-500 hover:bg-green-700 text-white font-bold py-2 px-4 rounded"
    >
      INSERT
    </button>
  </div>
</template>

<script>
import { ref } from 'vue'

export default {
  setup() {
    const email = ref('')
    const doInsert = () => {
      console.log(email.value)
      // fetch(`http://localhost:8080/user/insert`).then()
    }
    return { doInsert }
  }
}
</script>

<style lang="scss" scoped></style>
