package ch12.sec13;

// �Һ��� ������ : ������ �о (getData() �޼ҵ� ���)
public class ConsummerThread extends Thread {
	// ���� ��ü �ʵ�
	private DataBox dataBox;

	public ConsummerThread(DataBox dataBox) {
		this.dataBox = dataBox;
	}
	
	@Override
	public void run() {
		//�����͸� �о���� ��
		for(int i=1; i<=3;i++) {
			String data = dataBox.getData();
		}
	}
}
