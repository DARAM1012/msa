package ex06;

public class Ex10 {

	public static void main(String[] args) {

		// 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20
		int sum = 0;
		
		for (int num = 0; num <= 20; num++) {
			if (num%2 != 0 && num%3 != 0) {
				System.out.println(num);
				
				sum = sum + num;
				System.out.println(sum);
			}
		}
		
		
	}
}

// != ~가 다르니? , == ~가 같니? < 미만 <=이하

//public static void main(String[] args) {
//	for (int i = 0; i < 10; i++) {
//		for (int j = 0; j <= i; j++) {
//			System.out.println("*");
//		}
//		System.out.println();
//	}
//}