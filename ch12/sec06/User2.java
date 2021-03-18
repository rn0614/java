package ch12.sec06;

// 2개의 스레드가 Calculator 객체 공유할 때 생기는 문제
// User1이 값을 100 설정, 2초 대기 상태 중에
// User2가 값을 50으로 변경
// USer1이 설정한 100이 아닌 50 출력되는 문제

public class User2 extends Thread {
	private Calculator calculator;


	public void setCalculator(Calculator calculator) {
		this.setName("User2");
		this.calculator=calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory(50);
	}
	
	
}
