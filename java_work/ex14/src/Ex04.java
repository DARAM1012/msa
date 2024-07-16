class InstClass{
    static int num = 0;
    InstClass(){

        num++;
        System.out.println(num);
    }
}

public class Ex04 {
    public static void main(String[] args) {
        System.out.println(InstClass.num);
        InstClass in1 = new InstClass();
        InstClass in2 = new InstClass();
        InstClass in3 = new InstClass();
        InstClass in4 = new InstClass();

        System.out.println(in1.num);

    }
}
