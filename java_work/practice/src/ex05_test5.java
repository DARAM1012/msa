//미터를 피트로 바꿀거에요

//피트 = 미터 * 3.281
//소수점 3자리에서 자를 겁니다
//33미터를 피트로 바꾸세요

//m의 값에 따라 f가 변하게 하세요

package practice.src;

public class ex05_test5 {
    public static void main(String[] args) {
        int m = 33;
        double f = (m*3.281);
        System.out.println(f);

        f = f*1000;
        System.out.println(f);

        f = (double) (int)f/1000;
        System.out.println(f);
    }
}
