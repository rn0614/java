package ch11.sec03;

public class SubstringEx {

	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0,6);
		System.out.println(firstNum);
		
		String secondNum =ssn.substring(7);
		System.out.println(secondNum);
		
		String year = ssn.substring(0,2);
		String month = ssn.substring(2,4);
		String date = ssn.substring(4,6);
		
		System.out.println("당신은"+ year +"년"+
		month+"월"+date+"일에 태어나셨군요.");

	}

}
