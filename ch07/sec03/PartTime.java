package ch07.sec03;

public class PartTime extends Worker {
	private int hour,unitPrice;

	public PartTime(String joominNo, String name, int hour, int unitPrice) {
		super(joominNo, name);
		this.hour = hour;
		this.unitPrice = unitPrice;
	}

	@Override
	public String toString() {
		return super.toString()+
				"\n시급"+ unitPrice+" 원\n근무시간"+hour+" 시간";
	}

	void calculatePay() {
		System.out.println("총지불액 : "+(unitPrice*hour)+" 원");
	}
	
	

}
