package ch08.sec09;

public class MyClassB implements MyInterface {

	@Override
	public void method1() {
		System.out.println("MyClassB���� ������ -method(1)����");
	}
	//myInterface�� �޼ҵ� ������
	//�߻� �޼ҵ�� �ʼ��� ������ �ؾ���
	// ����Ʈ �޼ҵ�� ���������� �������� �� ����(���ص� ��������)
	
	//default �޼ҵ� ������
	@Override
	public void method2() {
		System.out.println("MyClassB���� ������ -method(2)����");
	}
	
}
