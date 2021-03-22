package ch09.sec06;

public class AononymousEx {
	public static void main(String[] args) {
		Anonymous anony =new Anonymous();
		//1.�͸� ��ü�� ���Ե� �ʵ� ���
		anony.field.turnOn();
		
		//2.�͸� ��ü ���� ���� ���
		anony.method1();
		
		
		//3.�͸� ��ü �Ű��� ���
		anony.method2(new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("1");
				
			}

			@Override
			public void turnOff() {
				System.out.println("2");
			}
			
		});
		
	}
}
