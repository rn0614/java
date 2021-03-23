# Java 총정리(이것이 자바다)

> java를 배우면서 전에 배웠던 python과 객체, 클래스에 들어가서는 더 복잡한 구조로 되어 있는 것을 깨달았다. java의 구조는 마치 필요한 것을 하나씩 하나씩 붙여가며 만든 언어 느낌이다. 따라서 몇가지 부분에서 중점을 두고 언어를 봐야한다.
>
> - 이 기능을 왜 만들었는지에 대한 질문(상속, 인터페이스, 스레드, 제네릭, 컬렉션, 스트림)
> - 순서가 아닌 객체이므로 제일 처음은 실행파일과 클래스 로 나뉘고 해당 안에 (필드, 생성자, 메소드 )가 정확히 어떻게 들어가고 어느 객체에 들어가 있는지 구분이 필요하다.

## 목차

- ch1 : 자바 시작하기(그냥 설치 방법) : java, eclipse 두개 설치
- ch2 : 변수와 타입
  -  변수에 관한 설명
  - 타입에 관한 내용
  - 자동변환과 강제변환 <`큰 타입으로 갈 땐 자동`, `작은 타입으로 갈 땐 강제`>
- ch3 : 연산자
  - 연산자에 대한 것, 방향과 우선순위
- ch4 : 조건문과 반복문
  - 조건문 : if, switch 
  - 반복문 : for, , while
- ch5 : 참조차입
  - 참조변수 : (주소)가 담긴 변수들, 배열과 열거에 대해서도 다룬다.
- ch6 : 클래스
  - 객체지향 언어에서 나오는 가장 큰 특징
  - 구성멤버 : 필드, 생성자, 메소드
  - 특이한 문법 : this, static. final
  - 패키지와 접근 제한자
  - getter과 setter 메소드 toString
  - 어노테이션(@)
- ch7 : 상속
  - 부모와 자식 객체
  - 자식에서 부모 생성자 호출하는 법 super()
  - 메소드 재정의 (부모 메소드를 자식 메소드로 아예 바꿔서 정의 하는 것)
  - 다형성
  - 추상 클래스
- ch8 : 인터페이스
  - 역할
  - 사용법
  - 상속
- ch9 : 중첩 클래스와 중첩 인터페이스(클래스 안에 클래스, 인터페이스 안에 인터페이스)
  - 중첩 클래스
  - 중첩 인터페이스
  - 익명 객체
- ch10 : 예외처리
  - try-catch 문
  - 예외종류
- ch11: 기본 API 클래스(자바에서 주어지는 기본적인 함수들, Object나 String 같은 것)
  - Object
  - System
  - Class
  - String
  - Math,Random
  - Date
  - Format
- ch12 : 멀티 스레드(동시에 일어나야 하는 작업)
  - 생성과 실행
  - 우선순위 (겹치면 안됨) 
  - 동기화 메소드 synchronize
  - 스레드의 상태
- ch 13 : 제네릭
  - 제네릭 사용 이유
  - 제네릭 타입
  - 멀티 파라미터
  - 메소드
  - 타입 제한하기
  - 와일드카드
- ch14 : 람다식
  - 람다식 사용 방법
- ch15 : 컬렉션 프레임워크
  - list
  - set
  - map
- ch18:  IO기반 입출력 및 네트워킹
  - IO 패키지
  - 입력스트림, 출력 스트림
  - 콘솔 입출력



## ch12 :  멀티 스레드

>ch12 : 멀티 스레드(동시에 일어나야 하는 작업)
>
>- 생성과 실행
>- 우선순위 (겹치면 안됨) 
>- 동기화 메소드 synchronized
>- 스레드의 상태

- 하나의 프로세스가 두가지 이상의 일을 함. (`서로에게 영향을 미침-> 예외 처리가 중요`)

- main() 메소드 실행시 메인 스레드가 실행.(`메인 스레드는 끝까지 진행 or return문을 만나면 종료`)
- 실행중인 스레드가 하나라도 있으면 프로세스는 종료되지 않는다.



### ch12.1 Thread 생성 및 실행 방법

> 총 2개의 java 파일 
>
> - 실행클래스(메인 스레드) 
> - 추가클래스(서브 스레드)

 사용법

1. 추가 클래스에서 Thread 상속 run()으로 기능 개발
2. 메인 클래스에서 추가클래스 객체를  Runnable 구현객체로 만들고 작업 스레드를 만든후 `작업스레드.start()`를 실행



// 실행클래스에서(동작1)

