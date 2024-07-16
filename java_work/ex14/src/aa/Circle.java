package aa;

public class Circle {
    public static final double PI = 3.1415;
    public static int a = 10;

    public void do둘래(){
        System.out.println(2*PI*a);
    }

    public void do넓이(){
        System.out.println(a*a*PI);
    }

    public int doA() {
        int sum = 0;
        int aa = 10;
        int bb = 20;

        for (int i = 0; i < 10; i++) {
            sum += i;

        }
        return sum;
    }
}
