package ch15.sec01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String>list = new ArrayList<String>();
		int max=0,maxnum =0;
		
		
		
		for(int i=0; i<4;i++) {
			System.out.print("단어를 입력하세요>>");
			String word =sc.next();
			list.add(word);
		}
		
		System.out.println("-----------------------------");
		for(int i=0 ; i<list.size() ;i++) {
			if (max<list.get(i).length()) {
				max=list.get(i).length();
				maxnum=i;
			}
			System.out.print(list.get(i)+ " ");
		}
		
		System.out.println("\n가장 긴 단어는 : "+list.get(maxnum));
		System.out.println("가장 긴 단어의 길이는 : "+max);
		
	}

}
