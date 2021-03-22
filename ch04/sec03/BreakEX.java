package ch04.sec03;

import java.util.Scanner;

public class BreakEX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int present=100000;
		int less;
		System.out.println("현재잔액 : "+present);
		
		while(true) {
			System.out.print("입출액 입력 : " );
			less= sc.nextInt();
			
			if(present<less) {
				System.out.print("잔액부족. 현재잔액 :"+present);
				break;
			}else {
				present-=less;
			}
			sc.close();
		}
		

	}

}
