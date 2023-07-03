package Day05.inheritance;

public class Pika {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* 클래스
 * 멤버
 * 
 * 변수 
 
		
		public int energy;
		public String type;
		
		//메소드
		
		public String aAttack();
		
		return "십만볼트";
		
		public String bAttack();
		return "전관석화";
		
		
	*/	
		
		// 클래스 		: 객체를 정의하는 설계도
		// 멤버			: 변수, 메소드
		
		// 변수
		public int energy;
		public String type;
		
		// 생성자
		public Pikachu() {
			energy = 100;
			type = "thunder";
			System.out.println("피카츄 객체 생성...");
		}
		
		public Pikachu(int energy, String type) {
			this.energy = energy;
			this.type = type;
		}

		// 메소드
		// 접근지정자 반환타입 메소드명( 매개변수 ) { };
		public String aAttack() {
			// return (값);
			// 1. 메소드를 종료
			// 2. 메모리 공간을 해제
			// 3. (값)을 메소드를 호출한 자리로 반환
			return "십만볼트";
		}
		
		public String bAttack() {
			return "전광석화";
		
		
		
		
		
		
	}

}
