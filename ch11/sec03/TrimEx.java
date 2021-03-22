package ch11.sec03;

public class TrimEx {

	public static void main(String[] args) {
		String tel1 =" 02";
		String tel2 ="123";
		String tel3 =" 123 ";
		
		//trim 사용시 공백제거
		String tel =tel1.trim()+tel2.trim()+tel3.trim();
		System.out.println(tel);
		
		

	}

}
