package ch04.sec02;

import java.util.Scanner;

public class MultipleIfElseEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		int max;
		System.out.print("숫자1 입력 : ");
		num1 = sc.nextInt();
		System.out.print("숫자2 입력 : ");
		num2 = sc.nextInt();
		System.out.print("숫자3 입력 : ");
		num3 = sc.nextInt();

		if (num1>=num2)
			max=num1;
		else if(num2>=num3)
			max=num2;
		else
			max=num3;
			
		System.out.println("가장큰 수 :" +max);
		sc.close();
	}

}
