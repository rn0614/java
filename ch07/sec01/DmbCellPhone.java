package ch07.sec01;

public class DmbCellPhone extends CellPhone {
	// �ʵ�
	int channel;

	public DmbCellPhone(String model, String color,int channel) {
		this.model=model;
		this.color =color;
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("ä��:"+channel+"�� ����");
	}
	
	void changeChannelDmb(int channel) {
		this.channel=channel;
		System.out.println("ä��:"+channel+"�ٲٱ�");
	}
	

}
