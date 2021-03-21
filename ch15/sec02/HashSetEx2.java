package ch15.sec02;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx2 {

	public static void main(String[] args) {
		//HashSet
		HashSet<Employee> set =new HashSet<Employee>();
		
		//Employee 클래스
		
		// 3명 저장
		Employee e1 = new Employee(100,"이사원", 56000.55);
		Employee e2 = new Employee(200,"최대리", 66000.55);
		Employee e3 = new Employee(300,"김과장", 76000.55);
		
		set.add(e1);
		set.add(e2);
		set.add(e3);
		
		
		System.out.println(set.size());
		// Iterator 사용해서 출력
		Iterator<Employee> it =set.iterator();
		while(it.hasNext()){
			Employee emp =it.next();
			System.out.println(emp.name);
		}
		
		System.out.println(set.size());
		// Iterator 사용해서 출력
		Iterator<Employee> it2 =set.iterator();
		while(it.hasNext()){
			Employee emp =it2.next();
			System.out.println(emp.name);
		}

	}

}
