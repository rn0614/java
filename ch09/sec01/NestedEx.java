package ch09.sec01;

public class NestedEx {

	public static void main(String[] args) {
		//인스터스 멤버 클래스를 사용하기 위해서는 A객체 생성
		A a = new A();
		
		//인스턴스 멤버 클래스 B 객체 생성
		A.B b = a.new B();
		b.field1= 3;
		b.method1();
	
	
	//static 멤버 클래스 객체 생성
	// 인스턴스 멤버 접근 : 객체 필요
	
	
		A.C c =new A.C();
		c.field1=3;
		
		c.method1();
		
		A.C.field2=2;
		A.C.method2();
		
		a.method();
	
	
    }
}
