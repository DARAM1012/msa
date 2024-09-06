let arr = [1,2,3];
let brr = [4,5,6];
let myarr = [{ age:20,name:"홍길동"},{age:30,name:"박길동"},{age:40,name:"김길동"}];
console.log(arr+brr);
console.log(arr.concat(brr));

// filter 주어진 함수에 predicate 람다 true, false 새로운 배열
// 자바 collect(newArrayList),(a,c)=>a.add(c),(1,2)->{})
const crr = arr.filter((n)=>n%2==0);
console.log(crr);

const filterArr = myarr.filter(item => item.age>20);
console.log(filterArr);