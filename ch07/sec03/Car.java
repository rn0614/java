package ch07.sec03;

public class Car {
	private String carNo;
	private String carName, carMaker,carYear;
	
	public Car(String carNo, String carName, String carMaker, String carYear) {
		this.carNo = carNo;
		this.carName = carName;
		this.carMaker = carMaker;
		this.carYear = carYear;
	}
	
	void carNo() {
		System.out.println("���� ��ȣ : "+carNo);
	}
	void carName() {
		System.out.println("���� : "+carName);
	}
	void carMaker() {
		System.out.println("������ : "+carMaker);
	}
	void carYear() {
		System.out.println("���� : "+carYear);
	}
	
	
}
