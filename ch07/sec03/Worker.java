package ch07.sec03;

public class Worker {
	private String joominNo,name;

	public Worker(String joominNo, String name) {
		this.joominNo = joominNo;
		this.name = name;
	}

	@Override
	public String toString() {
		return "�ֹι�ȣ : " + joominNo + "\n����" + name;
	}
	
}
