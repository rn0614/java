package ch07.sec04.pack1;

//필드와 메소드의 접근 제한
//클래스 내부에서는 접근제한과 관계없이 모든 필드와 메소드 사용 가능

public class AAA {
	//필드
	public int field1;
	int field2;
	private int field3;
	protected int field4; // 
	
	//같은 클래스 내부에서 접근(전부 사용가능, 제한없음)
	public AAA() {
		field1=1;  //(o)
		field2=2;  //(o)
		field3=3;  //(o)
		field4=4;  //(o)
		
		
		method1(); //(o)
		method2(); //(o)
		method3(); //(o)
		method4(); //(o)
	}
	
	
	//메소드
	public void method1() {}
	void method2() {}
	private void method3() {}
	protected void method4() {}

}
