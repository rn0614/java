package ch06.sec02;

public class Calculator {
	//필드 없음
	
	//메소드
	
	//void :반환값 없음
	public void powerOn() {
		System.out.println("전원을 킵니다.");
	}
	
	//반환형 : int
	//매개변수 2개 전달받아서 메소드 내부에서 지역 변수로 사용
	public int plus(int x,int y) {
		int result =x+y;
		return result;
	}
	
	//반환형 double
	public double divide(int x, int y) {
		double result = (double)x/(double)y;
		return result;
	}
	
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}
