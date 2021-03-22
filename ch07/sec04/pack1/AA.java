package ch07.sec04.pack1;

// 생성자의 접근 제한
// 생성자 오버로딩 : 이름 다르게 여러 개 생성(매개변수 다름)

public class AA {
	
	AA a1 = new AA(true);  //public 접근 가능
	AA a2 = new AA(1); // 접근가능
	AA a3 = new AA("문자열"); //접근가능 동일 클래스면 다됨.
	
	public AA(boolean b) {} //public
	AA(int b){}//default
	private AA(String s) {}

}
