package Day02;

import java.util.Scanner;

public class Ex11_elseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
	Scanner sc = new Scanner(System.in);
		
		System.out.println("점수: ");
		
		int score = sc.nextInt();
		String result = "";
		
		if (score >= 90) 
			result = "A";
		else if (score >= 80) 
			result = "B";
		else if (score >= 70) 
			result = "C";
		else if (score >= 60) 
			result = "D";
		else if (score <= 60) 
			result = "F";
		System.out.println("학점: "+ result);
		
		sc.close();
	}

}
