package ch07.sec06;

public class MyCar {
	public int speed;
	
	public void speedUP() {
		speed +=1;
	}
	
	//final �޼ҵ� : ������(�������̵�) �ȵ�
	public final void stop() {
		System.out.println("�ڵ�����");
		speed=0;
	}
}
