package ch13.sec04;

// 람다식 실행 블록에서 클래스 멤버(필드, 메소드)와 로컬 변수 사용

public class UsingThis {
	public int outerField =10;
	public int field =100;
	
	
	class Inner{
		int InnerField =20;
		int field =200;
		
		void method() {
			//람다식
			MyFunctionalInterface fi =()->{
				//필드명이 다를 경우
				System.out.println("outterField :" +outerField );
				System.out.println("InnerField :" +InnerField );
				
				//필드명이 동일한 경우
				System.out.println("outter :"+field);
				System.out.println("inner :"+field);
				
				//바깥 클래스 filed 값
				System.out.println("outter: "+ UsingThis.this.field);
				
				//내부 클래스 field 값
				System.out.println("outer"+this.field);
			};
			
			fi.method();
		}
	}
}
