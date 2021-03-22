package ch06.sec01;

import java.util.Scanner;

public class Student {
	String stdNo,stdName;
	int year,score;
		
	public void input() {
		Scanner sc =new Scanner(System.in);
		System.out.print("학번 : ");
		stdNo=sc.next();
		System.out.print("성명 : ");
		stdName=sc.next();
		System.out.print("학년 : ");
		year=sc.nextInt();
		System.out.print("점수 : ");
	    year=sc.nextInt();
		
	    sc.close();
		
		
	}
	

}
