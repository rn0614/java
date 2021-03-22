package ch06.sec02;

public class Computer {
	//필드 없음
	
	//메소드 반환  배열 안에 모든 숫자의 합
	public int sum1(int[] values) {
		int sum=0;
		
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	//...: 전달된 개수에 따라 자동 배열 생성
	
	public int sum2(int...values) {
		int sum=0;
		
		for(int i =0; i<values.length;i++){
		sum+=values[i];
		
		
		}
		return sum;
		
		
	}
}
