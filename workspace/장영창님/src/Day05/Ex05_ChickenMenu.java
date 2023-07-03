package Day05;

import java.util.Scanner;

/* 
 * 질문 do  while - 사이에 넣기 
 * 
 * 
 * 
 * 
 * 
 * 치킨 메뉴
 * 1. 교촌 - 허니콤보 치킨
 * 2. 
 * 
 * 
 * 
 * 들여쓰기 tab
 * 내어쓰기 shift tab
 * 탭정리  sctrl hift f
 * 
 */


public class Ex05_ChickenMenu {

메소드 
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int menuNo = 0;
		String menuName = "  ";
		
		Scanner sc = new Scanner(System.in);
		
		
		do {
		
			
			
			
			
			
		} while (condition);
		
		
		System.out.print("입력 : ");
		menuNo = sc. nextInt();
		
		switch (menuNo) {
		case 1:  menuName = "하나로";
			break;
		case 2:  menuName = "황금";
				break;
		case 3:  menuName = "도미노";
				break;
		case 4:  menuName = "시장";
				break;
		default:
			break;
		}		
		
		
		// 유효성
		if (menuNo >= 0 &&  menuNo <=4) {
			System.out.println(menuName + " 이 주문됨");
			else {
				System.out.println("0~4번 사이 숮자" );
			}
			
			
			}
		}
		
		
	}

}
