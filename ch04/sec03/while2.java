package ch04.sec03;

import java.util.Scanner;

public class while2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number1=0;
		while(number1!=7) {
			System.out.print("�����Է� : ");
			number1=sc.nextInt();
		}
		System.out.println("7�Է� ����");
		sc.close();

					
	}

}
