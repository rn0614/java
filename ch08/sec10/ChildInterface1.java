package ch08.sec10;

//부모 인터페이스의 디폴트 메소드를 자식 인터페이스에서 활용하는 법
//디폴트 메소드가 있는 인터페이스 상속


public interface ChildInterface1 extends ParentInterface {
	public void method3(); // 추상 메소드
	
	//디폴트 메소드
	//public default void method4() {
	//	System.out.println("child의 디폴트 메소드 호출");
	//} // 디폴트 메소드
	
	
	
}
