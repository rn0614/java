package ch12.sec13;

public class WaitNotifyEx {

	public static void main(String[] args) {
		//���� ��ü ����
		DataBox dataBox = new DataBox();
		
		//������ ������ ����
		ProducerThread producerThread = new ProducerThread(dataBox);
		//�Һ��� ������ ����
		ConsummerThread consummerThread=new ConsummerThread(dataBox);
		
		producerThread.start();
		consummerThread.start();
	}
}
