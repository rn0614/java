package ch14.sec06;

public class Person {
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	} //��ü�� ����� �� �̸��� ������ִ� �޼ҵ�

}
