package ch08.sec09;

public interface MyInterface {
	public void method1();
	
	// ���ο� �޼ҵ� �߰� �ʿ�
	// �߻� �޼ҵ�� �߰��ϸ�
	// ������ �������̽��� ������ Ŭ��������
	// ���� �߰��� ��� �߻� �޼ҵ带 ������ �ؾ���(���ϸ� ����)
	//public void method2();
	
	//����Ʈ �޼ҵ� �߰�
	// default �޼ҵ� : �ٵ� ����. ���� ��� ������ ����
	public default void method2() {
		System.out.println("MyInterface-method2() ����");
	}

}
