package kr.co.softsoldesk.advisor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AdvisorClass {
	
	@Before("execution(* method1())")
	public void beforeMethod() {
		System.out.println("beforeMethod() 호출");
	}
	
	//===================================================
	@After("execution(* method1())")
	public void afterMethod() {
		System.out.println("afterMethod() 호출");
	}
	@AfterReturning("execution(* method1())")
	public void afterReturningMethod() {
		System.out.println("afterReturningMethod() 호출");
	}
	//===================================================
	@AfterThrowing("execution(* method1())")
	public void afterThrowingMethod() {
		System.out.println("afterThrowingMethod() 호출");
	}
	
	//===================================================
	@Around("execution(* method1())")
	public Object aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("aroundMethod() 호출1");
		Object result = pjp.proceed();
		System.out.println("aroundMethod() 호출2");
		
		//result를 기준으로 해서 앞뒤로 메서드를 호출함
		return result;
		
	}
}
