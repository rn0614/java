package ch08.sec10;

// �θ� �������̽��� ����Ʈ �޼ҵ� �ڽ� �������̽� Ȱ���ϴ� ��


public interface ChildInterface2 extends ParentInterface {

	@Override
	default void method2() {
		System.out.println("ChildInterface2���� �����ǵ� method2() ����");
	}
	
	public void method3();
	
}
