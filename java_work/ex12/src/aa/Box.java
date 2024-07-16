package aa;

public class Box {
    String name;
    int count;

    /*
    기본 생성자는 생략가능 하지만
    다른 생성자를 선언할 시 기본 생성자 생략 불가
     */

    public Box(){

        System.out.println("기본 생성자 호출");
    }
    
        
    public Box (String n){
        name = n;
        System.out.println("n 다른 생성자 호출");
    }


    public Box (String n,int c){
        name = n;
        count = c;
        System.out.println("n c 다른 생성자 호출");
    }

    // 생략..
    // toString() 주소값 출력


    // 개발자 프로그래머가 직접 적게되면 내용이 바뀌는 거죠
       public String toString() {
        return "Box name = "+name + " "+" count = " +count;
    }

    //메서드 이름이 동일할 수 없다
    public void doA(){}
    public void doA(String a){}
}


