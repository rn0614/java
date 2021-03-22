package ch07.sec03;

public class PartTimeWorker {

	public static void main(String[] args) {
		PartTime prt= new PartTime("950611-1234567","¿Ã∏ß",9000,60);
		
		System.out.println(prt);
		prt.calculatePay();

	}

}
