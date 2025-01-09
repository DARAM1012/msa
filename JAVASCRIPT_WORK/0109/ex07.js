const doA = () => {
  const promis = new Promise((resolve, reject) => {
    setTimeout(() => {
      // resolve("잘됨");
      reject("못됨");
    }, 3000);
  });
  return promis;
};

// console.log(Promise);

//resolve는 then으로 들어가고 reject는 catch로 들어감
// 
doA()
  .then((result) => {
    console.log(result);
  })
  .catch((error) => {
    console.log(error);
  });
