package ch07.sec01;

public class Manager extends Employee {
	private String position;
	
	public void setManager() {
		setEmployee(); // 상위 클래스 메소드 호출
		System.out.println("직위 입력 :");
		position = sc.next();
	}
	
	public void showManagerInfo() {
		showEmpInfo();
		System.out.println("");
	}

}
