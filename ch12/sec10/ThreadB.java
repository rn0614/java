package ch12.sec10;

//yield() : �ٸ� �����忡�� ���� �纸
//yield()�� ȣ��Ǹ� ���� ������� ��� ���·� ����ǰ�
//�켱������ ���ų� ������ �����尡 ����

public class ThreadB extends Thread {
	
	// ���� ���¿� �۾����� ���¸� �ϱ� ���� �ʵ� �ʱ�ȭ
	public boolean stop =false;
	public boolean work =true;
	
	@Override
	public void run() {
		while(!stop) {//������ true�� ��� ����
			if(work) {//�۾��� true�� 
				System.out.println("TreadB �۾� ����");
			}else {
				Thread.yield(); 
				//ThreadB�� ��� ���·� ����
				//ThreadB�� �켱������
				//�����ϰų� ���� ������ ����
			}
		}
		System.out.println("ThreadB ����");
	}
}
