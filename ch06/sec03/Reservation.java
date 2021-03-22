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
		
		System.out.println("**항공권 예약 정보**");
		System.out.println("항공기 :"+air);
		System.out.println("예약자 :"+name);
		System.out.println("출발지 :"+dep);
		System.out.println("도착지 :"+arr);
		System.out.println("금액 :"+price);
		System.out.println("좌석번호 :"+seat);
		
		

		
	}

}
