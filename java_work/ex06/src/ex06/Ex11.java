package ex06;

public class Ex11 {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 0; i <= 20; i++) {
			if (i % 2 != 0 && i % 3 != 0) {

				System.out.println(i);

				sum = sum + i;
				System.out.println(sum);
			}

		}

	}

}
//!= ~가 아닌것?다르니?? , == ~가 같니? < 미만 <=이하, % 나머지