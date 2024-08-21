package org.example;

import java.util.Scanner;

public class main2 {

    main2() {
        System.out.println("되나");

        Scanner scanner = new Scanner(System.in);
        DBReository2 DBReository2 = new DBReository2();

        while (true) {

            System.out.println("""
                    뭐할래?
                    1. 입력
                    2. 조회
                    3. 수정
                    4. 삭제
                    5. 종료
                    """);
            int cho = scanner.nextInt();
            System.out.println(cho);
            if (cho==1){
                DBReository2.insert();
            }else if(cho==4){
                DBReository2.delete();
            } else if (cho==3) {
                DBReository2.update();

            } else if (cho==2) {
                DBReository2.select();

            } else {
                System.out.println("종료됩니다.");
                break;
            }
        }
    }

    public static void main(String[] args) {
        new main2();
    }

}
