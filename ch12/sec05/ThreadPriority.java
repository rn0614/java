package ch12.sec05;

public class ThreadPriority {
	public static void main(String[] args) {
		for(int i= 1; i<10; i++) {
			Thread thread = new CalcThread("thread"+i);
			//원래 순서가 다름. 우선순위 부여
			// 10만 우선
			if(i!=10){
				thread.setPriority(Thread.MIN_PRIORITY);
			}else {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			
			
			thread.start();
		}
		
	}
}
