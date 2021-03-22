package ch06.sec02;

import java.util.Scanner;

public class CircleEX {

	public static void main(String[] args) {
		Circle cir1 = new Circle();
		Scanner sc = new Scanner(System.in);
		int radius;
		
		System.out.print("반지름 값 :");
		radius=sc.nextInt();
		
		cir1.setCircle(radius);
		
		System.out.println("원의 넓이"+cir1.area());
		
		sc.close();

	}

}
