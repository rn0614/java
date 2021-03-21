package ch15.sec02;

import java.util.ArrayList;

public class BookArrayListEx {

	public static void main(String[] args) {
		// 도서 5권 등록하고 도서정보 출력
		// 도서번호
		// 도서명
		// 저자
		// 가격
		// 발행일
		// 출판사
		ArrayList<Book> list  =new ArrayList<Book>();
		
		Book b1 =new Book("1","도서명1","저자1","가격1","발행일1","출판사1");
		Book b2 =new Book("2","도서명2","저자2","가격2","발행일2","출판사2");
		Book b3 =new Book("3","도서명3","저자3","가격3","발행일3","출판사3");
		Book b4 =new Book("4","도서명4","저자4","가격4","발행일4","출판사4");
		Book b5 =new Book("5","도서명5","저자5","가격5","발행일5","출판사5");
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++) {
			Book book =list.get(i);
			System.out.println(book);
		}
	}

}
