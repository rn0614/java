package ch07;

public abstract class Phone {
	// �ʵ� ����
	public String Owner;

	public Phone(String owner) {
		this.Owner = owner;
	}
	
	public void turnOn() {
		System.out.println("�� ������ �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�� ������ ���ϴ�.");
	}

}
