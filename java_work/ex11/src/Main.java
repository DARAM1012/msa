import java.util.Scanner;

class Fact {

    public int fact(int num) {
        System.out.println("여기오나" +num);
        // 메서드 반환값을 적게 되면 반환값이 무조건 있어야한다.

        //   2 * fact(2)

        if (num > 0) {
            return 2 * fact(num - 1);
        } else {
            return 1;
        }
    }
}


public class Main {
    public static void main(String[] args) {

        /*
    String -> int Integer.parseInt
    int -> String 10+"";
    문자열 입력 scan.nextLine 숫자 입력 scan.nextInt
     */

        Scanner scanner = new Scanner(System.in);
        System.out.println("몇승 구할래?");

        String a = scanner.nextLine();
        int num = Integer.parseInt(a);

        Fact fact = new Fact();
        int result = fact.fact(num);

        System.out.println("result="+result);

//        System.out.println(a);
//        System.out.println(num);
//        int num = scanner.nextLine();


        //클래스의 정의와 인스턴스화

    }
}