package ch13.sec01;

public class MyFunctionalInterfaceEx {
	// �������̽� ���� ;
	public static void main(String[] args) {
		// �������̽� ���� = ���ٽ�
		// �Ű����� ����, ���ϰ��� ���� ���ٽ�
		// �Ű������� ������ ���ȣ() �ʼ�
		MyFunctionalInterface f1 = ()-> {
			String str ="method call1"; // ���� ������ 2��
			System.out.println(str);
		};
		
		// �޼ҵ� ȣ�� : ���ٽ��� �߰�ȣ { ... } ����
		f1.method();
		
		// ���� ������ 1���� ���
		// ���� ������ 1���� ��� �߰�ȣ{}; ���� ����
		f1=()->{System.out.println("method call2");};
		f1.method();
		
		
		
	}

}
