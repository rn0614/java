package ch15.sec02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	private static void printTime(List<String> list) {
		long startTime =System.nanoTime();
		
		for(int i=0; i<10000; i++) {
			list.add(0,String.valueOf(i));
		}
		
		long endTime =System.nanoTime();
		System.out.println(endTime-startTime);
	}
	
	public static void main(String[] args) {
		List<String> listArrayList = new ArrayList<String>();
		List<String> listLinkedList = new LinkedList<String>();
		
		ArrayList<String> arrayList = new ArrayList<String>();
		LinkedList<String> linkedList =new LinkedList<String>();

		System.out.println("List_ArrayList : ");
		printTime(listArrayList);
		
		System.out.println("List_LinkedList : ");
		printTime(listLinkedList);
		
		System.out.println("List_ArrayList : ");
		printTime(arrayList);
		
		System.out.println("LinkedList : ");
		printTime(linkedList);
		
		
	}

}
