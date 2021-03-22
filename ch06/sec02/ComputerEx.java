package ch06.sec02;

public class ComputerEx {

	public static void main(String[] args) {
		Computer myCom = new Computer();
		
		int[] values1 = {1,2,3};
		
		int result1 = myCom.sum1(values1);
		System.out.println(result1);
		
		int result2 = myCom.sum1(new int[] {1,2,3,4,5});
		System.out.println(result2);
		
		int result3 = myCom.sum2(new int[] {1,2,3,5,6,4,5});
		System.out.println(result3);
		

	}

}
