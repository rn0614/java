package ch15.sec02;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx2 {

	public static void main(String[] args) {
		//HashSet
		HashSet<Employee> set =new HashSet<Employee>();
		
		//Employee Ŭ����
		
		// 3�� ����
		Employee e1 = new Employee(100,"�̻��", 56000.55);
		Employee e2 = new Employee(200,"�ִ븮", 66000.55);
		Employee e3 = new Employee(300,"�����", 76000.55);
		
		set.add(e1);
		set.add(e2);
		set.add(e3);
		
		
		System.out.println(set.size());
		// Iterator ����ؼ� ���
		Iterator<Employee> it =set.iterator();
		while(it.hasNext()){
			Employee emp =it.next();
			System.out.println(emp.name);
		}
		
		System.out.println(set.size());
		// Iterator ����ؼ� ���
		Iterator<Employee> it2 =set.iterator();
		while(it.hasNext()){
			Employee emp =it2.next();
			System.out.println(emp.name);
		}

	}

}
