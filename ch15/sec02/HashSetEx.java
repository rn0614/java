package ch15.sec02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("java");
		set.add("JDBC");
		set.add("Serviet/JSP");
		set.add("java");
		set.add("MyBatis");
		
		int size = set.size();
		System.out.println("ÃÑ °´Ã¼ ¼ö :" + size);
		
		Iterator<String> iterator =set.iterator();
		while(iterator.hasNext()){
			String element =iterator.next();
			System.out.println("\t"+ element);
		}
		set.remove("JDBC");
		System.out.println("ÃÑ °´Ã¼¼ö :" + size);
		
		for(String element : set) {
			System.out.println("\t" + element);
		}
		
		set.clear(); //¸ðµç °´Ã¼¸¦ Á¦°ÅÇÏ°í ºñ¿ò
		if(set.isEmpty()) {
			System.out.println("ºñ¾îÀÖÀ½");
		}
		
		
	}

}
