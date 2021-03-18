package ch12.sec08;

public class ThreadStateEX {

	public static void main(String[] args) {
		StatePrintThread statePrintThread =new StatePrintThread(new TargetThread());
		statePrintThread.start();
		
		

	}

}
