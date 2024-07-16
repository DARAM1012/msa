public class Ex06 {
    public static void main(String[] args) {
        /*
        주어진 과제
        String -> char[]
        char[] -> String
         */

        //문자열
        String str = "우리는 할 수 있나?";
        
        //문자배열
        char[] chars = str.toCharArray();

        System.out.println(chars[0]);
        System.out.println(chars[1]);
        System.out.println(chars[2]);
        System.out.println(chars[3]);
        System.out.println(chars[4]);
        System.out.println(chars[5]);
        System.out.println(chars[6]);

        chars[4]='A';
        System.out.println(chars[4]);

        String aa = new String(chars);
        System.out.println(aa);
    }
}
