console.log("ㅎㅎㅎ");

// 1 falsy값
const f1 = undefined; // 선언만 되어져있고 값이 할당 되지 않았을 때
const f2 = null; // 선언되어져있고 값이 null로 선언 되어 있을 때
const f3 = 0;
const f4 = -0;
const f5 = NaN // 숫자로 표기 할 수 없음 Not a Number
const f6 = "";

// const result =f1 && "result";
const result =f1 || "result";
console.log(result)


class A{
    a;
    constructor(a){
        this.a = a;
    }
} //옛날 선언 방법

// 2 truthy 값
const t1 = "result";
const t2 = 123;
const t3 = [];
const t4 = {a:20,b:20}; //json -> javascript object 자바스크립트는 이렇게 선언함
const t5 = ()=>{
    function a(){console.log("g함수")}
};
const t6 = new A(20);

const result2 = f5 && "result2222";
console.log(result2)

function printName(test){
    if(test){
        console.log(test + "출력된다");
    }
    else{
        // console.log(test + "출력안된다");
        console.log(`${test} 출력안된다`);
    }
}

printName(f5);
printName(t5);

function aa(a){
    if(a){
        console.log(a);
    }
}
