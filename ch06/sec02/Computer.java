package ch06.sec02;

public class Computer {
	//�ʵ� ����
	
	//�޼ҵ� ��ȯ  �迭 �ȿ� ��� ������ ��
	public int sum1(int[] values) {
		int sum=0;
		
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	//...: ���޵� ������ ���� �ڵ� �迭 ����
	
	public int sum2(int...values) {
		int sum=0;
		
		for(int i =0; i<values.length;i++){
		sum+=values[i];
		
		
		}
		return sum;
		
		
	}
}
