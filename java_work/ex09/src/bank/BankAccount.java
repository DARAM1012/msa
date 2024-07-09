package bank;

public class BankAccount {

    int num = 0;

    public int cmb() {
        System.out.println("잔액" + this.num);
        return num;
    }

    public void deposit(int a) {
        //   num = num + a;
        num += a;
    }
        public void withdraw ( int a){
            num -= a;


    }
}
