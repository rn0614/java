package ch14.sec07;

// T : ��ü (Ŭ���� Ÿ��)
// M : String

public class Product<T, M> {
	private T kind;
	private M model;
	
	
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
}
