package ch04.sec02;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year;
		
		System.out.println("�г��Է�:");
		year =sc.nextInt();
		
		switch(year) {
		case 1: System.out.println("1�г�"); break;
		case 2: System.out.println("2�г�"); break;
		case 3: System.out.println("3�г�"); break;
		case 4: System.out.println("4�г�"); break;
		default: System.out.println("�߸��Է��ϼ̽��ϴ�."); break;
		
		}
		sc.close();
		

	}

}
