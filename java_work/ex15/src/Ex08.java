//1. Student 클래스를 작성하는 연습을 해보도록하자.
//        Student클래스에 getTotal() getAverage() 과 를 추가하시오
//    1. :  getTotal 메서드
//기능 국어 영어 수학 의 점수를 모두 더해서 반환한다 :
//        (kor), (eng), (math) .
//반환타입 : int
//매개변수 없음 :
//        2. : getAverage 메서드
//기능 총점 국어점수 영어점수 수학점수 을 과목수로 나눈 평균을 구한다 : ( + + ) .
//소수점 둘째자리에서 반올림할 것.
//반환타입 : float
//매개변수 없음


import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        for (int i = 0;     i < n     ; i++) {
            System.out.println(str);
        }
    }
}
