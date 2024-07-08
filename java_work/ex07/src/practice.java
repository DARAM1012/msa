/*
ctrl + shift + f10 현재 열려진 파일 실행

1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때,
몇가지 더해야 총합이 100이 되는지 구하시오.


 */


public class practice {

    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i < 203; i++) {
            System.out.println("i=" + i);

            if (i % 2 == 0) {
                sum = sum - i;

            } else {
                sum = sum + i;
            }
            System.out.println("중간=" + sum);
            if (sum == 100) {
                break;
            }
        }
    }
}



