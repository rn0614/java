package ch09.sec02;

public class A {
	//인스턴트 필드 초기화
	B filed1 = new B(); //필드의 초기값으로 객체 생성 가능
	C field2 = new C(); //static 클래스 객체 생성 및 초기값으로 사용가능
	
	// 인스턴트 메소드
	void method1() {
		B var1 =new B(); // 인스턴트 메소드 내 초기값으로 사용 가능
		C var2 = new C(); //인스턴트 메소드 내에서 static 클래스 객체 생성 및 초기값을 사용 가능
	}
	
	// static 필드 초기화
	//static B field3 = new B(); // 인스터트 멤버는 static 사용불가
	static C field4 = new C();
	
	// static 메소드
	static void method2() {
		//B var3= new B(); 인스턴트 불가
		C var4= new C();
		
	}
	
	class B {}

	static class C{}
	
}
