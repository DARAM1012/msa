package org.example;

import org.example.friend.CompFriend;
import org.example.friend.UnlFriend;

import java.rmi.server.UnicastRemoteObject;
import java.util.Arrays;

public class Ex03 {

    public static void main(String[] args) {

        int ucnt = 0;
        int ccnt = 0;

        // 대학동창
        UnlFriend unlFriend[] = new UnlFriend[10];
        // 회사동료
        CompFriend compFriend[] = new CompFriend[10];

        unlFriend[ucnt++] = new UnlFriend("홍길동", "010-9900-2600", "ㅎㅎ");

        System.out.println(Arrays.toString(unlFriend));
        System.out.println(Arrays.toString(compFriend));

//        System.out.println("ucnt = "+ucnt); 확인해보기
        for (int i = 0; i < ucnt; i++) {
            unlFriend[i].showInfo();

        }
        for (int i = 0; i < ccnt; i++) {
            compFriend[i].showInfo();

        }
    }
}
