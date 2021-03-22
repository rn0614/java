package ch09.sec04;

public class ButtonEx {

	public static void main(String[] args) {
		//전화를 겁니다.
		//메세지를 보냅니다.
		
		//Button 객체 생성
		Button btn = new Button();
		
		//Button의 Setter 호출해서 설정
		CallListener call =new CallListener();
		btn.setOnClickListner(call);
		//버튼 클릭했을 때 호출되는 메소드 호출 - 버튼 클릭 이벤트 처리
		btn.touch();
		
		//Button의 Setter 호출해서 설정
		
		btn.setOnClickListner(new MessageListener());
		//버튼 클릭했을 때 호출되는 메소드 호출 - 버튼 클릭 이벤트 처리
		btn.touch();
		
		
		
		// 익명 구현 객체 사용(구현 클래스 생성하지 않고)
		// 구현 클래스를 만들지 않고
		// 직접 익명 구현객체를 대입해서 이벤트 처리하는 경우가 더 많음
		
		btn.setOnClickListner(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("사진을 찍습니다.");
				
			}
		});
		btn.touch();
		

	}

}
