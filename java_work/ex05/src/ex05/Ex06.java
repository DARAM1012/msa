package ex05;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		
		//계속 입력 받아서 진행...
		Scanner scan = new Scanner(System.in);
				
		// break -> while 탈출
		// break -> switch 탈출
		
		while(true) {
			
			int num = scan.nextInt();
			System.out.println("num = "+num);
			
			if(num==0) {
				break;
			}
		}
		System.out.println("종료됩니다.");
	}
}
