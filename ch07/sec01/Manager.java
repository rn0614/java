package ch07.sec01;

public class Manager extends Employee {
	private String position;
	
	public void setManager() {
		setEmployee(); // ���� Ŭ���� �޼ҵ� ȣ��
		System.out.println("���� �Է� :");
		position = sc.next();
	}
	
	public void showManagerInfo() {
		showEmpInfo();
		System.out.println("");
	}

}