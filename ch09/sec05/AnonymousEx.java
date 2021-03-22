package ch09.sec05;

public class AnonymousEx {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous(); //��ü ����
		
		// �͸� ��ü �ʵ� ���
		anony.field.wake();
		// wake �θ� Ÿ���� �����ǵ� �޼ҵ��
		// field �ʵ带 ����ؼ� �ܺο��� ȣ�� ����
		
		// �͸� ��ü ���� ���� ���
		anony.method1();
		
		// �Ű������� �͸� �ڽ� ��ü ���
		anony.method2(new Person() {
			void study() {
				System.out.println("�����մϴ�.");
			}

			@Override
			void wake() {
				System.out.println("8�ÿ� �Ͼ�ϴ�.");
				study();
			}
		});
	}
}
