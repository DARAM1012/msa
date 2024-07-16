//1. 배열 [10,20,30,40,50] 알맞은 코드를 넣어 총합과 평균을 구하세요
//평균 = 총합/총갯수

import java.util.Arrays;


public class Ex10 {

    public static void main(String[] args) {
        int ar[] = {10, 20, 30, 40, 50};
        doA(ar);

//        int a = 10;
//        int b = 20;
//        int c = 30;
//        int d = 40;
//        int e = 50;
//
//        System.out.println(Arrays.toString(ar));
//        System.out.println("총 합 ="+(a+b+c+d+e));
    }

    public static void doA(int[] qw) {

        int sum = 0;
        for (int i = 0; i < qw.length; i++) {
            sum = sum + qw[i];


        }
        System.out.println("총합 =" + sum);
        System.out.println("평균 =" + sum / (qw.length));
    }
}
