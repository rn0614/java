package ch09.sec04;

public class ButtonEx {

	public static void main(String[] args) {
		//��ȭ�� �̴ϴ�.
		//�޼����� �����ϴ�.
		
		//Button ��ü ����
		Button btn = new Button();
		
		//Button�� Setter ȣ���ؼ� ����
		CallListener call =new CallListener();
		btn.setOnClickListner(call);
		//��ư Ŭ������ �� ȣ��Ǵ� �޼ҵ� ȣ�� - ��ư Ŭ�� �̺�Ʈ ó��
		btn.touch();
		
		//Button�� Setter ȣ���ؼ� ����
		
		btn.setOnClickListner(new MessageListener());
		//��ư Ŭ������ �� ȣ��Ǵ� �޼ҵ� ȣ�� - ��ư Ŭ�� �̺�Ʈ ó��
		btn.touch();
		
		
		
		// �͸� ���� ��ü ���(���� Ŭ���� �������� �ʰ�)
		// ���� Ŭ������ ������ �ʰ�
		// ���� �͸� ������ü�� �����ؼ� �̺�Ʈ ó���ϴ� ��찡 �� ����
		
		btn.setOnClickListner(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("������ ����ϴ�.");
				
			}
		});
		btn.touch();
		

	}

}
