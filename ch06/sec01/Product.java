package ch06.sec01;

import java.util.Scanner;

public class Product {
	String prdName;
	int prdPrice,prdSold,prdStock;
	
	public void inputPrdInfo() {
		System.out.println("****��ǰ ���� �Է�*****");
		Scanner sc = new Scanner(System.in);
		System.out.print("��ǰ�� :" );
		prdName=sc.next();
		System.out.print("���� :" );
		prdPrice=sc.nextInt();
		System.out.print("�Ǹ� ���� :" );
		prdSold=sc.nextInt();
		System.out.print("��� ���� :" );
		prdStock=sc.nextInt();
		sc.close();
	}
	public void showPrdInfo() {
		System.out.println("\n****��ǰ ���� ���*****");
		System.out.println("��ǰ�� :" +prdName);
		System.out.println("���� :" +prdPrice);
		System.out.println("�Ǹ� ���� :" +prdSold);
		System.out.println("��� ���� :" +prdStock);
		
	}
	public void salesAmount() {
		int total;
		total=prdPrice*prdSold;
		System.out.println("����� :" +total);
	}
	public void stockAmount() {
		int total;
		total=prdPrice*prdStock;
		System.out.println("���� :" +total);
	}

}
