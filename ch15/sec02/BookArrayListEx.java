package ch15.sec02;

import java.util.ArrayList;

public class BookArrayListEx {

	public static void main(String[] args) {
		// ���� 5�� ����ϰ� �������� ���
		// ������ȣ
		// ������
		// ����
		// ����
		// ������
		// ���ǻ�
		ArrayList<Book> list  =new ArrayList<Book>();
		
		Book b1 =new Book("1","������1","����1","����1","������1","���ǻ�1");
		Book b2 =new Book("2","������2","����2","����2","������2","���ǻ�2");
		Book b3 =new Book("3","������3","����3","����3","������3","���ǻ�3");
		Book b4 =new Book("4","������4","����4","����4","������4","���ǻ�4");
		Book b5 =new Book("5","������5","����5","����5","������5","���ǻ�5");
		
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
