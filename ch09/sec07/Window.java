package ch09.sec07;

public class Window {
	Button btn1 = new Button();
	Button btn2 = new Button();
	
	Button.OnClickListener listener =new Button.OnClickListener() {

		@Override
		public void onClick() {
			System.out.println("전화를 함");		
		}
		
	};
	
	Window(){
		btn1.setOnClickListener(listener);
	
	//익명 구현 객체를 생성해서 매개값으로 대입
		btn2.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("메세지");
			}
		});
	}
}
