package ch08.sec03;

public class Car {
	//�������̽� ��ü�� ���� ��ü ����
	//�������̽� Ÿ������ �ڵ� Ÿ�� ��ȯ �߻�
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	public void run() {
		//�������̽��� ����� roll()�޼ҵ� ȣ��
		//HankookTire�� �����ǵ� roll() �޼ҵ� ȣ��
		// ���� ��ü���� ����
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
	
	
	
	
}
