package ch07.sec04.pack2;

import ch07.sec04.pack1.AAA;

public class DDD extends AAA {
	public DDD() {
		
		field1 =1;   //(o)
		//field2 =1; //(x)default ���� �Ұ�
		//field3 =1; //(x)private ���� �Ұ�
		field4=1;    //(o)
		
		//�޼ҵ� ����
		method1();   //(o)
		//method2(); //(x)default ���� �Ұ�
		//method3(); //(x)private�� ���� �Ұ�
		method4();   //(o)
	}
	

}
