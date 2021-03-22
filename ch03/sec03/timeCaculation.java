package ch03.sec03;

import java.util.Scanner;

public class timeCaculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sec;
		int num1,num2,num3;
		System.out.print("시간입력 (초) : ");
		sec = sc.nextInt();
		num1=sec/3600;
		num2=sec%3600/60;
		num3=sec%3600%60;
		
		
		System.out.print(sec+"초는 "+num1 +"시간, "+num2 +"분, "+num3 +"초입니다.");

		sc.close();
	}

}
