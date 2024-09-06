const obj = {}; //객체 선언

obj.a = 10;
obj.b = () => {
  console.log('obj.b');
}

console.log(obj);
console.log(obj.a);
console.log(obj.b);

obj.b();