package ch15.sec01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGenEx {

	public static void main(String[] args) {
		List<String>list = new ArrayList<String>();
		
		list.add("java");
		list.add("JDBC");
		list.add("Servket/JSP");
		list.add(2,"database");
		
		int size= list.size();
		System.out.println("�� ��ü �� :"+size);
		
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+" : "+str);
		}
		
		System.out.println();
		
		System.out.println("2 : "+ list.get(2));
		
		list.remove(1);
		list.remove(1);
		System.out.println();
		
		for(int i=0; i<list.size();i++) {
			String str =list.get(i);
			System.out.println(i+" : "+ str);
		}
	}

}
