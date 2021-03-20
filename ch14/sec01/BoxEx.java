package ch14.sec01;

public class BoxEx {

	public static void main(String[] args) {
		Box box = new Box();
		box.setObject("홍길동"); // String-> Object 자동 타입 변환
		String name = (String)box.getObject();  // Object->String 강제 타입 변환
		
		box.setObject(new Apple());   	//Apple -> Object 자동타입 변화
		Apple apple = (Apple)box.getObject();	//Object -> Apple 강제 타입 변화
		
		System.out.println(name);

	}

}
