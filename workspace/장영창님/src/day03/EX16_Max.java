package day03;

import java.util.Scanner;

public class EX16_Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int arr[] = new int[N];
		
		int max = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
		//	if(max < arr[i]) {
			if( max < arr[i] ) {
				max =  arr[i];
			}	
		}
		
		System.out.println("최대값 : " + max);
		sc.close();
	}

}
