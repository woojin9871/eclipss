package Day06.Ex03_Car;

public class Car {

	// 멤버변수 == 필드'
	String model;
	private int speed;
	// private		: 해당 클래스 내에서만 접근 가능
	
	// 생성자
	Car() {
		
	}

	Car(String madel) {
		this.model = madel;
	}

	Car(String model, int speed) {
		this.model = model;
		this.speed = speed;
	}

	// getter : 변수의 값을 가져오는 메소드   
	// setter : 변수의 값을 지정하는 메소드
	public String getMadel() {
		return model;
	}

	public void setMadel(String madel) {
		this.model = madel;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	





}
