package ch15.sec02;

public class Book {
	// 도서번호
	// 도서명
	// 저자
	// 가격
	// 발행일
	// 출판사
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
