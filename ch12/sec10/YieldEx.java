package ch12.sec10;

public class YieldEx {

	public static void main(String[] args) {
		ThreadA threadA =new ThreadA();
		ThreadB threadB =new ThreadB();
		
		threadA.start();
		threadB.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		
		threadA.work = false; //B?? ????
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		threadA.work =true;
	}

}
