package Day11.Ex02_Class;

public class StringEx {
	
	public static void main(String[] args) {
		// [0][1][2][3][4][5][6][7][8][9][0][1][2][3][4][5][6][7]
		// [0][H][u][m][a][n][^][E][d][u][^][C][e][n][t][e][r][^]
		String str1 = " Human Edu Center ";
		String str2 = " human Edu Center ";

		System.out.println(str1.charAt(2));				// index 에 있는 문자 추출
		System.out.println(str1.concat(str2));			// 해당 문자열 뒤에 인자로 입력한 문자열을 연결
		System.out.println(str1.contains("Edu"));		// 문자열이 포함하고 있는 확인 (ture/false)
		System.out.println(str1.equals(str2));			// 문자열이 일치하는지 확인 (true/false)
		System.out.println(str1.equalsIgnoreCase(str2));// 대소문자 구분없이 문자열 일치여부 확인
		System.out.println(str1.indexOf("C"));			// 해당 문자의 첫 index를 반환, 없으면 -1
		System.out.println(str1.lastIndexOf("u"));		// 해당 문자의 마지막 index를 반환, 없으면 -1
		System.out.println(str1.trim());				// 문자열 양쪽의 공백을 제거
		System.out.println(str1.length());				// 문자열의 길이
		System.out.println(str1.substring(7));			// index 앞의 문자열을 자르고, 그 뒤의 문자열을 반환
		System.out.println(str1.substring(7, 17));		// index1 ~ (index2-1) 까지 반환
		System.out.println(str1.replace(" ", "#"));		// replace("기본문자","대체문자")
		System.out.println(str1.replaceAll(" ", "*"));		// replace 와 같음
		System.out.println(str1.toUpperCase());			// 모두 대문자로 변경 
		System.out.println(str1.toLowerCase());			// 모두 소문자로 변경 

		// split("(구분자)") : (구분자)를 기준으로 문자열을 잘라서 배열로 반환 
		String[] sp = str1.split("");
		for (int i = 0; i < sp.length; i++) {
			System.out.println(i + "\t : " + sp[i]);
		}
	}
}
