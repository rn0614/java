package ch06.sec03;

public class Member {
	String id="hkd", name="ȫ�浿",pn="010-1234-5678",state="�ּ�";
	int old=30;
	
	public Member() {
		
	}
	//�Ķ����
	public Member(String id,String name,int old,String pn,String state) {
		this.id=id;
		this.name=name;
		this.old=old;
		this.pn=pn;
		this.state=state;
		
	}
	public void showMember() {
		System.out.println("-----ȸ�� ���� ���-----");
		System.out.println("ID :"+this.id);
		System.out.println("���� :"+this.name);
		System.out.println("���� :"+this.old);
		System.out.println("��ȭ :"+this.pn);
		System.out.println("�ּ� :"+this.state);
		
	}
	

}
