package ch14.sec02;

// ���׸� Ÿ�� Box

public class Box<T> {
	private T t;
	
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t =t;
	}

}