package ch04.sec02;

import java.util.Scanner;

// 중첩 if문 : if문 블록 안에 또라는 ㅑㄹ ans
public class IfNested {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, pay;
		
		System.out.println("번호 입력 (1.현금 2.카드) :");
		num =sc.nextInt();
		
		if(num==1|| num==2) {
				//제대로 입력한 경우
			System.out.print("지불액 입력 :");
			pay = sc.nextInt();
			
			if(num==1) {
				System.out.println("할인액10%");
				System.out.println("할인액:"+(int)(pay*0.1)+"원");
				
			}else {
				System.out.println("할인액 5%");
				System.out.println("할인액:"+(int)(pay*0.05)+"원");
			}
			
		}else { //잘못 입력한 경우
			System.out.println("잘못입력했습니다.");
			
			
		}
		sc.close();

	}

}
