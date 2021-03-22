package ch02.sec04;

import java.util.Scanner;

//자동 import Ctrl+ shift + O



// Scanner 클래스를 이용한 키 입력
public class input {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num1, num2;
		
		System.out.print("첫번째 숫자 입력 : ");
		num1 =sc.nextInt(); //입력한 값을 정수로 반환
		System.out.println(num1);

		
		System.out.print("두번째 숫자 입력 : ");
		num2=sc.nextInt();
		System.out.println(num2);
		
		int sum=num1+num2;
		int x = num1*num2;
		
		System.out.println("두수의 합 : "+ sum);
		System.out.println("두수의 합 : "+(num1+num2));
		sc.close();
	}

}
