package org.example;

public class Main {
    public static void main(String[] args) {
        AA a1 = new AA("AA");
        AA a2 = new AA("AA");
        AA a3 = new AA("AAA");

        a1.printThis(a2);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        System.out.println(a1.equals(a2));
        System.out.println(a2.equals(a1));
        System.out.println(a3.equals(a1));

        System.out.println(a1==a2);

//        A a = new A();
//        a = null;
    }
}