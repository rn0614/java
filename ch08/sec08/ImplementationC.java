package ch08.sec08;

public class ImplementationC implements InterfaceC {
	// InterfaceC 는 InterfaceA와 InterfaceB를 상속받음
	// InterfaceA와 InterfaceB의 추상 메소드를 재정의해서 실체 메소드로 구혀해야함
	// 구현하지 않으면 오류
	
	@Override
	public void methodA() {
		System.out.println("ImplementationC - methodA");

	}

	@Override
	public void methodB() {
		System.out.println("ImplementationC - methodB");

	}

	@Override
	public void methodC() {
		System.out.println("ImplementationC - methodC");

	}

}
