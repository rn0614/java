package ch07.sec02;

public class Employee {
	private String empNo;
	private String empName;
	private String part;
	
	public Employee(String empNo, String empName, String part) {
		this.empNo=empNo;
		this.empName=empName;
		this.part=part;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		return empNo +"\t"+empName+"\t"+part;
	}
	

}
