package ch10.sec01;

public class ArrayIndexOutOutBOundsEx {
	public static void main(String[] args) {
		if(args.length ==2) {
			String data1 =args[0];
			String data2 =args[1];
			String data3 =args[2];
		
			System.out.println("args[0]:"+data1);
			System.out.println("args[1]:"+data2);
			System.out.println("args[2]:"+data3);
		}else {
			System.out.println("[실행방법]");
		}
		//발생원인
		//main()메소드의 agr에 전달되는 값이 없어서 발생하는 오류
		// args에 값 성정하는 법 : Run/Run Configuration 장에서 Argument 탭에 입력
		
		
		
	}
}
