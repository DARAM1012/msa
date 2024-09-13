package org.example.service;

import java.sql.SQLException;
import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        UserMain userMain = new UserMain();
        AdminMain adminMain = new AdminMain();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("영화 조회 서비스 목요명회입니다.\n");
            System.out.print("""
                     💗💗⠀ ⠀ 💗💗
                    💗🍬🍬💗🍬🍬💗
                   💗 🍬🍬🏠🍬🍬 💗
                    💗 SWEET MYMH 💗
                    ⠀💗 🍬🍬🍬 💗
                    ⠀ ⠀ 💗🍬💗
                    ⠀ ⠀ ⠀ 💗
                    """);
            System.out.println("""
                    로그인 할 아이디를 입력해주세요.
                    1. 👱🏻 사용자
                    2. 👩🏻‍🦱 관리자
                    0. 종료
                    """);

            int log = scan.nextInt();
            if (log == 1) {
                userMain.user();
            } else if (log == 2) {
                adminMain.admin();
            } else if (log == 0) {
                System.out.println("종료합니다.");
                break;
            } else {
                System.out.println("1번 2번 중에서 골라주시기 바랍니다." +"\n");
            }
        }
    }
}