package org.example;

public class BoxFactory {
    public static <T> void peekBox(Box<T> box){
        System.out.println(box);
    }

    public static void peekBox2(Box<? extends Number> box){
        System.out.println(box);
    }

//    public static void peekBox4(Box<? extends AA> box){
//        System.out.println(box);
//    }
//
//    public static void peekBox5(Box<? super BB> box){
//        System.out.println(box);
//    }

    public static <T> T getMyBox(Box<? extends T> box){
        return box.getT();

    }
//    public static void peekBox3(Box<object> box){
//        System.out.println(box);
//    }
}
