package ch13.sec05;

import ch13.sec01.MyFunctionalInterface;

// ���ٽĿ��� �޼ҵ��� �Ű����� �Ǵ� ���� ������ final Ư���� �������ϳ�
// final ī���� �����ص� final Ư���� ���� (java8����)

public class UsingLocalVariable {
	// �Ű������� ���� �޼ҵ�
	void method(int arg) { // �Ű����� arg�� final Ư���� ����
		int localVar=40;  // localVar�� final Ư�� ����
		
		
		// ���ٽ�
		MyFunctionalInterface f1 = ()-> {
			
			// �Ű� ���� ���
			System.out.println("arg"+ arg);
			// ���� ���� ���
			System.out.println("localVar"+localVar);
			
		};
		f1.method();
		
	}
}
