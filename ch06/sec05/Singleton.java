package ch06.sec05;

public class Singleton {
	// 클래스 자신의 타입으로 정적 필드 선언
	// 외부에서 접근하지 못하도록 private으로 선언
	private static Singleton singleton = new Singleton();
	
	//생성자
	//외부에서 new 연산자를 사용해서 생성자를 호출할 수 없도록 막아줌.
	//private 설정
	private Singleton() {};
	
	
	public static Singleton getInstance() {
		return singleton;
	}

}
