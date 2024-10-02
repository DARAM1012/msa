<template>
  <div>
    <h1 class="aaa">TheFileUpload</h1>
    <div class="p-5">
      <input type="file" name="" id="" @change="onFileChange" />
    </div>
    <div class="p-5">
      <button
        class="px-4 py-2 bg-blue-500 text-white font-semibold rounded-lg shadow-md hover:bg-blue-600 focus:outline-none focus:ring-2 focus:ring-blue-300"
        @click="save"
        type="button"
      >
        전송
      </button>
    </div>
    myfile = {{ myfile }}
  </div>
</template>

<script setup>
import axios from 'axios'
import { ref } from 'vue'

const myfile = ref(null)

const save = () => {
if(!myfile.value){
    alert('파일을 선택하세요');
    return;
}

const formData = new FormData();
formData.append("file",myfile.value); // 'file'이 key여야함
formData.append("fileDto",
new Blob({"name":"filename"},{type:"application/json"}));

  axios.post('http://localhost:10000/file/upload', formData, {
        headers: {
            'content-Type':'multipart/form-data'
        }
  })
  .then((res) =>{
    console.log(res);
  })
  .catch((e)=>{
    console.log(e);
  })

};

const onFileChange = (e) => {
    myfile.value = e.target.files[0];
};
</script>

<style lang="scss" scoped></style>
