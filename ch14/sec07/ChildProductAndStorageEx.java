package ch14.sec07;

public class ChildProductAndStorageEx {

	public static void main(String[] args) {
		//���׸� Ÿ���� ���
		ChildProduct<Tv,String,String> product = new ChildProduct<>();
		product.setKind(new Tv());
		product.setModel("SmartTv");
		product.setCompany("Samsung");

		//�������̽� Ÿ��
		Storage<Tv> storage = new StorageImpl<Tv>(100);
		storage.add(new Tv(),0);
	}

}
