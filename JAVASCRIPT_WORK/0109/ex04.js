const arr1 = [10, 3, 5];

// const sortArr1 = arr1.sort((a, b) => {
//   if (a > b) return -1;
//   else if (a < b) return 1;
//   else return 0;
// });

const sortArr1 = arr1.sort((a,b)=>{
    // return a-b;
    return b-a;
})

console.log(sortArr1);

const arr2 = [
    { name: "다람이", age: 32 },
    { name: "정해인", age: 31 },
    { name: "그린이", age: 10 },
  ];

  const sortArr2 = arr2.sort((item1,item2)=>{
    return item1.age - item2.age;
  })

  console.log(sortArr2);

  const arr3 = ["안녕","나는","다람이야"]

  console.log(arr3.join(" ")); //쌍 따온점이랑 띄어쓰기쓰면 출력될때 띄어쓰기로 잘 출력됨