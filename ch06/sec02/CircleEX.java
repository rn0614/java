package ch06.sec02;

import java.util.Scanner;

public class CircleEX {

	public static void main(String[] args) {
		Circle cir1 = new Circle();
		Scanner sc = new Scanner(System.in);
		int radius;
		
		System.out.print("������ �� :");
		radius=sc.nextInt();
		
		cir1.setCircle(radius);
		
		System.out.println("���� ����"+cir1.area());
		
		sc.close();

	}

}
