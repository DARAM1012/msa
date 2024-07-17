class Practice {
    public static void doA(){
        System.out.println("static doA");
    }
    public void doB(){

        System.out.println("그냥...instance doB");
    }
}

public class Ex06 {

    int num = 0;
    static void Add(int n){
        //유효한지 생각해보세요.
//        num +=n;
    }

    public static void main(String[] args) {
        Practice.doA();
        Practice test = new Practice();
        test.doB();

//        test.doA();
    }
}
