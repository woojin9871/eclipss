package Day01;

import java.util.Scanner;

public class Ex02_intro {

	public static void main(String[] args) {
	
		
		//sysout : ctri + space
		
		System.out.println("이름, 주소, 자기소개를 공백을 두고 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		System.out.println("이름 : " + name);
		
		String address = sc.next();
		System.out.println("주소 : " + address);
		
		String intro = sc.next();
		System.out.println("자기소개 : " + intro);
		
		System.out.println("나이, 키를 공백을 주고 입력하세요.");
		int age = sc.nextInt();
		System.out.println("나이 : " + age);
		
		double height = sc.nextDouble();
		System.out.println("키 : " + height);  
	
		sc.close();
	
	}

}
