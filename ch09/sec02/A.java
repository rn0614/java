package ch09.sec02;

public class A {
	//�ν���Ʈ �ʵ� �ʱ�ȭ
	B filed1 = new B(); //�ʵ��� �ʱⰪ���� ��ü ���� ����
	C field2 = new C(); //static Ŭ���� ��ü ���� �� �ʱⰪ���� ��밡��
	
	// �ν���Ʈ �޼ҵ�
	void method1() {
		B var1 =new B(); // �ν���Ʈ �޼ҵ� �� �ʱⰪ���� ��� ����
		C var2 = new C(); //�ν���Ʈ �޼ҵ� ������ static Ŭ���� ��ü ���� �� �ʱⰪ�� ��� ����
	}
	
	// static �ʵ� �ʱ�ȭ
	//static B field3 = new B(); // �ν���Ʈ ����� static ���Ұ�
	static C field4 = new C();
	
	// static �޼ҵ�
	static void method2() {
		//B var3= new B(); �ν���Ʈ �Ұ�
		C var4= new C();
		
	}
	
	class B {}

	static class C{}
	
}
