package Day04;

public class Ex05_String {

	public static void main(String[] args) {
		String a = "Hello";
		//String b = "Java";
		String c = "Hello";
		String d = new String("Hello");
		String e = new String("Java");
		String f = new String("Java");
		System.out.println(a == c);
		System.out.println(a == d);
		System.out.println(a.equals(d));

		System.out.println(e == f);
		System.out.println(e.equals(f));

		// == :해당 변수의 래퍼런스(참조정보)를 비교
		// eq
	}
}