``` java
public class 실행 클래스 이름 {

	public static void main(String[] args) {
		// 스레드 생성 방법1
		// Thread 클래스로부터 직접 생성
		// Runnable 구현 객체 대입 방법 1
		Runnable 구현객체 =new 추가클래스(); // Runnable 구현객체
		Thread 작업스레드 = new Thread(구현객체); //작업 스레드 생성
       
        작업스레드.start(); // 추가클래스의 메소드를 진행하는 함수 start() // run()을 동작
        
        // 예외가 없다면 이곳에 할 일을 입력 가능
		try{
			메인클래스 작업  // 메인에서 할 일을 입력(예외가 발생할 수 있는 경우)
		} catch(InterruptedException e) {} // 예외처리 필수
		
    }
```



// 추가클래스에서(동작 2) `runnable 인터페이스 실행 or Thread하위 객체로 생성`

``` java
// 추가 클래스에서는 Runnable 인터페이스를 가져옴
public class 추가클래스 implemets Runnable{

    // run 메소드 생성 (오버라이딩 가능)
	public void run() {
		try {
			추가 클래스 작업
		} catch(InterruptedException e) {}
		
	}
}
```



``` java
public class 추가클래스 extends Thread{ // 위와 유일한 차이점.

    // run 메소드 생성 (오버라이딩 가능)
    @Override
	public void run() {
		try {
			추가 클래스 작업
		} catch(InterruptedException e) {}
		
	}
}
```













위 방법과 달리 runnable 구현객체를 만드는 방법은 2가지가 추가로 존재한다.

1. 익명객체

``` java
Thread 작업스레드 = new Thread(new Runnable() { // 익명객체로 runnable()을 메인 함수에 넣음
	@Override
	public void run() {
        try {
				추가 클래스 작업
		} catch(InterruptedException e) {}
	}
    작업스레드.start();
    try{
        메인 클래스 작업
    }catch()(InterruptedException e) {}
    
});
```

2. 람다식

``` java
Thread 작업스레드 = new Thread(()-> {
	try {
	추가 클래스 작업	
	} catch(InterruptedException e) {}
	
    메인 클래스 작업//try-catch 생략
});
```



\* 추가사항(작업스레드 이름 바꾸기, 스레드 이름 호출 )

``` java
Thread 작업스레드  = Thread.currentThread // 코드실행중인 현재 스레드 참조 확인
작업스레드.setName("스레드 이름"); //이름바꾸기
작업스레드.getName();			//이름호출
```









### ch12.2 우선순위

> 

``` java
작업스레드.setPriority(우선순위); // 우선순위는 1~10 초기값 5
작업스레드.setPriority(Thread.MAX_PRIORITY); //최우선 실행
```



### ch12.3 동기화synchronized

> 총 2개의 파일 
>
> - 메인(공유객체 포함)
> - 추가 스레드
>
> 작업을 진행하다보면 공유객체를 메인스레드와 추가 스레드가 `동시에` 사용하는 경우가 생긴다.
>
> 이럴 경우에 문제가 생긴다. 공유객체는 `한 스레드씩` 쓰도록 해야한다.

``` java
public sychronized void 메소드 이름(){} //sychronized로 한객체밖에 못들어옴
sychronized(공유객체){}				//tip 공유객체에 this들어가면 다른 모든 스레드들이 해당 
								//객체를 사용 할 수 없다.
```





### ch12.4 스레드 상태

>- 객체 생성(NEW)
>- 실행대기(RUNNABLE)  : start() 받으면 실행
>- 일시정지
>  - WAITING				: 다른 스레드가 통지할 때까지 기다리기
>  - TIMED_WATING    : 시간 정해서 기다리기
>  - BLOCKED               : 사용하고자 하는 객체의 락이 풀릴때까지 기다리기
>- 실행
>- 종료(TERMINATED)



> 실행대기 -> 실행 -> 일시정지 -> 실행대기(일시정지는 실행대기를 거친다)

``` java 
스레드.getState(); // 스레드의 상태 반환
Thread.State.상태 // 상태값
```



> 어떻게 스레드 제어 상태를 바꿀 수 있을까?

- 실행 -> 일시정지
  - sleep() : 주어진 시간동안 정지
  - join() : join()메소드 호출한 스레드 정지. join()메소드를 가진 스레드 종료되면 실행
  - wait() : 동기화 블록에서 일시정지 상태로 이동 시간제한이 없으면 notify()로 풀것
- 일시정지 -> 실행대기
  - interrupt() : interruptedException에서 try-catch 코드를 이용해서 catch에서 실행대기로 이동
  - notify() : wait으로 멈춘 상태를 다시 가동
  - notifyAll() : 전체 실행
- 실행대기 -> 실행
  - run
- 실행 -> 실행대기
  - yield() : 우선순위 같은 애한테 양보
- 실행 ->종료
  - ~~stop~~ (쓸 때 매우 주의 해서 유도하는 방식으로 쓸 것)