package ch09.sec07;

public class Window {
	Button btn1 = new Button();
	Button btn2 = new Button();
	
	Button.OnClickListener listener =new Button.OnClickListener() {

		@Override
		public void onClick() {
			System.out.println("��ȭ�� ��");		
		}
		
	};
	
	Window(){
		btn1.setOnClickListener(listener);
	
	//�͸� ���� ��ü�� �����ؼ� �Ű������� ����
		btn2.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("�޼���");
			}
		});
	}
}
