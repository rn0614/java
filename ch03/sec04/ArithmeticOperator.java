package ch03.sec04;

import java.util.Scanner;

public class ArithmeticOperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.print("Á¤¼ö 1 ÀÔ·Â : ");
		num1 = sc.nextInt();
		
		System.out.print("Á¤¼ö 2 ÀÔ·Â : ");
		num2 = sc.nextInt();
		
		System.out.println("µ¡¼À : "+(num1+num2));
		System.out.println("»¬¼À : "+(num1-num2));
		System.out.println("°ö¼À : "+(num1*num2));
		System.out.println("³ª´°¼À : "+(num1/num2));
		System.out.println("³ª¸ÓÁö : "+(num1%num2));
		sc.close();
		
	}

}
