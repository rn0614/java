package ch07.sec01;

public class CellPhone {
	String model;
	String color;
	
	public void powerOn() {System.out.println("������ �մϴ�");}
	
	public void powerOff() {System.out.println("������ ���ϴ�.");}
	void bell() {System.out.println("���� �︳�ϴ�.");}
	void sendVoice(String message) {System.out.println("�ڱ�:"+message);}
	void receiveVoice(String message) {System.out.println("���:"+message);}
	void hangUp() {System.out.println("��ȭ�� �����ϴ�.");}

}
