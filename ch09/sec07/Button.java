package ch09.sec07;

	

// ��ư �̺�Ʈ ó������ �͸� ���� ��ü ���

public class Button {
	// �ʵ�
	OnClickListener listener;
	//setter �޼ҵ�� ���� ��ü �޾� �ʵ忡 ����
	void setOnClickListener(OnClickListener listener) {
		this.listener=listener;
	}
	
	//��ư �̺�Ʈ�� �߻����� �� ȣ��Ǵ� �޼ҵ�
	void touch(){
		listener.onClick();
	}
	
	
	//��ø �������̽�
	interface OnClickListener{
		void onClick();
	}

}
