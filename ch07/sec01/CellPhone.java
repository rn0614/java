package ch07.sec01;

public class CellPhone {
	String model;
	String color;
	
	public void powerOn() {System.out.println("전원을 켭니다");}
	
	public void powerOff() {System.out.println("전원을 끕니다.");}
	void bell() {System.out.println("벨이 울립니다.");}
	void sendVoice(String message) {System.out.println("자기:"+message);}
	void receiveVoice(String message) {System.out.println("상대:"+message);}
	void hangUp() {System.out.println("통화를 끊습니다.");}

}
