package day03;

import java.util.Scanner;

public class Ex13_Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int sum =0;
		
		for (int i = 0; i < 5; i++) {
			int n =sc.nextInt();
			if( n < 0 )
				continue;
			
			sum += n;
			
		System.out.println("양수의 합" + sum);
			
		}
		sc.close();
	}
}	
	