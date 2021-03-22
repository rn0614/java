package ch08.sec10;

public class DefaultMethodExtendsEx {
	public static void main(String[] args) {
		ChildInterface1 cil =new ChildInterface1() {

			@Override
			public void method1() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void method3() {
				// TODO Auto-generated method stub
				
			}
			
		};
		//익명 구현 객체를 생성해서 인터페이스 변수에 대입
		//익명 구현 객체를 생성해서 인터페이스 변수에 대입
		ChildInterface2 ci2=new ChildInterface2() {

			@Override
			public void method1() {
				System.out.println("ChildInterface2 에서 재정의된 method1()실행");
				
			}
			

			@Override
			public void method2() {
				System.out.println("ChildInterface2 에서 재정의된 디폴트 메소드 method2()실행");
			}


			@Override
			public void method3() {
				System.out.println("ChildInterface2 에서 재정의된 method3()실행");
			}
			
		};
		
		ci2.method1();
		ci2.method2();
		ci2.method3();
	
		
		
		ChildInterface3 ci3=new ChildInterface3() {

			@Override
			public void method1() {
				System.out.println("ChildInterface3 에서 재정의된 method1()실행");
			}
			
			@Override
			public void method2() {
				System.out.println("ChildInterface3 에서 재정의된 method2()실행");
			}
			@Override
			public void method3() {
				System.out.println("ChildInterface3 에서 재정의된 method3()실행");
			}	
		};
		
		ci3.method1();
		ci3.method2();
		ci3.method3();
	}	
}
