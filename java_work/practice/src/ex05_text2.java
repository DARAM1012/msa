package practice.src;

// 아래는 변수 num의 값에 따라 '양수', '음수', '0'을 출력하는 코드이다. 삼항 연산자를 이용해서 (1)에 알맞은 코드를 넣으시오

public class ex05_text2 {

    public static void main(String[] args) {
        int num = 10;

        if(num>0)
            System.out.println("양수");
        else if ( num<0)
        System.out.println("음수");

        else if (num==0)
            System.out.println("0");

    }
}

//1.num이 양수면 양수를 출력한다
//2.num이 음수면 음수를 출력한다
//3.num이 0면 0을 출력한다
