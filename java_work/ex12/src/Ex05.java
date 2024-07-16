import java.util.Arrays;

public class Ex05 {

    public static void main(String[] args) {
        int ar[] = new int[5];

        Arrays.fill(ar,3);

        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);

        }

        Arrays.fill(ar,0,0,10);

        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
}
