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
  - 와일ㅡ카드
- ch14 : 람다식
  - 람다식 사용 방법
- ch15 : 컬렉션프레임 웤크
  - 