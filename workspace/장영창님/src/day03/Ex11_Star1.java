
package day03;

import java.util.Iterator;
import java.util.Scanner;

public class Ex11_Star1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner sc = new Scanner(System.in);
	int N =sc.nextInt();
	
		for (int i = 1; i<=N ; i++) {
			// i : 1
			// i : 2
			// i : 3
			for (int j = 1; j<=i ; j++) {
				// i : 1, j : 1
				// i : 2, j : 1,2
				// i : 3, j : 1,2,3
	
	//		for (int i = 1; i<=1 ; i++) {
	//			for (int j = 1; j<=2 ; j++) {			
			
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
	}

}
