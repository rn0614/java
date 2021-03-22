package ch08.sec10;

// 디폴트 메소드를 추상 메소드로 재선언해서 사용
public interface ChildInterface3 extends ParentInterface {
	@Override
	public void method2();//강제로 추상메소드로 재선언
	public void method3(); // 추상 메소드로 구현
	
}
