package ch12.sec05;

public class CalcThread extends Thread {
	// �����ڿ��Լ� �Ű������� ������ �̸� ����
	public CalcThread(String name) {
		setName(name);
	}
	
	@Override
	public void run() {
		for(int i =0; i<2000000000; i++) {}
		System.out.println(getName());
	}
}
