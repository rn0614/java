package ch08.sec09;

public class MyClassB implements MyInterface {

	@Override
	public void method1() {
		System.out.println("MyClassB에서 재정의 -method(1)실행");
	}
	//myInterface의 메소드 재정의
	//추상 메소드는 필수로 재정의 해야함
	// 디폴트 메소드는 선택적으로 재정의할 수 있음(안해도 오류없음)
	
	//default 메소드 재정의
	@Override
	public void method2() {
		System.out.println("MyClassB에서 재정의 -method(2)실행");
	}
	
}
