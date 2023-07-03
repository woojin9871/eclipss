package 연습;

import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
		System.err.println("점수를 입력하시오.");
		
		Scanner sc = new Scanner(System.in); 
			int score = sc.nextInt();
			
		if (score >= 90 ) {
				System.out.println("점수는 90점보다 큽니다.");
				System.out.println("등급은 A 입니다.");
				
			}else if (score >= 80){
				System.out.println("점수가 80점보다 큽니다.");
				System.out.println("등급은 B입니다.");
			}else if (score >= 70) {
				System.out.println("점수가 70점보다 큽니다.");
				System.out.println("등급은 C입니다.");
			}else if (score < 70) {
				System.out.println("점수가 70보다 낮습니다..");
				System.out.println("등급은 D입니다.");
			}
			sc.close();
	}
}
