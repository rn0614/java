package ch07.sec07;

public class ChildEx {

	public static void main(String[] args) {
		Child child = new Child();
		
		//부모 클래스 타입 변수에 자식 클래스 객체 대입
		Parent parent =child;
		
		//Parent 메소드 사용가능
		parent.method1();
		
		//Child 객체를 참조하지만 child 멤버는 사용불가
		//parent.method3(); // 호출 불가능
		
		parent.method2();// 재정의된 method 2사용가능
		// 그러면 부모 멤버를 호출하지 않고 재정의된 멤버 메소드를 호출함.
		
		
		

	}

}
