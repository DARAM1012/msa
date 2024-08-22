package org.example;

import java.util.Arrays;

public class Ex05 {

    public static void main(String[] args) {

        String []arr = new String[]{"a","b","c"};

        showAll(arr);

        showAll("TEST");
        showAll("TEST","AAA");
        showAll("TEST","AAA","BBB");
    }

    private static void showAll(String ...args) {
        System.out.println(args);
        System.out.println(Arrays.toString(args));
    }

}
