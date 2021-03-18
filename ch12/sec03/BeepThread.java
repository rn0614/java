package ch12.sec03;

import java.awt.Toolkit;

// 스레드 생성 방법2
// Thread 클래스를 상속받은
// Thread 하위 클래스로부터 생성
// Thread 클래스 상속 후에 run()메소드 재정의 해서
// 스레드가 실행할 코드 작성

public class BeepThread extends Thread {
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5;i++) {
			toolkit.beep();
			try {
				Thread.sleep(500); //0,5초 정지
			} catch(InterruptedException e) {}
		}
	}
	
	
}
