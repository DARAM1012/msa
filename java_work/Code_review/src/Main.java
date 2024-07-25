/*
홍길동과 임꺽정의 계좌를 만들자
계좌는 Class 형태로 만들고,
계좌주명, 계좌번호, 잔액의 데이터를 저장하고 있다.
계좌 Class는 계좌주명과 계좌번호를 매개변수로 받아서 생성하고,
초기 잔액은 0으로 한다.

은행계좌 Class는 입금과 출금, 그리고 정보를 출력하는 메서드를 가지고 있으며,
정보를 출력하는 메서드의 출력 형식은 다음과 같다.

[계좌주: "name", 계좌번호: "num", 잔액: "num2"]

main함수의 역할은 다음과 같다.
1. 홍길동의 계좌를 만든다. 계좌번호는 123456789이다.
2. 임꺽정의 계좌를 만든다. 계좌번호는 987654321이다.

홍길동의 계좌에 5000원을 입금한다.
임꺽정의 계좌에 3000원을 입금한다.

홍길동과 임꺽정의 정보를 출력한다.

홍길동의 계좌에서 3000원을 출금한다.
임꺽정의 계좌에서 1000원을 출금한다.

홍길동과 임꺽정의 정보를 출력한다.
 *///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import com.sun.management.HotSpotDiagnosticMXBean;

//이 클래스들을 사용해서 프로그램을 실행할 main 을 만들어 주기

public class Main{
    public static void main(String[] args) {
        BankAccount Hong = new BankAccount("토끼",123456789,0);
        BankAccount Lim = new BankAccount("여우",987654321,0);

        Hong.Account();
        Lim.Account();

        System.out.println();

        Hong.deposit(5000);
        Lim.deposit(3000);

        Hong.Account();
        Lim.Account();

        System.out.println();

        Hong.withdraw(3000);
        Hong.withdraw(1000);

        Hong.Account();
        Lim.Account();
    }
}