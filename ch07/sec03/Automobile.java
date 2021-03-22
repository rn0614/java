package ch07.sec03;

public class Automobile extends Car {
	private String autoManual;

	public Automobile(String carNo, String carName, String carMaker, String carYear, String autoManual) {
		super(carNo, carName, carMaker, carYear);
		this.autoManual = autoManual;
	}
	
	@Override
	public String toString() {
		return "���� :"+autoManual;
	}

	
}
