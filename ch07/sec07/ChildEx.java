package ch07.sec07;

public class ChildEx {

	public static void main(String[] args) {
		Child child = new Child();
		
		//�θ� Ŭ���� Ÿ�� ������ �ڽ� Ŭ���� ��ü ����
		Parent parent =child;
		
		//Parent �޼ҵ� ��밡��
		parent.method1();
		
		//Child ��ü�� ���������� child ����� ���Ұ�
		//parent.method3(); // ȣ�� �Ұ���
		
		parent.method2();// �����ǵ� method 2��밡��
		// �׷��� �θ� ����� ȣ������ �ʰ� �����ǵ� ��� �޼ҵ带 ȣ����.
		
		
		

	}

}
