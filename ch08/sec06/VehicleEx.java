package ch08.sec06;

public class VehicleEx {

	public static void main(String[] args) {
		//인터페이스 변수에 Bus 객체 대입
		//Vehicle 타입으로 자동 타입 변환 발생
		
		Vehicle vehicle = new Bus();
		
		//vehicle 타입으로 Vehicle 멤버만 사용가능
		vehicle.run();
		
		//Vehicle 타입으로 자동 변환되었기 때문에
		//vehicle.checkFare(); //Bus 멤버 사용해서 오류
		
		//Bus 멤버를 사용하려면 다시 타입 변환 - 강제 타입 변환
		Bus bus=(Bus)vehicle;
		
		bus.run();
		bus.checkFare();
		
		
		

	}

}
