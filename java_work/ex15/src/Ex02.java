import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex02 {
    Ex02() {
        System.out.println("일로옵니다..");
        String result = solution("Hellowrld", "lloworl", 2);
        System.out.println(result);
    }

    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        char[] c_my_string = my_string.toCharArray();
        char[] c_overwrite_string = overwrite_string.toCharArray();

        System.out.println(Arrays.toString(c_my_string));
        System.out.println(Arrays.toString(c_overwrite_string));

        System.arraycopy(c_overwrite_string,0,c_my_string,s,overwrite_string.length());
        System.out.println(Arrays.toString(c_my_string));
        answer = new String(c_my_string);
        return answer;
    }

    public static void main(String[] args) {
        new Ex02();
    }
}
