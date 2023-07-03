package Day09.Ex07_AnonymousClass;

public class Anonymous {

	// 익명 자식 객체를 생성하는 방법
	// 부모클래스 객체명 = new 부모클래스() {
	//
	// };
	// *** 생성자를 생성할 수 없다.
	Person child = new Person() {

		void play() {
			System.out.println("놀이를 합니다.");
		}

		// alt + shift + s : V
		@Override
		void work() {
			System.out.println("공부를 합니다.");
		}
	};

	void meethodA() {

		// 익명 자식 객체 생성
		Person child2 = new Person() {
			void study() {
				System.out.println("공부를 합니다.");
			}

			@Override
			void work() {
				System.out.println("아르바이트를 합니다.");
				study();
			}

		};
		
		child2.work();
	}

	void methodB(Person person) {
		person.work();
	}
}
