package ch08.sec01;

public class RemoteControlEX {

	public static void main(String[] args) {
		//�������̽� ���� ����
		RemoteControl rc = null;
		
		rc= new Television(); // Telecision ��ü�� �ν��Ͻ� Ÿ�Կ� ����
		rc.turnOn(); //�߻�޼ҵ�
		rc.setVolume(10); //�߻�
		rc.setMute(true); //����Ʈ
		
		rc=new Audio(); // Audio ��ü�� �ν��Ͻ� Ÿ�Կ� ����
		rc.turnOn(); //�߻�޼ҵ�
		rc.setVolume(10); //�߻�
		rc.setMute(true); //����Ʈ
		
		// static �޼ҵ� ���
		
		RemoteControl.changeBattery();
	}

}
