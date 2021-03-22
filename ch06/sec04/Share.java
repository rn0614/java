package ch06.sec04;

public class Share {
	int a;// 인스턴트 필드
	static int staticA;// 스태틱 필드
	
	
	//인스턴스 메소드
	public void set(int n) {
		a+=n;
		staticA+=n;
	}
	
	//인스턴트 메소드
	public int showA() {
		return a;
	}
	
	public static int showStaticA() {
		return staticA;
	}
	

}
