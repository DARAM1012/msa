const doA = (a, b = 20, c = 30) => {
  console.log(`a=${a}`);
  console.log(`b=${b}`);
  console.log(`c=${c}`);
}

doA();

// doB 함수 선언
function doB(){}
// doC 함수 선언
const doC = function(){} // 여기에서 this onclick -> button this 는 버튼태그가 됩니다.
const doD = ()=>{}  // 여기에서 this -> window 객체가 this가 됩니다.
