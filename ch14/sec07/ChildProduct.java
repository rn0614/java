package ch14.sec07;

//제네릭 타입의 상속
// 자식 클래스에도타입 파라미터 기술
// 자식 클래스는 추가적인 타입 파라미터 가질 수 있음
public class ChildProduct<T, M, C> extends Product<T, M> {
	private C company;

	public C getCompany() {
		return company;
	}

	public void setCompany(C company) {
		this.company = company;
	}

	@Override
	public T getKind() {
		// TODO Auto-generated method stub
		return super.getKind();
	}

	@Override
	public void setKind(T kind) {
		// TODO Auto-generated method stub
		super.setKind(kind);
	}

	@Override
	public M getModel() {
		// TODO Auto-generated method stub
		return super.getModel();
	}

	@Override
	public void setModel(M model) {
		// TODO Auto-generated method stub
		super.setModel(model);
	}
	
}
