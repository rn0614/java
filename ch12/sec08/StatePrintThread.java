package ch12.sec08;

// TargetThread 의 상태를 지속적으로 출력하는 역할하는 클래스
// 0.5 초 주기로 targetThread 출력


public class StatePrintThread extends Thread {
	private Thread targetThread;
	
	public StatePrintThread(Thread tarThread) {
		this.targetThread =targetThread;
	}
	
	@Override
	public void run() {
		// 무한 반복하면서 스레드 상태 출력
		// TERMINATED 상태가 되면 반복문 종료
		while(true) {
			// (1) 스레드 상태 출력
			// 스레드 상태를 나타내는 열거 상수 문자열 반환
			Thread.State state = targetThread.getState();
			System.out.println("타겟 스레드 상태 : "+ state);
			
			// (2) 스레드가 새로 생성됐으면 start() 메소드 호출
			// (실행 대기 상태 또는 실행 상태로 됨)
			if(state == Thread.State.NEW) {
				targetThread.start();
			}
			
			// (3) 상태가 TERMINATED이면 반복문 종료
			if(state == Thread.State.TERMINATED) {
				break;
			}
			// (4) 0.5 초간 정지 : 일시 정지 상태
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
			
			
		}
		
		
		
	}
}
