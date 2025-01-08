const aa = {
    a:"a변수입니다.",
    b:"bbbb는 20입니다",
    c:"c변수입니다.",
};

const {a,b,c} = aa;

console.log(`a = ${a}`);
console.log(`b = ${b}`);
console.log(`c = ${c}`);
console.log(aa);

//문자열로 만드는 함수 JSON.stringify();
const aaa = JSON.stringify(aa);

//문자열을 다시 객체로 만드는 함수 JSON.parse();
console.log(JSON.parse(aaa));
