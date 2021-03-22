package ch08.sec10;

//디폴트 메소드가 있는 인터페이스 상속
// 부모 인터페이스의 디폴트 메소드 자식 인터페이스에서 활용하는 법
// (1)

public interface ParentInterface {
	public void method1();
	
	public default void method2() {
		System.out.println("ParentInterface의 디폴트 메소드 method2() 실행");
	}
	
}
