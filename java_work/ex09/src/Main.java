import java.util.Scanner;
import aa.bb.Fact;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //입력받는 변수 선언
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자 입력");
        int result = scanner.nextInt();

        Fact fact1 = new Fact();
        int retValue = fact1.aa(result);

        System.out.println("result = "+result);
        System.out.println("retValue = "+retValue);


//        Fact fact2 = new Fact();
    }
}