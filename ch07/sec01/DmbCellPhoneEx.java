package ch07.sec01;

public class DmbCellPhoneEx {
	public static void main(String[] args) {
		DmbCellPhone dcp= new DmbCellPhone("�ڹ���","����",10);
		
		//CellPhone���� ��� ���� �ʵ�
		System.out.println("��:"+dcp.model);
		System.out.println("����:"+dcp.color);
		
		//Dmbcellphone �ʵ�
		System.out.println("ä�� :"+dcp.channel);
		
		//CellPhone���� ���� ��� ���� �޼ҵ� ȣ��
		
		dcp.powerOn();
		dcp.bell();
		dcp.sendVoice("�������");
		dcp.hangUp();
		
		dcp.turnOnDmb();
		dcp.changeChannelDmb(12);
		
		
	}

}
