class Box {
    String conts;

//    Box(String conts){
//        
//    }

//alt + insert 키 생성자 만들기
//alt + insert 키 toString

    /*
    int 형 배열은 0으로 초기화됩니다.
    String(객체) 배열은 null로 초기화됩니다.
     */

    public Box(String conts) {
        this.conts = conts;
    }

    public String toString() {
        return "Box{" + "conts='" + conts + '\'' + '}';
    }
}

public class Ex04 {
    public static void main(String[] args) {
        Box[] boxs = new Box[5];
        boxs[0] = new Box("사과");

        for (int i = 0; i < boxs.length; i++) {
            System.out.println(boxs[i]);
        }
    }
}
