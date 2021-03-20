package ch14.sec03;

public class ProductEx {

	public static void main(String[] args) {
		// Product (TV):Kind:스마트 TV, 
		Product<Tv,String> tv1 = new Product<Tv,String>();
		tv1.setKind(new Tv());
		tv1.setModel("스마트 TV");
		
		System.out.println(tv1.getModel());

		
		// Product (Car) : Kind : 디젤
		Product<Car,String> car1 = new Product<Car,String>();
		car1.setKind(new Car());
		car1.setModel("디젤");
		
		System.out.println(car1.getModel());
	}

}
