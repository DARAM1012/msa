//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/*
    1+ (1+2)+(1+2+3)...(1+2+3+4+...+10)
    의 결과를 출력하여라

    i = 0 일 때 j가 0에서 0+0미만 반복해라
    i = 1 일 때 j가 0에서 1+1미만 반복해라
    i = 2 일 때 j가 0에서 2+1미만 반복해라
    i = 3 일 때 j가 0에서 3+1미만 반복해라
    i = 4 일 때 j가 0에서 4+1미만 반복해라
    ...
    i = 10 일 때 j가 0에서 10+1까지 반복해라
 */

        int sum = 0;

        for (int i = 0; i < 10; i++) {

            for (int j = 1; j < i+1; j++) {
                System.out.println("j = " +j);
                sum = sum+j;
            }
            System.out.println("sum = "+sum);

            //System.out.println("i = "+i);
        }
        System.out.println("sum = "+sum);
    }
}

//shift + Del = 한줄 삭제
//shift + f10 현재 설정된 파일 실행
//crl + shift + f10 열려진 파일 실행
//crl + alt + L 정렬
//alt + 1 프로젝트<<경로 / alt+insert 파일 생성 , esc키 누르면 다시 작업으로 돌아옴
//ctrl + e 파일 찾기(이동) / shift + shift 파일 이동
