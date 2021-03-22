package ch04.sec02;

import java.util.Scanner;

public class ifElseEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Á¡¼öÀÔ·Â : ");
		int number;
		number = sc.nextInt();
		
		if(number%2==1) {
			System.out.println("È¦¼ö");
		}else {
			System.out.println("Â¦¼ö");
		}
		sc.close();

	}

}
