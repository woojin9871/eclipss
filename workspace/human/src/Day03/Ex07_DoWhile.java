package Day03;

import java.util.Scanner;

// ##### 점심 메뉴판 #####
// 1. 김밥-빨강오뎅
// 2. 설렁탕
// 3. 순대국밥
// 4. 맥도날드
// 0. 종료

public class Ex07_DoWhile {
	
public static void main(String[] args) {
		
		// 변수 선언 : 메뉴번호, 메뉴이름
		int menuNo = 0;
		String menuName = "";
		Scanner sc = new Scanner(System.in);
		
		// do~while문
		// : 무조건 1회는 실행, 조건 검사하여 반복하는 반복문
		do {
			System.out.println("##### 점심 메뉴판 ##### ");
			System.out.println("1. 김밥");
			System.out.println("2. 설렁탕");
			System.out.println("3. 순대국밥");
			System.out.println("4. 맥도날드");
			System.out.println("0. 종료");
			System.out.print("메뉴번호 : ");
			
			// 메뉴번호 입력
			menuNo = sc.nextInt();
			
			switch (menuNo) {
				case 1:	menuName="김밥";						
						break;
				case 2:	menuName="설렁탕";						
						break;
				case 3:	menuName="순대국밥";						
						break;
				case 4:	menuName="맥도날드";						
						break;
				default:menuName="(없음)";
						break;
			}
			// 메뉴번호가 0이 아니면,
			if( menuNo != 0 ) {
				System.out.println(menuName + "(을/를) 먹었습니다.");
			}
			
		} while (menuNo != 0);
		// 무한루프 : 조건이 항상 true가 되는 경우 반복이 계속된다.
		// - 반드시, 반복문 안에 종료조건을 넣어주어야 한다.
		
		System.out.println("메뉴판을 종료합니다.");
		sc.close();
	}
			
	}
			
		
		
		

