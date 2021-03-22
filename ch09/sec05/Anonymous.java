package ch09.sec05;

public class Anonymous {
	// 부모 클래스 타입의 필드의 초기값으로 대입
	Person field = new Person(){ //익명 자식 객체 생성: 부모타입(Pernson)
		void work() { // 외부에서 호출되지 못하고, 재정의된 부모타입의 wake()에서 호출 가능
			System.out.println("익명 자식 객체서 출력된 work");
		}

		@Override
		void wake() {
			System.out.println("부모객체 wake 메소드 재정의");
			work();
		}
	};
	
	//로컬 변수 선언하고 익명 자식 객체로 초기화
	void method1() {
		//로컬 변수 값으로 대입
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다");
			}

			@Override
			void wake() {
				System.out.println("자식개체의 method1의 wake 재정의");
				walk();
			}
		};
		localVar.wake();
	}
	
	//매개변수를 이용해서 익병 자식 객체 대입
	//method2() 호출하는 쪽에서 매개 값으로 익명 자식 객체 전달
	void method2(Person person) {
		person.wake();
	}
}
