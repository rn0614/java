package ch04.sec02;

import java.util.Scanner;

public class ifElseEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է� : ");
		int number;
		number = sc.nextInt();
		
		if(number%2==1) {
			System.out.println("Ȧ��");
		}else {
			System.out.println("¦��");
		}
		sc.close();

	}

}
