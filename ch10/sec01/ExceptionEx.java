package ch10.sec01;

import java.util.Scanner;

public class ExceptionEx {
	public static void main(String[] args) {
		// 정수 2개 입력 받고
		// 나누기 연산 : 0으로 나누면 오류 (예외처리문장)
		// 0으로 나누며
		Scanner sc = new Scanner(System.in);
		int x,y;
		System.out.print("정수1 입력 : ");
		x=sc.nextInt();
		System.out.print("정수2 입력 : ");
		y=sc.nextInt();
		
		try { 
			System.out.println("나누기 결과 :"+x/y);
			
		} catch (ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없습니다.");
		} catch (Exception e) {
			System.out.println("오류가 발생했습니다.");
		}
	}
}
