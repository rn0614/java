package ch06.sec05;

public class SingletonEx {

	public static void main(String[] args) {
		//생성자를 private 막아놨기 때문에 not visible 오류
		//Singleton obj1 = new Singleton();

		//외부에 공개된
		//static 메소드인 getInstance() 호출해서
		//객체를 반환
		Singleton obj1 =Singleton.getInstance();
		
	}

}
