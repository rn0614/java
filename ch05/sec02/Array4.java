package ch05.sec02;

import java.util.Scanner;

//입력받아서 배열에 저장
public class Array4 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int[] num1 = new int[5];
		
		for(int i=0; i<num1.length;i++) {
			System.out.print("num["+i+"]:");
			num1[i]=sc.nextInt();
			System.out.println("num["+i+"]:"+num1[i]);
			
		
		}
		
		
		
		
		
		String[] name = new String[5];
		
		for(int i=0; i<name.length;i++) {
			System.out.print("name["+i+"]:");
			name[i]=sc.next();
			System.out.println("name["+i+"]:"+name[i]);
			
		
		}
		sc.close();
		
	}

}
