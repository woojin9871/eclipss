package Day06.Ex01_Student;

public class StudentEx {

	public static void main(String[] args) {
		// Student 객체 생성
		Student student = new Student();
		student.name = "김휴먼";
		student.age = 20;
		student.stdNo = "20225055";
		student.major = "컴퓨터공학자";
		
		// Student2 객체 생성
		Student student2 = new Student("이명정", 20, "20201234", "경제학과");
		
		int[] scores = {10, 20, 30, 40, 50};
		int[] scores2 = {100, 100, 100, 90, 95};
		
		System.out.println("##### 학생1 #####");
		System.out.println("학생 1 - 이름 : " + student.name);
		System.out.println("학생 1 - 나이 : " + student.age);
		System.out.println("학생 1 - 학번 : " + student.stdNo);
		System.out.println("학생 1 - 전공 : " + student.major);
		System.out.println("학생 1 - 중간고사 점수 : " + student.getScore(100, 90));
		System.out.println("학생 1 - 기말고사 점수 : " + student.getScore(100, 90, 80));
		System.out.println("학생 1 - 최종 점수 : " + student.getScore(scores));
		student.study("JAVA");
		
		System.out.println("##### 학생2 #####");
		System.out.println("학생 2 - 이름 : " + student2.name);
		System.out.println("학생 2 - 나이 : " + student2.age);
		System.out.println("학생 2 - 학번 : " + student2.stdNo);
		System.out.println("학생 2 - 전공 : " + student2.major);
		System.out.println("학생 2 - 중간고사 점수 : " + student2.getScore(100, 77));
		System.out.println("학생 2 - 기말고사 점수 : " + student2.getScore(100, 55, 80));
		System.out.println("학생 2 - 최종 점수 : " + student2.getScore(scores2));
		student2.study("데이터베이스");
	}
}


