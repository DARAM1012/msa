public class BB {
    public static int doA(){

        int a = 10;
        System.out.println("doA");
        System.out.println("a = "+a);

        return a;

    }

    public static void main(String[] args) {
        int a = doA();
        System.out.println("main a ="+a);
    }

}
