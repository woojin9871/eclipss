package day03;

public class Ex05_WhileSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int sum=0;
		int a=1;
		
		while (a <= 100) {
			
			sum += a++;
			sum += a++;
			
		}
		System.out.println("합계:"+ sum);
	}

}
