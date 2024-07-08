package ex06;

public class Ex03 {

	private static void hieveryone(int i) {
		
		System.out.println("여기온다"+i);
		
		if(i==12) {
			System.out.println("i = 12입니다");
		}
		
		for(int k = 0; k<3;k++) {
			System.out.println("k="+k);
		}
	}	
	
public static void main(String[] args) {
	int k =20;
		System.out.println("===프로그램 시작==="+k);
		hieveryone(12);
		hieveryone(13);
		System.out.println("===프로그램 끝===");
}
	
	
		
	}

