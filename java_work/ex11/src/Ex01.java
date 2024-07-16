public class Ex01 {

    public static void main(String[] args) {
        int total = 5000;
        System.out.println("DVD한편 빌려서 3500원");
        total = 3500;

        int cri = 500;
        int sa = 700;
        int coke = 400;

        total = total - (cri + sa + coke);
        System.out.println(total);

        int cri_count = 1;
        int sa_count = 1;
        int coke_count = 1;

        total = total - (cri + sa + coke);
        System.out.println(total);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 4; k++) {
                    if (1900==(cri*i+sa*j+coke*k)){
                        System.out.println("i="+i+"j="+j+"k="+k);
                        System.out.println("크림빵은"+(1+i));
                        System.out.println("새우깡은"+(1+j));
                        System.out.println("콜라는"+(1+k)+"살 수 있다.");
                    }
                }

            }

        }
    }
}
