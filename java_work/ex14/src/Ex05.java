import aa.Circle;

public class Ex05 {

    public static void main(String[] args) {
        System.out.println(Circle.PI);
        System.out.println(Circle.a);

//        Circle.doA();
//
//        System.out.println(Circle.sum);

        Circle c = new Circle();

        c.do둘래();
        c.do넓이();

        int result = c.doA();
        System.out.println(result);
    }
}
