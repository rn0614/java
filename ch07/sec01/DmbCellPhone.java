package ch07.sec01;

public class DmbCellPhone extends CellPhone {
	// 필드
	int channel;

	public DmbCellPhone(String model, String color,int channel) {
		this.model=model;
		this.color =color;
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("채널:"+channel+"번 시작");
	}
	
	void changeChannelDmb(int channel) {
		this.channel=channel;
		System.out.println("채널:"+channel+"바꾸기");
	}
	

}
