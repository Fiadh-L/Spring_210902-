package kr.co.softsoldesk.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
//prototype에는 lazy가 포함되어 있음!
public class TestBean4 {

	public TestBean4() {
	System.out.println("TestBean4의 생성자");	
	}
}
