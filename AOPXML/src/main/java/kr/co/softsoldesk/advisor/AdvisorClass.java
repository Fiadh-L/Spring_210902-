package kr.co.softsoldesk.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdvisorClass {

	public void beforeMethod() {
		System.out.println("beforeMethod() 호출");
	}
	
	public void afterMethod() {
		System.out.println("afterMethod() 호출");
	}
	
	//반환값이 있는 메서드에 AOP 적용시 사용
	public Object aroundMethod(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("aroundMethod 호출");
		//원래의 메서드를 호출하여 실행시점을 명확히 한다
		Object obj = pjp.proceed();
		System.out.println("aroundMethod 호출2");
		
		return obj;
	}
	//예외 현상이 발생하지 않았을때
	public void afterReturningMethod() {
		System.out.println("afterReturningMethod() 호출");
	}
	//예외현상이 발생되지 않았을때(비성장적으로 왔을때, 오류가 났을때)
	public void afterThrowingMethod(Throwable e1) {
		System.out.println("afterThrowingMethod() 호출");
		System.out.println(e1);
	}
}
