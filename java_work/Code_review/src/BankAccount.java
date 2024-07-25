import javax.xml.namespace.QName;

//고객의 대한 정보를 입력받을 변수를 선언.
public class BankAccount {

    String name;
    int num;
    int num2 = 0;

// 정보를 입력받을 생성자 만들기
    public BankAccount(String name, int num, int num2) {
        this.name = name;
        this.num = num;
        this.num2 = num2;
    }

    //정보를 보여주는 메서드
    public void Account(){
        System.out.println("성함 : " + this.name);
        System.out.println("계좌번호 : " + this.num);
        System.out.println("잔액은 " + this.num2 + "원입니다.");

    }

//입출금 메서드
    public void deposit(int a){
        num2 += a;
    }
    public void withdraw(int a){
        num2 -= a;
    }

}
