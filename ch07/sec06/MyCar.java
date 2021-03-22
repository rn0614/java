package ch07.sec06;

public class MyCar {
	public int speed;
	
	public void speedUP() {
		speed +=1;
	}
	
	//final 메소드 : 재정의(오버라이딩) 안됨
	public final void stop() {
		System.out.println("자동멈춤");
		speed=0;
	}
}
