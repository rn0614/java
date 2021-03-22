package ch07.sec01;

public class DmbCellPhoneEx {
	public static void main(String[] args) {
		DmbCellPhone dcp= new DmbCellPhone("자바폰","검정",10);
		
		//CellPhone으로 상속 받은 필드
		System.out.println("모델:"+dcp.model);
		System.out.println("색상:"+dcp.color);
		
		//Dmbcellphone 필드
		System.out.println("채널 :"+dcp.channel);
		
		//CellPhone으로 부터 상속 받은 메소드 호출
		
		dcp.powerOn();
		dcp.bell();
		dcp.sendVoice("어서오세요");
		dcp.hangUp();
		
		dcp.turnOnDmb();
		dcp.changeChannelDmb(12);
		
		
	}

}
