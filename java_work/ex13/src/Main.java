
/*
10진수를 입력받아 2진수로 출력.
 */

import java.util.Scanner;


// 클래스는 데이터(필드,클래스변수,인스턴스변수)와 메서드(함수,클래스함수,인스턴스변수)로 이루어져있다.

class Exam{
    Scanner scan = new Scanner(System.in);

    public int inputNumer(){
        System.out.println("숫자 입력");
        int inputNumber = scan.nextInt();
        System.out.println("inputnumber().inputnumber= "+inputNumber);
        return inputNumber;
    }
    
}

public class Main {
    public static void main(String[] args) {
       Exam exam = new Exam();
       int result = exam.inputNumer();
        System.out.println("main.result = "+result);
       
       // 18 /2
        int 몫,나머지;

        몫 = result/2;
        나머지 = result%2;
        
        System.out.println("몫 = "+몫);
        System.out.println("나머지 ="+나머지);

        String 나머지들 = ""+나머지;

        while(true){

            나머지 = 몫%2;
            몫 = 몫/2;
            나머지들 = 나머지 + 나머지들;

            System.out.println("몫 = "+몫);
            System.out.println("나머지 = "+나머지);
            System.out.println("나머지들 = "+나머지들);

            if(몫 <2){
                if (몫 !=0) {
                    나머지들 = 몫 + 나머지들;
                    System.out.println("나머지들 = " + 나머지들);
                }
                break;
            }

        }
    }
}