package ch14.sec07;

//���׸� Ÿ���� ���
// �ڽ� Ŭ��������Ÿ�� �Ķ���� ���
// �ڽ� Ŭ������ �߰����� Ÿ�� �Ķ���� ���� �� ����
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
