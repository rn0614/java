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
				"\n�ñ�"+ unitPrice+" ��\n�ٹ��ð�"+hour+" �ð�";
	}

	void calculatePay() {
		System.out.println("�����Ҿ� : "+(unitPrice*hour)+" ��");
	}
	
	

}
