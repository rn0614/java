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
		System.out.println("차량 번호 : "+carNo);
	}
	void carName() {
		System.out.println("차종 : "+carName);
	}
	void carMaker() {
		System.out.println("제조사 : "+carMaker);
	}
	void carYear() {
		System.out.println("연식 : "+carYear);
	}
	
	
}
