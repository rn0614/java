package ch14.sec01;

public class BoxEx {

	public static void main(String[] args) {
		Box box = new Box();
		box.setObject("ȫ�浿"); // String-> Object �ڵ� Ÿ�� ��ȯ
		String name = (String)box.getObject();  // Object->String ���� Ÿ�� ��ȯ
		
		box.setObject(new Apple());   	//Apple -> Object �ڵ�Ÿ�� ��ȭ
		Apple apple = (Apple)box.getObject();	//Object -> Apple ���� Ÿ�� ��ȭ
		
		System.out.println(name);

	}

}
