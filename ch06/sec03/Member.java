package ch06.sec03;

public class Member {
	String id="hkd", name="홍길동",pn="010-1234-5678",state="주소";
	int old=30;
	
	public Member() {
		
	}
	//파라메터
	public Member(String id,String name,int old,String pn,String state) {
		this.id=id;
		this.name=name;
		this.old=old;
		this.pn=pn;
		this.state=state;
		
	}
	public void showMember() {
		System.out.println("-----회원 정보 출력-----");
		System.out.println("ID :"+this.id);
		System.out.println("성명 :"+this.name);
		System.out.println("나이 :"+this.old);
		System.out.println("전화 :"+this.pn);
		System.out.println("주소 :"+this.state);
		
	}
	

}
