package ch09.sec04;

// ��ø �������̽�: Ŭ������ ����� ����� �������̽�
//


public class Button {
	
	// �ʵ�
	// �������̽� Ÿ������ �ʵ� ����
	OnClickListener listener;
	
	// �޼ҵ�
	// Setter�޼ҵ�� ������ü�� �Ű������� ���� �޾Ƽ� �ʵ忡 ����
	void setOnClickListner(OnClickListener listener) { // �Ű����� ������: �Ű������� �������̽��� �پ��� ���� ��ü ���� �� ���� 
		this.listener =listener;
	}
	
	// �޼ҵ� : ��ư Ŭ������ �� (�̺�Ʈ �߻� �� )ȣ��Ǵ� �޼ҵ�
	void touch() {
		listener.onClick();
	}
	
	// ��ø �������̽� : Button Ŭ���� ���ο� ����
	// �ٱ� Ŭ������ ��������
	// Ŭ���� �ܺο����� ������� �ʰ� Button������ ���
	// ��ø �������̽� ����
	interface OnClickListener{
		void onClick(); //�߻� �޼ҵ�
	}
	
	
}
