package ch07.sec04.pack1;

//AAA�� ���� ��Ű��
// ���� ��Ű�� �� ������ 
// private �ʵ�� �޼ҵ� ���� ��� �ʵ� �޼ҵ� ���� ����

public class BBB {
	public BBB() {
		//AAA ��ü�� ����
		AAA a = new AAA();
		
		a.field1 =1;   //(o)
		a.field2 =1;   //(o)
		//a.field3 =1; //(x)private�� ���� �Ұ�
		a.field4 =1;   //(o)
		
		//�޼ҵ� ����
		a.method1();   //(o)
		a.method2();   //(o)
		//a.method3(); //(x) private�� ���� �Ұ�
		a.method4();   //(o)
	}
	
				


}
