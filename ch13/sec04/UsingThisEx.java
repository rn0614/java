package ch13.sec04;

public class UsingThisEx {

	public static void main(String[] args) {
		//��ø Ŭ���� Inner Ŭ���� ��ü ����
		//�ٱ� Ŭ���� ��ü ���� �� Inner Ŭ���� ��������
		UsingThis usingThis =new UsingThis();
		
		UsingThis.Inner inner = usingThis.new Inner();
		// method() ȣ��
		inner.method();

	}

}
