package ch04.sec03;

public class StringEquals {

	public static void main(String[] args) {
		String strVar1 ="ȫ�浿";
		String strVar2 ="ȫ�浿";
		
		//������ ��ü ��������
		if(strVar1 ==strVar2) {
			System.out.println("���� ������ ����");
		}else {
			System.out.println("������ �ٸ�");
		}
		
		//���ڿ��� �������� ��
		if(strVar1.equals(strVar2)) {
			System.out.println("���ڿ��� ����");
		}else {
			System.out.println("���ڿ��� �ٸ�");
		}
		
		
		
		
		
		String strVar3 =new String("ȫ�浿");
		String strVar4 ="ȫ�浿";
		
		//������ ��ü ��������
		if( strVar3 ==strVar4) {
			System.out.println("���� ������ ����");
		}else {
			System.out.println("������ �ٸ�");
		}
		
		//���ڿ��� �������� ��
		if(strVar3.equals(strVar4)) {
			System.out.println("���ڿ��� ����");
		}else {
			System.out.println("���ڿ��� �ٸ�");
		}

	}

}
