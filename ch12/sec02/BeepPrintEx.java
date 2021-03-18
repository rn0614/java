package ch12.sec02;

import java.awt.Toolkit;

// 메인 스레드 : 프린팅 담당

public class BeepPrintEx {

	public static void main(String[] args) {
		// 스레드 생성 방법1
		//Thread 클래스로부터 직접 생성
		// Runnable 구현 객체 대입 방법 1
		//Runnable beepTask =new BeepTask(); // Runnable 구현객체
		//Thread thread = new Thread(beepTask); //작업 스레드 생성
		
		
		// Runnable 구현 객체 대입 방법 2
		// 익명  구현 객체 사용 (BeepTask 사용 안 함)
		/*Thread thread = new Thread(new Runnable() {

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
			
		});*/
		
		
		// Runnable 구현 객체 대입 방법3
		// 람다식 사용
		Thread thread = new Thread(()-> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i=0; i<5;i++) {
				toolkit.beep();
				try {
					Thread.sleep(500); //0,5초 정지
				} catch(InterruptedException e) {}
			}
		});
		
		
		
		// BeepTask의 run 메소드 실행(두개의 스레드 동시 진행)
		thread.start();
		
		for(int i =0; i<5; i++){
			System.out.println("띵");
			try{
				Thread.sleep(500);
			} catch(InterruptedException e) {}
		}
		
	}

}
