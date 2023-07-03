package day03;

import java.util.Scanner;

public class EX02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner  sc  = new Scanner(System.in);
		
		char grade =sc. next(). chatAt(0);
		
				
		switch (grade) {
		
		case 'A':
			System.out.println("90~100점입니다");
			break;
		case 'B':
			System.out.println("80~89점입니다");
			break;
		case 'C':
			System.out.println("70~79점입니다");
			break;
		case 'D':
			System.out.println("60~69점입니다");
			break;
		case 'F':
			System.out.println("60점 미만입니다");
			break;
		default:	
			System.out.println("A~F 문자입력");
		    break;
			
			
			
		
		}
		
		
		
		
	}

}
