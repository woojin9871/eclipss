package day03;

import java.util.Iterator;
import java.util.Scanner;

public class Ex09_Gugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	System.out.println("입력 : ");
	int input = sc. nextInt();
	
	for (int i =1; i <= 9; i++) {
		for (int j =1; j <= 9; j++) {
			
			System.out.println(i+"*"+j+"=" +i*j);
			System.out.print("\t");
					
		}
		System.out.println();
	}
		
		
	}

}
