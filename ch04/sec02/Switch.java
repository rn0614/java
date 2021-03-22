package ch04.sec02;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year;
		
		System.out.println("학년입력:");
		year =sc.nextInt();
		
		switch(year) {
		case 1: System.out.println("1학년"); break;
		case 2: System.out.println("2학년"); break;
		case 3: System.out.println("3학년"); break;
		case 4: System.out.println("4학년"); break;
		default: System.out.println("잘못입력하셨습니다."); break;
		
		}
		sc.close();
		

	}

}
