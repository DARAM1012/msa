import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {

        int num[][] = new int[4][3];

        System.out.println(num.length);
        System.out.println(num[0].length);
        System.out.println(num[1].length);
        System.out.println(num[2].length);


        int a = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                num[i][j] = a++;

            }
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j]+"\t");

            }
            System.out.println();
        }

        System.out.println(a);

        System.out.println(Arrays.toString(num[0]));
        System.out.println(Arrays.toString(num[1]));
        System.out.println(Arrays.toString(num[2]));
        System.out.println(Arrays.toString(num[3]));

        Arrays.fill(num[0],20);
        System.out.println(Arrays.toString(num[0]));
        System.out.println(Arrays.toString(num[1]));
        System.out.println(Arrays.toString(num[2]));
        System.out.println(Arrays.toString(num[3]));

        int nums[][][][] = new int [3][4][2][1];

    }
}
