package Day10.Ex04_ExceptionThrows;

import java.util.Scanner;

public class ExceptionThrows {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		try {
			// input() 메소드에서 예외를 떠넘겨서,
			// 호출한 곳에서 예외처리 해야함
			input();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("정수를 입력해 주세요.");
		}
	}

	// 예외 던지기(예외 떠넘기기) - throws
	// : 예외 처리에 대한 책임을 메소드를 호출한 곳으로 떠넘기는 것
	public static void input() throws Exception {
		
		System.out.println("입력 : ");
		int input = sc.nextInt();

		System.out.println(input);
	}

}
