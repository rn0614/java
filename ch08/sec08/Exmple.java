package ch08.sec08;

public class Exmple {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		// InterfaceA 타입이므로 InterfaceA 멤버만 사용가능
		ia.methodA(); //InterfaceA 멤버 methodA()만 호출가능
		
		InterfaceB ib =impl;
		ib.methodB();
		
		InterfaceC ic =impl;
		
		ic.methodA(); //셋다 가능
		ic.methodB();
		ic.methodC();
		
		
		
		
	}

}
