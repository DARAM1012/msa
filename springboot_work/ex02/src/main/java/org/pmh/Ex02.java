package org.pmh;

import org.pmh.components.CC;

public class Ex02 {
    // 프레임 워크는 어떤 개발방법론, 개발 패턴 정하는것
    public static void main(String[] args) {
        CC cc1 = CC.getInstance();
        System.out.println(cc1);

        CC cc2 = CC.getInstance();
        System.out.println(cc2);

        CC cc3 = new CC();

        System.out.println(cc1==cc2);

        System.out.println(cc1==cc3);
    }
}
