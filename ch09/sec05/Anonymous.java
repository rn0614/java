package ch09.sec05;

public class Anonymous {
	// �θ� Ŭ���� Ÿ���� �ʵ��� �ʱⰪ���� ����
	Person field = new Person(){ //�͸� �ڽ� ��ü ����: �θ�Ÿ��(Pernson)
		void work() { // �ܺο��� ȣ����� ���ϰ�, �����ǵ� �θ�Ÿ���� wake()���� ȣ�� ����
			System.out.println("�͸� �ڽ� ��ü�� ��µ� work");
		}

		@Override
		void wake() {
			System.out.println("�θ�ü wake �޼ҵ� ������");
			work();
		}
	};
	
	//���� ���� �����ϰ� �͸� �ڽ� ��ü�� �ʱ�ȭ
	void method1() {
		//���� ���� ������ ����
		Person localVar = new Person() {
			void walk() {
				System.out.println("��å�մϴ�");
			}

			@Override
			void wake() {
				System.out.println("�ڽİ�ü�� method1�� wake ������");
				walk();
			}
		};
		localVar.wake();
	}
	
	//�Ű������� �̿��ؼ� �ͺ� �ڽ� ��ü ����
	//method2() ȣ���ϴ� �ʿ��� �Ű� ������ �͸� �ڽ� ��ü ����
	void method2(Person person) {
		person.wake();
	}
}
