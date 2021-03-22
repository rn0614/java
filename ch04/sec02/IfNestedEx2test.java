package ch04.sec02;

import java.util.Scanner;

public class IfNestedEx2test {

	public static void main(String[] args) {
		System.out.println("********상품정보********");
		System.out.println("1.노트북 : 1,200,000원");
		System.out.println("2.디지털카메라 : 400,000원");
		System.out.println("**********************");
		
		Scanner sc = new Scanner(System.in);
		int num, count, total; 
		int price=0;
		int notebook=1200000;
		int camera= 400000;
		System.out.print("상품번호 입력 :");
		num =sc.nextInt();
		
		if(num==1) {
			price=notebook;
			System.out.print("주문 수량 입력 :");	
			System.out.println("********주문내용********");
		}else if(num==2) {
			price=camera;
			System.out.print("주문 수량 입력 :");	
			System.out.println("********주문내용********");
		}else
			System.out.println("잘못된 입력입니다.");
		
		
				
		
		count = sc.nextInt();
		total =count*price;

		
		if(num==1)
			System.out.println("상품명 : 노트북");
		else if(num==2)
			System.out.println("상품명 : 디지털 카메라");
						
		if(num==1 & num==2) {	
			System.out.println("가격 : "+price+"원");	
			System.out.println("수량 : "+count+"개");
			System.out.println("주문액 : "+total+"원");
			if(total>=1000000) {
				System.out.println("할인액 :" + (int)(total*0.1)+"원");
				System.out.println("총지불액 :"+ (int)(total*0.9)+"원");
			}
			else if(total>=50000) {
				System.out.println("할인액 :" + (int)(total*0.05)+"원");
				System.out.println("총지불액 :"+ (int)(total*0.95)+"원");
			}else {
				System.out.println("할인액 :" + "0"+"원");
				System.out.println("총지불액 :"+ total+"원");
			}
		}
		sc.close();

	}

}
