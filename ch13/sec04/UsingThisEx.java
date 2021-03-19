package ch13.sec04;

public class UsingThisEx {

	public static void main(String[] args) {
		//중첩 클래스 Inner 클래스 객체 생성
		//바깥 클래스 객체 생성 후 Inner 클래스 생성가능
		UsingThis usingThis =new UsingThis();
		
		UsingThis.Inner inner = usingThis.new Inner();
		// method() 호출
		inner.method();

	}

}
