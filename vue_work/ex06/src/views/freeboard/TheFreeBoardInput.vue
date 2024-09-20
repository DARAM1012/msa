<template>
  <div>
    <h1 class="aaa">Freeboard</h1>
    <div class="p-5">
      <input
        v-model="title"
        type="text"
        placeholder="Enter your title here"
        class="m-4 w-full p-3 border border-gray-300 rounded-lg shadow-sm focus:outline-none focus:ring-2 focus:ring-blue-500 focus:border-transparent text-gray-700 placeholder-gray-400 bg-white"
      />
      <textarea
        v-model="content"
        class="m-4 w-full h-40 p-4 border border-gray-300 rounded-lg shadow-sm focus:outline-none focus:ring-2 focus:ring-blue-400 focus:border-transparent resize-none text-gray-700 placeholder-gray-400 bg-white"
        placeholder="Enter content here"
      ></textarea>
    </div>
    <button
      class="px-4 py-2 bg-blue-500 text-white font-semibold rounded-lg shadow-md hover:bg-blue-600 focus:outline-none focus:ring-2 focus:ring-blue-300"
      @click="save"
    >
      저장
    </button>
  </div> 
</template>

<script setup>
import axios from 'axios'
import { ref } from 'vue'
import { useRoute, useRouter } from 'vue-router';

const title = ref('')
const content = ref('')
// const regDate = ref('')
// const creAuthor = ref('')
// const idx = ref(0);

const router = useRouter();
// const route = useRoute();

// const getFreeBoard = () => {
//   axios.get(`http://localhost:8080/freeboard/view/${route.params.idx}`)
//     .then(res => {
//         title.value = res.data.title;
//         content.value = res.data.content;
//         regDate.value = res.data.regDate;
//         creAuthor.value = res.data.creAuthor;
//         idx.value = res.data.idx;
//     })
//     .catch((e) => {
//       console.log(e)
//       alert(e.response.data.message)
//       router.push({name:'freeboardlist'})
//     })
// }

const save = () => {
  const data = {
    title: title.value,
    content: content.value
  }
  // console.log(data);
  axios
    .post('http://localhost:8080/freeboard', data)
    .then(res => {
      console.log(res);
      alert('저장하였습니다.');
      router.push({name:"freeboardlist", params:{aa:10,bb:"안녕하세요"}
    })
    })
    .catch((e) => {
      console.log(e);
     alert('에러'+e.response.data.message);
    })
}
</script>

<style scoped>
.aa {
  margin: 1rem;
}
</style>
