package ch02.sec02;

public class DataType {

	public static void main(String[] args) {
		// ����Ÿ��
		// ''���̿� ����
		// '\u0041' �����ڵ�
		// 65 �ƽ�Ű �ڵ尪
		char a ='A';
		
		// ���� Ÿ�� ���� ���� �� �ʱ�ȭ
		System.out.println(a);
		int byteValue =10;    // 1����Ʈ
		int shortValue =1000;			// 2,4����Ʈ
		long longValue = 1000000000100010000L;	//8����Ʈ
		System.out.println(byteValue);
		System.out.println(shortValue);
		System.out.println(longValue);
		
		String val1 = "�����";
		System.out.println(val1);
	}

}
