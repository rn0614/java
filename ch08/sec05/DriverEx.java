package ch08.sec05;

public class DriverEx {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.driver(bus); //자동 타입 변환
		driver.driver(taxi); // 자동타입변환 Vehicle vehicle = taxi;
		

	}

}
