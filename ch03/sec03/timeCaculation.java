package ch03.sec03;

import java.util.Scanner;

public class timeCaculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sec;
		int num1,num2,num3;
		System.out.print("�ð��Է� (��) : ");
		sec = sc.nextInt();
		num1=sec/3600;
		num2=sec%3600/60;
		num3=sec%3600%60;
		
		
		System.out.print(sec+"�ʴ� "+num1 +"�ð�, "+num2 +"��, "+num3 +"���Դϴ�.");

		sc.close();
	}

}
