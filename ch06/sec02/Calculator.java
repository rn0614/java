package ch06.sec02;

public class Calculator {
	//�ʵ� ����
	
	//�޼ҵ�
	
	//void :��ȯ�� ����
	public void powerOn() {
		System.out.println("������ ŵ�ϴ�.");
	}
	
	//��ȯ�� : int
	//�Ű����� 2�� ���޹޾Ƽ� �޼ҵ� ���ο��� ���� ������ ���
	public int plus(int x,int y) {
		int result =x+y;
		return result;
	}
	
	//��ȯ�� double
	public double divide(int x, int y) {
		double result = (double)x/(double)y;
		return result;
	}
	
	public void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
}
