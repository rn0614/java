package ch12.sec03;

public class BeepPrintEX {

	public static void main(String[] args) {
		// 스레드 생성 방법2
		// Thread를 상속받은 하위 클래스 BeepThread 클래스로부터 생성
		Thread thread = new BeepThread();
		thread.start();
		
		for(int i =0; i<5; i++){
			System.out.println("띵");
			try{
				Thread.sleep(500);
			} catch(InterruptedException e) {}
		}
	}

}
