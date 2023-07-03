package Day05.Inheritance;

public class Pikachu { 
	// 클래스			: 객체를 정의하는 설계도
	// 멤버			: 변수, 메소드
	
	// 변수
	public int energy;
	public String type;
	
	// 생성자
	public Pikachu() {
		this(100, "thunder");
		//this.energy = 100;
		//this.type = "thunders";
		
	}
	// 생성자 자동 완성 단축키 : Alt + Shift + S -> O 
	// 매개변수가 있는 생성자
	// 메소드(생성자) ;오버로딩
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
		// 3. (값)을 메소드를 호출한 자리로 변환
		return "십만볼트";
	}
	
	public String bArrack() {
		return "전광석화";
	}
	@Override
	public String toString() {
		return "PiKachu [energy=" + energy + ", type=" + type + "]";
	}

	







}
