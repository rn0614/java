package ch11.sec03;

public class ReplaceEx {
	public static void main(String[] args) {
		String oldStr ="자바는 객체지향언어 입니다. 자바는 풍부한 APi를 지원합니다";
		String newStr = oldStr.replace("자바","JAVA");
		
		System.out.println(oldStr);
		System.out.println(newStr);
	}

}
