package ch13.sec02;

import ch13.sec02.MyFunctionalInterface;

// �Ű������� 1���� ���ٽ�
// �Ű������� 2 ����
// ����� x*5�� ��� ����ϴ� ���ٽ� �ۼ�
// 10 ���

public class MyFunctionalInterfaceEx {

	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		// �Ű������� 1���� ���ٽ�
		fi= (x)-> {
			int result =x*5;
			System.out.println(result);
		};
		
		fi.method(2);
		
		//���� ������ 1���� ��� �߰�ȣ{}; ���� ����
		//�Ű������� 1���� ��� ��ȣ() ���� ����
		fi=x-> System.out.println(x*5);
		fi.method(2);
		
		//���๮�� �������� ��� return������ ���๮���� �ϳ� ����
	}

}
