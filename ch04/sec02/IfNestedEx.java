package ch04.sec02;

import java.util.Scanner;

public class IfNestedEx {

	public static void main(String[] args) {
		System.out.println("********��ǰ����********");
		System.out.println("1.��Ʈ�� : 1,200,000��");
		System.out.println("2.������ī�޶� : 400,000��");
		System.out.println("**********************");
		
		Scanner sc = new Scanner(System.in);
		int num, count, total; 
		int price=0;
		int notebook=1200000;
		int camera= 400000;
		System.out.print("��ǰ��ȣ �Է� :");
		num =sc.nextInt();
		
		if(num==1)
			price=notebook;
		else if(num==2)
			price=camera;
		else {
			System.out.println("�߸��� �Է��Դϴ�.");
			
		}
		
				
		System.out.print("�ֹ� ���� �Է� :");		
		count = sc.nextInt();
		total =count*price;
		
		System.out.println("********�ֹ�����********");
		
		if(num==1)
			System.out.println("��ǰ�� : ��Ʈ��");
		else if(num==2)
			System.out.println("��ǰ�� : ������ ī�޶�");
						
			
		System.out.println("���� : "+price+"��");	
		System.out.println("���� : "+count+"��");
		System.out.println("�ֹ��� : "+total+"��");
		if(total>=1000000) {
			System.out.println("���ξ� :" + (int)(total*0.1)+"��");
			System.out.println("�����Ҿ� :"+ (int)(total*0.9)+"��");
		}
		else if(total>=50000) {
			System.out.println("���ξ� :" + (int)(total*0.05)+"��");
			System.out.println("�����Ҿ� :"+ (int)(total*0.95)+"��");
		}else {
			System.out.println("���ξ� :" + "0"+"��");
			System.out.println("�����Ҿ� :"+ total+"��");
		}
	
		sc.close();

	}

}
