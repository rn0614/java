package ch07.sec04.pack1;

//�ʵ�� �޼ҵ��� ���� ����
//Ŭ���� ���ο����� �������Ѱ� ������� ��� �ʵ�� �޼ҵ� ��� ����

public class AAA {
	//�ʵ�
	public int field1;
	int field2;
	private int field3;
	protected int field4; // 
	
	//���� Ŭ���� ���ο��� ����(���� ��밡��, ���Ѿ���)
	public AAA() {
		field1=1;  //(o)
		field2=2;  //(o)
		field3=3;  //(o)
		field4=4;  //(o)
		
		
		method1(); //(o)
		method2(); //(o)
		method3(); //(o)
		method4(); //(o)
	}
	
	
	//�޼ҵ�
	public void method1() {}
	void method2() {}
	private void method3() {}
	protected void method4() {}

}
