package ch06.sec01;

import java.util.Scanner;

public class Student {
	String stdNo,stdName;
	int year,score;
		
	public void input() {
		Scanner sc =new Scanner(System.in);
		System.out.print("�й� : ");
		stdNo=sc.next();
		System.out.print("���� : ");
		stdName=sc.next();
		System.out.print("�г� : ");
		year=sc.nextInt();
		System.out.print("���� : ");
	    year=sc.nextInt();
		
	    sc.close();
		
		
	}
	

}
