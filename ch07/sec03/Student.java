package ch07.sec03;

public class Student extends People {
	private String stdNo;

	public Student(String name, String ssn, String stdNo) {
		super(name, ssn);
		this.stdNo = stdNo;
	}

	@Override
	public String toString() {
		return super.toString()+
				",stdNo:" + stdNo;
	}
	
	
}

//People 클래스 상속 받는 Student 클래스 생성
//필드 : stdNo
//생성자 초기화 : 매개변수로 전달받아서
//부모 생성자에게 매개 변수 전달
//toString() 사용 출력

//실행 클래스 : StudentEX