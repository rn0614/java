package ch08.sec10;

// 부모 인터페이스의 디폴트 메소들 자식 인터페이스 활용하는 법


public interface ChildInterface2 extends ParentInterface {

	@Override
	default void method2() {
		System.out.println("ChildInterface2에서 재정의된 method2() 실행");
	}
	
	public void method3();
	
}
