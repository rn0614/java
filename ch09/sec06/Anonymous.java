package ch09.sec06;

public class Anonymous {
	//1.Ŭ������ �ʵ� �ʱⰪ���� �͸� ���� ��ü�� �����ؼ� ����
	//�ʵ�
	RemoteControl field = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("turnOn()");
		}

		@Override
		public void turnOff() {
			System.out.println("turnOff()");
		}
		
	}; // �������̽����� �����°� �ڿ� �����ݷ�?
	
	//2.�޼ҵ� ������ ���� ������ ������ ��
	//�ʱⰪ���� �͸� ���� ��ü�� �����ؼ� ����
	void method1() {
		RemoteControl localVar = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("method1 ���� turnOn()");
				
			}

			@Override
			public void turnOff() {
				System.out.println("method1 ���� turnOff()");
				
			}
			
		};
		localVar.turnOn(); //turnOn ����
	}
	
	//3. �޼ҵ��� �Ű������� �͸� ���� ��ü ����
	// �޼ҵ��� �Ű԰����� �޼ҵ� ȣ�� �ڵ忡�� �͸� ���� ��ü�� �����ؼ� ����
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
	
}
