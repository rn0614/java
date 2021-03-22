package ch06.sec05;

public class Singleton {
	// Ŭ���� �ڽ��� Ÿ������ ���� �ʵ� ����
	// �ܺο��� �������� ���ϵ��� private���� ����
	private static Singleton singleton = new Singleton();
	
	//������
	//�ܺο��� new �����ڸ� ����ؼ� �����ڸ� ȣ���� �� ������ ������.
	//private ����
	private Singleton() {};
	
	
	public static Singleton getInstance() {
		return singleton;
	}

}
