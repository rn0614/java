package ch12.sec07;

// ����ȭ �޼ҵ� : synchronized Ű���� ����
// �Ӱ� �������� �ѹ��� �� �����常 ���� ����
// �ٸ� ������� �޼ҵ� �Ǵ� ����� ���� ���� ������ ���

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	//����ȭ �޼ҵ�
	public synchronized void setMemory(int memory) {
		this.memory = memory;
	
		try {
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+
					" : "+ this.memory );
		}catch(InterruptedException e){}
		
	}
	
}
