import { useState } from "react";
import "./App.css";
import { use } from "react";

function App() {
  // ref();

  const doA = () => {
    return [
      10,
      () => {
        console.log("doA");
      },
    ];
  };

  const [bb, bbb] = doA();

  const [aa, setAA] = useState(10);

  const clickA = () => {
    console.log("누르네...");
    setAA(aa + 1);
  };

console.log("랜더링");
console.log(bb);
console.log(bbb);

  return (
    <>
      <h1>깰꼼</h1>
      <h1>{aa}</h1>
      <button onClick={clickA}>누르면 aa값 증가</button>
    </>
  );
}

export default App;
