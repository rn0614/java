package ch08.sec05;

public class DriverEx {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.driver(bus); //�ڵ� Ÿ�� ��ȯ
		driver.driver(taxi); // �ڵ�Ÿ�Ժ�ȯ Vehicle vehicle = taxi;
		

	}

}
