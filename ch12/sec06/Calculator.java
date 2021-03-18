package ch12.sec06;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	
		try {
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+
					" : "+ this.memory );
		}catch(InterruptedException e){}
		
	}
	
}
