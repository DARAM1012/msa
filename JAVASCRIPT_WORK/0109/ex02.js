const arr1 = [
  { name: "다람이", age: 32 },
  { name: "정해인", age: 31 },
  { name: "그린이", age: 10 },
];

arr1.forEach(obj =>{
    console.log(obj);
})

console.log("\n");
const arr2 = [...arr1, {name:"조혜민",age:21}];
console.log(arr2)

//impor {ref} from 'vue';
//const arr1 = ref([]);
//arr1.value = [...arr1.value,{name:"박길동",age:40}];

const findObj = arr1.find(obj => {
    if(obj.name=="다람이" && obj.age===32){
        return obj;
    }
});

console.log(findObj);

const arr3 = [1,2,3,4];
const findIndx = arr3.findIndex(index=>{
    return index === 2;
})

console.log(findIndx);

const findIndx2 = arr3.findIndex(index=>{
    return index === 4;
})

console.log(findIndx2);