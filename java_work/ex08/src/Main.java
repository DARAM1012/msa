//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void doA() {

        int i = 0;
        while (i<10){
            int j = 0;
            while (i<=i) {
                j++;
                System.out.println("*");
            }
            System.out.println();
            i++;
        }
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }

    public static void main(String[] args) {
        doA();
        doA();
        doA();

        }
    }


//ctrl + alt + L 자동정렬