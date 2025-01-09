setTimeout(() => {
  console.log("test");
}, 3000);

setTimeout(() => {
  console.log("2초 뒤에");
}, 2000);


const aa = setInterval(() => {
    console.log("2초 마다");
  }, 2000)
  
setTimeout(()=>{
    clearInterval(aa);
},8000);

  console.log("출력됩니다.")