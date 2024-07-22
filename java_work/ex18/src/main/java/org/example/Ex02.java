package org.example;

import java.util.Arrays;

public class Ex02 {

    public static void main(String[] args) {
        int test[] = {1, 2, 3};
        int test1[] = {4, 5, 6, 7};
        int temp[][] = {test, test1, {8, 9, 10, 11}};

        int arr[][] = {{1, 2, 3,}, {4, 5, 6,}, {7, 8, 9}};

        int dimension3[][][] = {arr, temp};

        int temp0[] = arr[0];
        int temp1[] = arr[1];
        int temp2[] = arr[2];

        arr[0] = temp2;
        arr[1] = temp0;
        arr[2] = temp1;


        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));

        System.out.println("temp");
        System.out.println(Arrays.toString(temp0));
    }
}
