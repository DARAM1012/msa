//1. "Hello.java" 문자열에서 파일명은 Hello와 확장자인 java를 분리시켜보자.
//
//입력 >>Hello.java
//        출력
//파일명 Hello
//확장자 java
//2. 자바 클래스를 작성하는 연습을 해보자. 다음 main() 메소드를 실행하였을 때 예시와 같이 출력되도록 TV 클래스를 작성하라.
//
//public static void main(String[] args) {
//    TV myTV = new TV("LG", 2017, 32); //LG에서 만든 2017년 32인치
//    myTV.show();
//}
//
//출력
//LG에서 만든 2017년형 32인치 TV

public class Test {
    public static void main(String[] args) {
    TV myTV = new TV("LG", 2017, 32);
    myTV.show();
    }
}

class TV{

    public TV(String lg, int i, int i1) {
        System.out.println(lg+"에서 만든 "+i+"인치");
        
    }

    public static void show() {
    }
}
