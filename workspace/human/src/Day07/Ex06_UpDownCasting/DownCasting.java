package Day07.Ex06_UpDownCasting;

public class DownCasting {

	public static void main(String[] args) {
		Person person = new Student("김휴먼", 20, 1, "뮤지컬학과");

		System.out.println(person);
		System.out.println(person.work());

		// 다운캐스팅 (강제 형 변환)
		// : 전제 조건 - 업캐스팅
		// 다운캐스팅은 업캐스팅 된 부모객채를 자식객체로 변환
		Student student = (Student) person;

		System.out.println(student.grade);
		System.out.println(student.major);
		
	}
}
