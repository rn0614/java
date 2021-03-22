package ch06.sec02;


public class Circle {
	//필드
	//반지름 값 radius
	int radius;
	
	//메소드
	//setCircle()
	//필드 radius 값 설정
	public void setCircle(int x){
		
		radius=x;
		
	}
	
	public float area(){
		System.out.print("원의 넓이 :");
		
		return radius*radius*3.14f;
	}
	
	
	// aerea()로 넓이

	
}
