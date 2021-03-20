package ch14.sec04;

// 제네릭 타입 Box

public class Box<T> {
	private T t;
	
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t =t;
	}

}
