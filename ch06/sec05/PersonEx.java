package ch06.sec05;

public class PersonEx {
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567","홍길동");
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//final 필드는 한번 정해지면 변할 수 없다.
	}
}
