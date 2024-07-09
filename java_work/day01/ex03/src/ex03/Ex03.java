package ex03;

import java.util.Scanner;

// 두수를 입력받아 곱하기, 나누어서 몫 나머지를 구하시오
public class Ex03 {

	public static void main(String[] args) {
		//콘솔에서 입력받
		Scanner scan = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.println("숫자 입력");
		a = scan.nextInt();	
		b = scan.nextInt();
		
		System.out.println(a+"*"+b+"="+a*b);
		System.out.println(a+"/"+b+"="+a/b);
		System.out.println(a%b);
	}
	
}
