package ch06.sec02;

public class CaculatorEx {

	public static void main(String[] args) {
		Calculator myCal = new Calculator();
		
		myCal.powerOn();
		
		int result1=myCal.plus(5,6);
		System.out.println(result1);
		
		byte x=4;
		byte y=5;
		double result2=myCal.divide(x, y);
		System.out.println(result2);

		System.out.println("result2 :"+result2);
	}

}
