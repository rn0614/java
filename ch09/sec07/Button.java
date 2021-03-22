package ch09.sec07;

	

// 버튼 이벤트 처리에서 익명 구현 객체 사용

public class Button {
	// 필드
	OnClickListener listener;
	//setter 메소드로 구현 객체 받아 필드에 대입
	void setOnClickListener(OnClickListener listener) {
		this.listener=listener;
	}
	
	//버튼 이벤트가 발생했을 때 호출되는 메소드
	void touch(){
		listener.onClick();
	}
	
	
	//중첩 인터페이스
	interface OnClickListener{
		void onClick();
	}

}
