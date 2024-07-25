package org.example;

import java.util.Scanner;



class player{

    String word;

    String array[] = new String[10];

}



class method{

    static void step3(String a, String b) {

        player user = new player();

        user.array[1] = a;

        user.array[2] = b;

        char c3,c4;

        c3 = user.array[1].charAt(user.array[1].length()-1);

        c4 = user.array[2].charAt(0);







        if (c3==c4) System.out.println("성공");

        else System.out.println("실패");

    }



    static void step2() {

        Scanner s = new Scanner(System.in);

        player user1 = new player();

        player user2 = new player();





        System.out.println("첫번째 단어를 입력해 주시오");

        user1.word = s.nextLine();



        System.out.println("두번째 단어를 입력해 주시오");

        user2.word = s.nextLine();



        char c1,c2;

        c1 = user1.word.charAt(user1.word.length()-1);

        c2 = user2.word.charAt(0);







        if (c1==c2) System.out.println("성공");

        else System.out.println("실패");



        s.close();

    }



    static void run(int sw) {







        Scanner s = new Scanner(System.in);



        if(sw==1) {

            System.out.println("첫번째 단어를 입력해 주시오");

            String a = s.nextLine();

            System.out.println("두번째 단어를 입력해 주시오");

            String b = s.nextLine();

            step3(a,b);

        }

        else if(sw==2) {

            step2();

        }

        else {System.out.println("잘못된입력입니다.");}



        s.close();

    }

}



public class ClassAndStringArrayEx extends method {

    public static void main(String[] args) {



        System.out.println("프로그램을 시작합니다");



        System.out.println("실행 방식을 선택해주세요, \n<1> Step2 <2> step3");



        Scanner scan = new Scanner(System.in);



        int a= scan.nextInt();



        run(a);



        scan.close();

    }

}