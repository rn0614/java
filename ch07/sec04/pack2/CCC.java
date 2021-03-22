package ch07.sec04.pack2;

import ch07.sec04.pack1.AAA;

public class CCC {
	public CCC() {
		//AAA 객체를 생성
		AAA a = new AAA();
		
		a.field1 =1;   //(o)
		//a.field2 =1; //(x)default 접근 불가
		//a.field3 =1; //(x)private 접근 불가
		//a.field4=1;  //(x)protected 접근 불가(상속x경우)
		
		//메소드 접근
		a.method1();   //(o)
		//a.method2(); //(x)default 접근 불가
		//a.method3(); //(x)private만 접근 불가
		//a.method4(); //(x)protected 접근 불가(상속x경우)
	}

}
