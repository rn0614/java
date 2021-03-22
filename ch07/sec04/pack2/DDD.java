package ch07.sec04.pack2;

import ch07.sec04.pack1.AAA;

public class DDD extends AAA {
	public DDD() {
		
		field1 =1;   //(o)
		//field2 =1; //(x)default 접근 불가
		//field3 =1; //(x)private 접근 불가
		field4=1;    //(o)
		
		//메소드 접근
		method1();   //(o)
		//method2(); //(x)default 접근 불가
		//method3(); //(x)private만 접근 불가
		method4();   //(o)
	}
	

}
