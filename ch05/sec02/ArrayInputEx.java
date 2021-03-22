package ch05.sec02;

import java.util.Scanner;

public class ArrayInputEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num =new int[5];
		int max=0;
		for(int i=0; i<num.length; i++){
			System.out.print("num["+i+"]입력:");
			num[i]=sc.nextInt();
			
		}
		System.out.print("\n입력된 값 :");
		for(int i=0; i<num.length; i++){
			System.out.print(num[i]+" ");
		}
		for(int i=0; i<num.length; i++){
			if(max<num[i]) {
				max=num[i];
			}
		}
		System.out.println("\n최대값 :"+max);
		sc.close();
	}

}
