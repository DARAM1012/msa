//배열 map->반환되는 값이 있는 경우, foreach->반환되는 값이 없는 경우

const arr1 = [1, 2, 3];

// const mapArr1 = arr1.map((item) => item * 3); //람다형식
// const mapArr1 = arr1.map(item=>{return item*3});
const mapArr1 = arr1.map(item=>{
    console.log("map 돌아갑니다");
    return item*3;
});//여러 줄일 경우엔 괄호를 써서 적을 수 있음

const foreachArr1 = arr1.forEach((item) => {}); //forEach는 반환값이 없다고 생각하기때문에 undefined가 뜸

console.log("mapArr1");
console.log(mapArr1);

console.log("foreachArr1");
console.log(foreachArr1);
