public class Ex06 {
    public static void main(String[] args) {
        String a = "asd";
        String b = "bsd";

        System.out.println(a+b);
        System.out.println(a.concat(b));

        System.out.println(a.compareToIgnoreCase("ASD"));
        System.out.println(a.compareToIgnoreCase("ASd"));

        System.out.println(a.compareToIgnoreCase("ASda"));
        System.out.println(a.compareToIgnoreCase("qwerttt"));

        System.out.println();

        System.out.println(a.compareToIgnoreCase("ASD"));
        System.out.println(a.compareToIgnoreCase("ASd"));

        System.out.println();

        System.out.println(a.compareToIgnoreCase("ASda"));
        System.out.println(a.compareToIgnoreCase("qwerttt"));
        System.out.println(a.compareToIgnoreCase("qwqweqrqwrw"));

    }
}
