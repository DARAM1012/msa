package ex05;

public class Ex11 {

	public static void main(String[] args) {
		int num = 0;
		while ((num++) < 100) {
			if (num % 5 != 0 || num % 7 != 0)
				continue;

			System.out.println("num=" + num);

		}

	}

}
