package ch06.sec03;

public class Reservation {
	String air,name,dep,arr,seat;
	int price;
	
	public Reservation() {
		
	}
	
	public Reservation(String a,String b,String c,String d, int x,String e) {
		air=a;
		name=b;
		dep=c;
		arr=d;
		price=x;
		seat=e;
	}
	public void showRsvInfo() {
		
		System.out.println("**�װ��� ���� ����**");
		System.out.println("�װ��� :"+air);
		System.out.println("������ :"+name);
		System.out.println("����� :"+dep);
		System.out.println("������ :"+arr);
		System.out.println("�ݾ� :"+price);
		System.out.println("�¼���ȣ :"+seat);
		
		

		
	}

}
