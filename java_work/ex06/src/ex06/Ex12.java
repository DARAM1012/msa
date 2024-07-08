package ex06;

// 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+4+...+10)의 결과를 계산하시오

public class Ex12 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.println("i=" + i + "j=" + j);
				
				sum = sum + j;
				
			}
			
		}
		System.out.println("총 합은="+sum);
	}
}
