package ch09.sec01;

public class NestedEx {

	public static void main(String[] args) {
		//�ν��ͽ� ��� Ŭ������ ����ϱ� ���ؼ��� A��ü ����
		A a = new A();
		
		//�ν��Ͻ� ��� Ŭ���� B ��ü ����
		A.B b = a.new B();
		b.field1= 3;
		b.method1();
	
	
	//static ��� Ŭ���� ��ü ����
	// �ν��Ͻ� ��� ���� : ��ü �ʿ�
	
	
		A.C c =new A.C();
		c.field1=3;
		
		c.method1();
		
		A.C.field2=2;
		A.C.method2();
		
		a.method();
	
	
    }
}
