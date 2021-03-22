package ch07.sec03;

public class Manager extends Employee {
	//필드
	private String position;
	
	//매개변수 4개 있는생성자
	//3개는 부모 클래스의 생성자에게 전달하고
	//1개는 자신의 필드값으로 사용
	public Manager(String empNo, String empName, String empPart, String position) {
		//부모 클래스의 생성자 호출하면서 필요한 개수 만큼의 매개변수 전달
		super(empNo,empName,empPart);
		this.position=position;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+
				"\n직위"+ position;
	}
	
	
}
