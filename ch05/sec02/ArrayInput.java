package ch05.sec02;

import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score =new int[5];
		int total=0;
		float average=0;
		
		for(int i=0; i<score.length; i++){
			System.out.print("학생"+(i+1)+"점수입력:");
			score[i]=sc.nextInt();
			total+=score[i];
		
		}
		average=total /(float)score.length;

		for(int i=0; i<score.length; i++){
			System.out.println("학생"+(i+1)+":"+score[i]);
		}
		System.out.println("총점 :"+total);
		System.out.println("평균 :"+average);
		sc.close();
	}
	

}
