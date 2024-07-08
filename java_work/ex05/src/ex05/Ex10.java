package ex05;

public class Ex10 {
	public static void main(String[] args) {
		// 3,4의 최소공배수

		// 3과 4로 나누었을 때 0으로 떨어지면..

		for (int num = 1; num < 100; num++) {

			if (num % 3 == 0 && num % 4 == 0) {
				System.out.println("num =" + num);
//				break;
			}
		}
	}
}
// && and 그리고