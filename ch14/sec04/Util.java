package ch14.sec04;

//���׸� �޼ҵ带 �����ϴ� Ŭ����
// ���׸� �޼ҵ� : �Ű����� Ÿ�԰� ���� Ÿ������ �Ķ���͸� ���� �޼ҵ�
//public <Ÿ���Ķ����> ����Ÿ�� �޼ҵ� (�Ű�����, ....){ ... }
//public <T> Box<T> boxing(T t) { ... }

//<T> : Ÿ�� �Ķ���͸� �Ű������� ���� Ÿ���� Ÿ������ ����ϰڴ�
// ȣ���� ��  <T> �����ϸ� Box<T>�� (T t)�� ����

public class Util {
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
}
