package ch12.sec06;

// 2���� �����尡 Calculator ��ü ������ �� ����� ����
// User1�� ���� 100 ����, 2�� ��� ���� �߿�
// User2�� ���� 50���� ����
// USer1�� ������ 100�� �ƴ� 50 ��µǴ� ����

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
