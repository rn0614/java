package ch09.sec01;

//중첩 클래스
//분류(선언 위치에 따라) 
//1.멤버 클래스: 클래스 멤버로서 선언되는 클래스(멤버, 메소드 선언 위치에 생성) 
//	1)인스턴스 멤버 클래스:바깥 클래스 (A)를 생성해야만 사용가능 
//	2)static 멤버 클래스: 바깥 클래스 (A)로 바로 접근 가능(객체 필요x)

//2.로컬 클래스: 메소드 내부에 선언되는 클래스에서
//	-메소드가 실행될 때만 사용 가능

public class A {
	A(){ System.out.println("A 객체 생성");}
	
	//인스턴스 멤버 클래스
	public class B{
		B(){System.out.println("B 객체 생성");}
		//인스턴스 필드 선언
		int field1;
		//static int field2; //static 필드 선언 불가
		
		//인스턴스 메소드 선언
		void method1() {System.out.println("B클래스의 method1 실행");}
		//static void method2(){} //static 메소드 정의 불가
	}
	
	
	//static 멤버 클래스
	static class C{
		//생성자
		C(){System.out.println("C 객체 생성");}
		//필드 (전부 가능)
		int field1;
		static int field2;
		
		//메소드(전부 가능)
		void method1() {System.out.println("C클래스 method1실행");}
		static void method2(){System.out.println("C클래스 method1실행");}
		
	}
	
	//A클래스 멤버 메소드(static 사용 불가)
	void method() {
		//로컬 클래스 : 메소드 내에서 생성
		class D{
			D(){System.out.println("D객체 생성");}
			//필드
			int field1;
			//static int field2;//static 사용 불가
			
			//메소드
			void method1() {System.out.println("D클래스 method1실행");}
			//static void method2(){System.out.println("D클래스 method1실행");}
			
		}
	}
	
	
	
	
}
