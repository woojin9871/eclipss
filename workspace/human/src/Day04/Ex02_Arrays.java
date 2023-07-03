package Day04;

public class Ex02_Arrays {

	public static void main(String[] args) {
		int arr[][] = new int[3][3];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;

		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		
		arr[2][0] = 7;
		arr[2][1] = 8;
		arr[2][2] = 9;
		
		// ArrayIndexOutOfBound
		// : 범위가 넘어선 매열 인덱스에 잡근할 때, 발생하는 예외
		// arr[2][0] = 10;

		// arr.length :첫번쨰 차원의 배열요소의 개수
		// arr[i].length :두번쨰 차원의 배열요소의 개수
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
