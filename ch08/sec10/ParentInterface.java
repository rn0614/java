package ch08.sec10;

//����Ʈ �޼ҵ尡 �ִ� �������̽� ���
// �θ� �������̽��� ����Ʈ �޼ҵ� �ڽ� �������̽����� Ȱ���ϴ� ��
// (1)

public interface ParentInterface {
	public void method1();
	
	public default void method2() {
		System.out.println("ParentInterface�� ����Ʈ �޼ҵ� method2() ����");
	}
	
}
