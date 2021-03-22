package ch09.sec03;

public class Outter {
	String field ="Outer-field";
	
	void method() {
		System.out.println("Outer-method()");
	}
	
	
	//ÁßÃ¸Å¬·¡½º
	class Inner{
		String field ="Inner-field";
		
		void method() {
			System.out.println("Inner-method()");
		}
		
		void print() {
			System.out.println(this.field);
			this.method();
			
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
}
