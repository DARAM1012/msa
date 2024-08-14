package org.example;
/*
1. Person 클래스에서 comparable을 상속받아 compareTo메서드를 재정의해서
이름글자의 갯수로 오름차순 내림차순으로 하였는데,
이 탐색의 기준이 이름(사전편찬순으로) 되도록 수정해보자.
ㄱ,ㄴ,ㄷ,ㄹ,ㅁ,ㅂ,ㅅ,
2. 다음 코드가 실행되도록 SwapBox 메소드를 정의 하되, ABox<T> 인스턴스를 인자로 전달 받을 수 있도록 정의하자.
 단 이때 ABox<T> 인스턴스의 T는 NUmber 또는 이를 상속하는 하위 클래스만 올 수 있도록 제한된 매개변수 선언을 하자.
*/
//class ABox<T>{
//    private T ob;
//    public T getOb() {     return ob;  }
//    public void setOb(T ob) {     this.ob = ob;    }
//}
//public class Ex05 {
//    // 이 위치에 swapBox 메소드를 정의하자
//    public static void main(String[] args) {
//        ABox<Integer> box1 = new ABox<>();
//        box1.setOb(99);
//        ABox<Integer> box2 = new ABox<>();
//        box1.setOb(55);
//        System.out.println(box1.getOb() + " & " + box2.getOb());
//        swapBox(box1,box2);
//        System.out.println(box1.getOb() + " & " + box2.getOb());
//    }
//}
