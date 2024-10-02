<template>
  <div class="overlay" :class="{ isModal: isModal }"></div>
  <div class="modal p-5 rounded" :class="{ isView: isModal }">
    <h1 class="text-5xl">USER 수정</h1>
    <div class="bg-pink-500 w-80 text-white cursor-pointer p-5 m-5 rounded cursor-pointer">
      <h1>idx = {{ idx }}</h1>
      <h1>name = 
        <input type="text" v-model="name"
         class="p-1 border border-gray-300 rounded-lg 
                shadow-sm 
                focus:outline-none 
                focus:ring-2
                 focus:ring-yellow-500
                 focus:border-blue-500
                 text-gray-700"></h1>
      <h1>email= {{ email }}</h1>
      <h1>가입날짜 = {{ wdate }}</h1>
    </div>
    <div class="flex justify-center space-x-5">
    <button @click="modalUser" class="py-2 bg-blue-500 text-white font-semibold rounded-lg shadow-md hover:bg-blue-600 focus:outline-none focus:ring-2 focus:ring-blue-300">취소</button>
    <button  @click="modalUser('save')" class="py-2 bg-blue-500 text-white font-semibold rounded-lg shadow-md hover:bg-blue-600 focus:outline-none focus:ring-2 focus:ring-blue-300">저장</button>
  </div>
  </div>
  <div class="pb-10">
    <h1 class="h1-blue">UserList</h1>
    <div class="flex flex-wrap">
      <div
        @click="modalUser(item)"
        class="bg-pink-500 w-80 text-white cursor-pointer p-5 m-5 rounded"
        v-for="item in arr"
        :key="item.idx"
      >
        <h1>idx = {{ item.idx }}</h1>
        <h1>name = {{ item.name }}</h1>
        <h1>email= {{ item.email }}</h1>
        <h1>가입날짜 = {{ item.wdate }}</h1>
        <h1>작성한 글 = {{ item.list.length }}</h1>
        <button @click.stop="doDelete(item.idx)">삭제</button>
      </div>
    </div>
  </div>
</template>

<script setup>
import { deleteUser, getUsers, saveUser } from '@/api/userApi.js'
import { ref, watchEffect } from 'vue'


const arr = ref([])

const idx = ref();
const name = ref();
const wdate = ref();
const email = ref();

const isModal = ref(false)
const doDelete = async(idx)=>{
  await deleteUser(idx);
  const retValue = await getUsers();
  arr.value = retValue.data;
}
const modalUser = async (item) => {
  isModal.value = !isModal.value;

if(item == 'save'){
  await saveUser({
    idx:idx.value,
    name:name.value,
    password:"mypassword",
    email:email.value});
  
  
  alert('수정하였습니다.');
  const retValue = await getUsers();
  arr.value = retValue.data;
  return;
}

  idx.value = item.idx;
  name.value = item.name;
  wdate.value = item.wdate;
  email.value = item.email;
}

watchEffect(async () => {
  const retValue = await getUsers()
  // console.log("retValue ="+JSON.stringify(retValue.data));
  arr.value = retValue.data
  // console.log(arr.value)
})
</script>

<style scoped>
.h1-blue {
  font-size: 5rem;
  color: rgb(255, 127, 163);
}
.overlay {
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  background-color: rgb(0, 0, 0, 0.1);
  z-index: 1000;
  display: none;
}
.isModal {
  display: block;
}
.modal {
  position: fixed;
  top: 50%;
  left: 50%;
   height: 300px;
  transform: translate(-50%, -50%);
  background-color: white;
  z-index: 1001;
  display: none;
}
.isView {
  display: block;
}
</style>
