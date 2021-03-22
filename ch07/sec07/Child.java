package ch07.sec07;

public class Child extends Parent {

	@Override
	public void method2() {
		System.out.println("Child-method()2 - 재정의");
	}
	
	public void method3() {
		System.out.println("Child-method()3 - 재정의");
	}
}
