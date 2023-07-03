package Day09.Ex08_AnonymousClass;

public class Anonymous {

//	인터페이스 객체명 = new 인터페이스( ) {
//
//	};

	Remotecontrol tv = new Remotecontrol() {

		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다");
		}

		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다");
		}
	};

	void methodA() {
		Remotecontrol drone = new Remotecontrol() {

			@Override
			public void turnOn() {
				System.out.println("드론 전원을 켭니다");
			}

			@Override
			public void turnOff() {
				System.out.println("드론 전원을 끕니다");
			}
		};
		drone.turnOn();
	}

	void methodB(Remotecontrol rc) {
		rc.turnOn();
	}
}
