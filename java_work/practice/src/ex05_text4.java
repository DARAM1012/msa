//아래는 화씨(F)를 섭씨(C)로 변환하는 코드이다. 변환공식이 'C = (F - 32) / 1.8' 라고 할 때 (1)에 알맞은 코드를 넣으시오.
// 단, 변환 결과값은 소수점 셋째자리에서 버려야한다. (형변환이용)

package practice.src;

public class ex05_text4 {


    public static void main(String[] args) {
        int F = 100;
        float C = ((int)((F - 32) / 1.8 * 100))/100f;

        System.out.println("F = " + F);
        System.out.println("C = " + C);
    }

//    public static void main(String[] args) {
//        int F = 100;
//        double C = (F - 32) / 1.8;
//        System.out.println(C);
//
//        C = C*100;
//        System.out.println(C);
//
//        C = (int)C;
//        System.out.println(C);
//
//        C = C /100;
//        System.out.println(C);



//        C = ((double)((int)C))/100;
//        System.out.println(C);




    }

