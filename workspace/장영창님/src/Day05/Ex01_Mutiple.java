package Day05;

import java.util.Scanner;

public class Ex01_Mutiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 정수
		 * 3의 배수
		 * "3의 배수 입니다"
		 * "3의 배수가 아닙니다" 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 :");
		int N = sc.nextInt();
		
		if (N%3==0) {
			System.out.println("3의 배수 입니다");
		}
		else 
			System.out.println("3의 배수가 아닙니다");
	}

}
