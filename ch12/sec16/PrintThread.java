package ch12.sec16;

// 안전한 종료를 위해 stop 플래그 이용
// stop 플래그로 run() 메소드 정상종료 유도
// run()메소드가 종료되면 스레드 종료
// stop 값이 true 또는 false 상태인지 확인해서 종료

public class PrintThread extends Thread {
	@Override
	public void run() {
	//무한 반복
		// 방법1
	/*
			while(true) {
				System.out.println("실행중");
				// 일시정지 상태 없는 경우
				// interrupt 된 상태인지를 확인하고
				// interrupted 되었으면 종료
				// Thread.interrupted(): interrupted()는 Thread의 정적 메소드
				
				if(Thread.interrupted()) { //interrupted되었으면
					break; //while 문 종료
				}
				
			}*/
		
		//방법2
		//isInterrupted()메소드 사용
		//Thread 클래스의 인스턴트 메소드 isInterrupted() 사용
		//PrintThread가 
		while(true){
			System.out.println("실행중");
			
			if(isInterrupted()) { //interrupt 되었으면
				break;
			}
		}
		
		
		System.out.println("자원정리");
		System.out.println("실행종료");
	}
}
