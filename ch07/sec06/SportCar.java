package ch07.sec06;

public class SportCar extends MyCar {

	@Override
	public void speedUP() {
		speed+=10;		
	}
	
	//final 메소드는 오버라이딩(재정의)을 할 수 없습니다.
	//@Override
	//public void stop() {
	//	히이이익 안됨
	//}
	

}
