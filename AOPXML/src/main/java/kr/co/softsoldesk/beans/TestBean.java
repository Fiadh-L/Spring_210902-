package kr.co.softsoldesk.beans;

public class TestBean {
//실습1
//	public void method1() {
//		System.out.println("method1 호출");
//	}
	//실습2
//	public int method1() {
//		System.out.println("method1 호출");
//		
//		return 100;
//	}
	
//실습3
	//error코드 (afterretrunning이 호출되지 않아야함)
	public int method1() {
		System.out.println("method1 호출");
		
		int a1=10/0;
		return 100;
	}
}
/*
 * AOPXML
 * maven aspectj 1.9.7 pom.xml에 등록
 * Mainclass 빈 객체 불러오기
 * testben에 void 타입 method1 메서드 생성 후 "method1 호출" 코솔에 뿌리기
 * beans에 xml1 등록
 * mainclass에서 testbean 객체 생성, method1 메서드 불러오기 
 * advisorclass 클래스생성
 * advisorclass에 beforeMethod 메서드 생성 후 "beforeMethod() 호출" 콘솔에 뿌리기
 * beans.xml
 */
 