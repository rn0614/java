package ch15.sec02;

public class Book {
	// ������ȣ
	// ������
	// ����
	// ����
	// ������
	// ���ǻ�
	String bnum,name,writer,price,day,comp;

	public Book(String bnum, String name, String writer, String price, String day, String comp) {
		super();
		this.bnum = bnum;
		this.name = name;
		this.writer = writer;
		this.price = price;
		this.day = day;
		this.comp = comp;
	}

	@Override
	public String toString() {
		return bnum + "-"+ name + "-" + writer + "-" + price + "-" + day
				+ "-" + comp;
	}
	
	
	
}
