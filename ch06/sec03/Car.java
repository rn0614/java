package ch06.sec03;

public class Car {
	String model;
	int speed;
	
	public Car(String model) {
		this.model = model;
	}
	public void setSpeed(int speed) {
		this.speed=speed;
	}
	
	public void run() {
		for(int i=10; i<=50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model+
					"�� �޸���.(�ü�:" +this.speed+"km/h");
		}
	}
	public void run2() {
		for(int i=10; i<=50; i+=10) {
			setSpeed(i);
			System.out.println(this.model+
					"�� �޸���.(�ü�:" +this.speed+"km/h");
		}
	}

}
