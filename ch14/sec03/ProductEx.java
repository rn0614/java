package ch14.sec03;

public class ProductEx {

	public static void main(String[] args) {
		// Product (TV):Kind:����Ʈ TV, 
		Product<Tv,String> tv1 = new Product<Tv,String>();
		tv1.setKind(new Tv());
		tv1.setModel("����Ʈ TV");
		
		System.out.println(tv1.getModel());

		
		// Product (Car) : Kind : ����
		Product<Car,String> car1 = new Product<Car,String>();
		car1.setKind(new Car());
		car1.setModel("����");
		
		System.out.println(car1.getModel());
	}

}
