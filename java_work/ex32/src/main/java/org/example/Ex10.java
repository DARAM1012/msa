package org.example;

import java.util.Scanner;

public class Ex10 {
    private  MemberRepository memberRepository = new MemberRepository();
    Ex10() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    뭐할래?
                    1. select()
                    2. insert()
                    3. update()
                    4. delete()
                    5. todo select() -> user 사용자
                    6. todo insert() -> user 정보
                    7. todo update() -> user 
                    8. todo delete() -> user 
                                    
                    """);

            int ra = scanner.nextInt();
            if (ra == 1) {
                memberRepository.select();
            } else if (ra == 2) {
                memberRepository.insert();
            } else {
                System.out.println("종료됩니다");
                break;

            }
        }
    }

    public static void main(String[] args) {
        new Ex10();
    }
}
