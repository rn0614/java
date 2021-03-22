package ch08.sec01;

public class RemoteControlEX {

	public static void main(String[] args) {
		//인터페이스 변수 선언
		RemoteControl rc = null;
		
		rc= new Television(); // Telecision 객체를 인스턴스 타입에 대입
		rc.turnOn(); //추상메소드
		rc.setVolume(10); //추상
		rc.setMute(true); //디폴트
		
		rc=new Audio(); // Audio 객체를 인스턴스 타입에 대입
		rc.turnOn(); //추상메소드
		rc.setVolume(10); //추상
		rc.setMute(true); //디폴트
		
		// static 메소드 사용
		
		RemoteControl.changeBattery();
	}

}
