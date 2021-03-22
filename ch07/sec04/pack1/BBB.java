package ch07.sec04.pack1;

//AAA와 동일 패키지
// 동일 패키지 내 에서는 
// private 필드와 메소드 제외 모든 필드 메소드 접근 가능

public class BBB {
	public BBB() {
		//AAA 객체를 생성
		AAA a = new AAA();
		
		a.field1 =1;   //(o)
		a.field2 =1;   //(o)
		//a.field3 =1; //(x)private만 접근 불가
		a.field4 =1;   //(o)
		
		//메소드 접근
		a.method1();   //(o)
		a.method2();   //(o)
		//a.method3(); //(x) private만 접근 불가
		a.method4();   //(o)
	}
	
				


}
