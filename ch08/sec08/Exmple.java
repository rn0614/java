package ch08.sec08;

public class Exmple {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		// InterfaceA Ÿ���̹Ƿ� InterfaceA ����� ��밡��
		ia.methodA(); //InterfaceA ��� methodA()�� ȣ�Ⱑ��
		
		InterfaceB ib =impl;
		ib.methodB();
		
		InterfaceC ic =impl;
		
		ic.methodA(); //�´� ����
		ic.methodB();
		ic.methodC();
		
		
		
		
	}

}
