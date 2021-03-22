package ch03.sec04;

import java.util.Scanner;

public class CompareOperator2 {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num1 = 10;
		int num2 =10;
		boolean result1= (num1==num2);
		
		System.out.println(result1);
		sc.close();
	}
	
	//문자열 비교
	//== 사용하지 않고 equal() 메소드 사용


}
