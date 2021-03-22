package ch07.sec01;

//Child classs: parent부터 상속받음
// 키워드 extend 사용
public class Child extends Parent{
	//Child 클래스이 필들
	private int c;
	
	public void setChild() {
		c=20;
	}
	public void showChild() {
		// parent 클래스 사용 가능
		showParent();
		System.out.println("자식 클래스의 c:"+c);
	}
}
