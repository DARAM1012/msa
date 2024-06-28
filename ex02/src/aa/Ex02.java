package aa;

public class Ex02 {

	public static void main(String[] args) {
		
		byte a = 127; // 0111 1111 => 2진수로..
		System.out.println(a);
		
		// overflow
		System.out.println((byte)(a+1));
	
	}
}
