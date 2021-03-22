package ch04.sec03;

//랜덤 숫자 생성
//(1) math.random()사용
//(2) Random 클래스 사용
public class RandomNum1 {

	public static void main(String[] args) {
		// (1) math.random()사용
		for(int i=1; i<=10;i++) {
			//int num =(int)(Math.random()*10);// 0~9사이 무작위 수
			int num =(int)(Math.random()*10)+1;// 1~10사이 무작위 수
			
			System.out.println(num);
		
		
		}

	}

}
