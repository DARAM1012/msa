package org.example.friend;

/*
배열에서 클래스 다형성 문법으로 Friend 클래스 배열로 친구관리를 할 수 있는 프로그램
부모 참조 변수는 자식 인스턴스를 참조할 수 있다.
오버라이드
@Overrid 부모클래스에서 존재하는 메서드를 재정의할 때만 사용할 수 있음.<생략가능>
         존재하지 않는 메서드에 @Override 적으면 에러...
toString 메서드...

final은
변수..상수..
메서드..오버라이드 불가
클래스.. 상속불가
 */


public class Friend {
     String name;
     String phone;

    public Friend(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    public void showInfo(){
        System.out.println("이름 = "+name);
        System.out.println("연락처 = "+phone);
    }
}
