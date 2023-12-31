package Day05;

import java.util.Scanner;

/*
 	 금액	: 534760
 	 50000	: 10개
 	 10000	: 3개
 	 5000	: 0개
 	 1000	: 4개
 	 500	: 1개
 	 100	: 2개
 	 50		: 1개
 	 10		: 1개
 	 5		: 0개
 	 1		: 0개
 	 
 	위와 같이 금액을 입력하면,
 	큰 화폐단위부터 계산하여 화폐단위별로 화폐매수를
 	출력하는 프로그램을 작성하시오.
 */
public class Ex02_NumberOfCurrency {
	// 순서도를 작성하는 연습을 해주세요!!
	// 1. 변수 선언
	// 2. 입력
	// 3. 화폐단위별로 금액 나누기 (반복문 이용)
	// 4. 각각의 화폐매수 출력
	// 매수를 새고 잔돈이 남고 또 그 매수를 샌다

	// 1. 필요한 변수 선언
	// - (입력금액), (화폐매수), (화폐단위)
	// 2. (입력금액) 입력
	// 3-1. 화폐매수 계산
	// [조건] : 큰 화폐 단위부터 계산한다.
	// -화폐조건 계산
	// (화폐매수) = (입력금액) / (화폐단위)
	// count = 534760 / 50000 = 10
	// 3-2. 잔액 계산
	// (잔 액) = (입력금액) - (화폐단위x화폐매수)
	// inout = input - ( money*count )
	// (잔 액) = (입력금액) % (화폐단위)
	// input = input % money

	// 3-3. 화폐단위 변환
	// 번갈아 가면서 /5, /5
	// (화폐단위) = (화폐단위 / 5)
	// (화폐단위) = (화폐단위 / 2)
	// 50000 --> 10000 :50000 / 5
	// 10000 --> 5000 :10000 / 2
	// 5000 --> 1000 :5000 / 5
	// 1000 --> 500 :1000 / 2

	// 4. 3-1 ~ 3-3 의 과정을
	// (화폐단위)가 1보다 크거나 같으면, 반복한다

	// 5. 3-1에서 화폐매수를 구하여 출력한다.
	public static void main(String[] args) {
		// 1.
		// (입력금액), (화폐매수), (화폐단위)
		int input;
		int count;
		int money = 50000; 	// 큰 화폐단위부터 시작
		boolean sw = true;
		
		// 2.
		System.out.println("금액 : ");
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		
		// 4.
		// (화폐단위)가 1보다 크거나 같으면, 반복한다
		while( money >= 1) {
			// 3-1. 화폐매수 계산
			//	(화폐매수) = (입력금액) - (화폐단위x화폐매수)
			count = input / money;
			System.out.println(money + "\t : " + count + "개");
			
			// 3-2. 잔액 계산
			//(잔 액) = (입력금액) - (화폐단위x화폐매수)
			// (잔 액) = (입력금액) % (화폐단위)
			// inout = input - ( money*count );
			input = input % money;
			
			// 3-3 화폐단위 변환
			//		(화폐단위) = (화폐단위 / 5)
			//		(화폐단위) = (화폐단위 / 2)
			if( sw ) {
				money = money / 5;
				sw = false;
			} else {
				money = money / 2;
				sw = true;
			}
		}
		sc.close();
	}
}
