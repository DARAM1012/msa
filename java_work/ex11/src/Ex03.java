public class Ex03 {
    public static void main(String[] args) {
// int a,b,c,d,e,f,??;


//int 배열은 값을 넣지 않으면 0으로 초기화
        int a[] = new int[10];
        int b[] = {1,2,3,4};

        System.out.println("a.length ="+a.length);

        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
//        System.out.println(a[10]);

        a[0] = 20;
        System.out.println(a[0]);

        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(b[3]);
    }
}
