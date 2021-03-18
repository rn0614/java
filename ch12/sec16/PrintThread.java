package ch12.sec16;

// ������ ���Ḧ ���� stop �÷��� �̿�
// stop �÷��׷� run() �޼ҵ� �������� ����
// run()�޼ҵ尡 ����Ǹ� ������ ����
// stop ���� true �Ǵ� false �������� Ȯ���ؼ� ����

public class PrintThread extends Thread {
	@Override
	public void run() {
	//���� �ݺ�
		// ���1
	/*
			while(true) {
				System.out.println("������");
				// �Ͻ����� ���� ���� ���
				// interrupt �� ���������� Ȯ���ϰ�
				// interrupted �Ǿ����� ����
				// Thread.interrupted(): interrupted()�� Thread�� ���� �޼ҵ�
				
				if(Thread.interrupted()) { //interrupted�Ǿ�����
					break; //while �� ����
				}
				
			}*/
		
		//���2
		//isInterrupted()�޼ҵ� ���
		//Thread Ŭ������ �ν���Ʈ �޼ҵ� isInterrupted() ���
		//PrintThread�� 
		while(true){
			System.out.println("������");
			
			if(isInterrupted()) { //interrupt �Ǿ�����
				break;
			}
		}
		
		
		System.out.println("�ڿ�����");
		System.out.println("��������");
	}
}
