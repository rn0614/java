package ch12.sec03;

public class BeepPrintEX {

	public static void main(String[] args) {
		// ������ ���� ���2
		// Thread�� ��ӹ��� ���� Ŭ���� BeepThread Ŭ�����κ��� ����
		Thread thread = new BeepThread();
		thread.start();
		
		for(int i =0; i<5; i++){
			System.out.println("��");
			try{
				Thread.sleep(500);
			} catch(InterruptedException e) {}
		}
	}

}
