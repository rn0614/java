package ch12.sec10;

//yield() : �ٸ� �����忡�� ���� �纸
//yield()�� ȣ��Ǹ� ���� ������� ��� ���·� ����ǰ�
//�켱������ ���ų� ������ �����尡 ����

public class ThreadA extends Thread {
	
	// ���� ���¿� �۾����� ���¸� �ϱ� ���� �ʵ� �ʱ�ȭ
	public boolean stop =false;
	public boolean work =true;
	
	@Override
	public void run() {
		while(!stop) {//������ true�� ��� ����
			if(work) {//�۾��� true�� 
				System.out.println("TreadA �۾� ����");
			}else {
				Thread.yield(); 
				//ThreadA�� ��� ���·� ����
				//ThreadA�� �켱������
				//�����ϰų� ���� ������ ����
			}
		}
		System.out.println("ThreadA ����");
	}
}
