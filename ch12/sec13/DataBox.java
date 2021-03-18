package ch12.sec13;

// ������ 2�� (������ ������, �Һ��� ������)
// ������ ������ : ������ ����(����) setData() �޼ҵ� ���
// �ҹ��� ������ : ������ �Һ� (�б�) getData() �޼ҵ� ���


// ���� ����� �۾�(����/ �б� �۾� �����)
// ������ �����尡 �����͸� �����ϸ� notify() �˸� (�о� �����) �ڽ��� �Ͻ�����
// �Һ��� ������� �����͸� �о�� notify() �˸� (�� ������ �����϶��) �ڽ��� �Ͻ� ����


// ���� ������ Ŭ����
public class DataBox {
	private String data;
	
	// �Һ��� �����尡 ���
	public synchronized String getData() {
		//data�� null�̸� (���� �����Ͱ� ������)
		// �Һ��� ������� �Ͻ����� ���·� ����
		if(this.data == null) {
			try {
				wait();
			} catch (InterruptedException e) {}	
		}
		
		//������ �б�
		String returnValue =data;
		System.out.println("�Һ��ڰ� ���� ������ : "+ returnValue);
		//data�� null�� ����
		data=null;
		//notify()�˸�
		notify();
		// ������ �����带 wait ���¿��� ���� ��� ���·� ����
		// ������ �����尡 �ٽ� �����͸� ������ �� �ֵ��� �ϱ� ���ؼ�
		// �� �о����ϱ� ���� �ٽ� �����϶�� �ϴ� ����.
		
		//���� ������ ����
		return returnValue;
	}

	
	// ������ ������ ���
	public synchronized void setData(String data) {
		//data �ʵ尡 null�� �ƴϸ� (�Һ��ڰ� ���� �� �о���)
		//������ �����带 �Ͻ� ���� ���·� ����
		if(this.data != null) {
			try {
				wait();
			} catch (InterruptedException e) {}	
		}
		
		this.data = data; // �����͸� ���� ����
		System.out.println("������ �����尡 ������ ������ : "+ data);
		
		// �Һ��� �����带 wait���¿��� ���� ��� ���·� ����
		// (������ ���� ���� �����ϱ� �о��� �˸�)
		notify();
	}
}
