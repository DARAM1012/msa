package practice.src;

public class ex05_text {

    public static void main(String[] args) {
        int numOFApples = 123;
        int sizeOfBucket = 10;
        int numOFBucket =  numOFApples/sizeOfBucket + (numOFApples%sizeOfBucket > 0 ? 1:0);

        System.out.println("필요한 바구니의 수" + numOFBucket);

    }
}
