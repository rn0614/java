package ch10.sec01;

public class TryCatchEx {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch(ClassNotFoundException e){
			System.out.println("Ŭ������ �����ϴ�.");
		}
	} // ctrl + space����Ű
}
