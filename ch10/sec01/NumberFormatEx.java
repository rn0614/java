package ch10.sec01;

public class NumberFormatEx {

	public static void main(String[] args) {
		//���� 100: ��
		//���ڿ� 100 : �Ͽ���
		String data1="100";
		String data2 ="5100";
		
		//���ڿ��� ������ ��ȯ
		int value1 =Integer.parseInt(data1); //Integer.parseInt ���ڿ� > ���ڷ� �ٲٴ� �Լ�
		int value2 =Integer.parseInt(data2); // ���ڷ� ���ٲ㼭 ��������
		
		int result = value1 + value2;
		System.out.println("��� : " + result);

	}

}
