const getData = async () => {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      //   resolve({
      //     name: "홍길동",
      //     age: 20,
      //     gender: "남자",
      //   });
      reject({
        arror: "에러다",
        code: 500,
      });
    }, 3000);
  });
};

const prinData = async () => {
//   try {
//     const res = await getData();
//     console.log(res);
//   } catch (e) {
//     console.log(e);
//     alert("통신실패");
//   }
getData()
    .then(
      result=>
        { console.log(result); }
    )
    .catch(e=>{
      console.log(e);
      alert('통신실패');
    });
}

prinData();
