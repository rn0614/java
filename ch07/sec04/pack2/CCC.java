package ch07.sec04.pack2;

import ch07.sec04.pack1.AAA;

public class CCC {
	public CCC() {
		//AAA ��ü�� ����
		AAA a = new AAA();
		
		a.field1 =1;   //(o)
		//a.field2 =1; //(x)default ���� �Ұ�
		//a.field3 =1; //(x)private ���� �Ұ�
		//a.field4=1;  //(x)protected ���� �Ұ�(���x���)
		
		//�޼ҵ� ����
		a.method1();   //(o)
		//a.method2(); //(x)default ���� �Ұ�
		//a.method3(); //(x)private�� ���� �Ұ�
		//a.method4(); //(x)protected ���� �Ұ�(���x���)
	}

}
