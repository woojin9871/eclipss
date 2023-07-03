package day04;

import java.util.Scanner;

public class Ex03_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = new int [3][];
		a[0] = new int [2];
		a[1] = new int [3];
		a[2] = new int [4];		
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = sc.nextInt();			
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {	
				System.out.println(a[i][j]);
			}
			System.out.println();
		}
		sc.close();
	}	
}
