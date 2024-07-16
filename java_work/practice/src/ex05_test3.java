//아래는 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다. 만일 변수 num의 값이 456 이라면 400이 되고 111이라면 100이 된다. (1)에 알맞은 코드를 넣으시오

package practice.src;

public class ex05_test3 {

    public static void main(String[] args) {
        double num = 11.11;
       System.out.println((int)num);
    }
}


//만약에 num의 값이 456이면 400이 출력
//만약에 num의 값이 111이면 100이 출력