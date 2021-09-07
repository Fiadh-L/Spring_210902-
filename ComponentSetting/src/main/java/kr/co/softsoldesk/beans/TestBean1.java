package kr.co.softsoldesk.beans;

import org.springframework.stereotype.Component;

@Component //config에 등록한 것과 같다.
public class TestBean1 {
	
	public TestBean1() {
		System.out.println("TestBean1의 생성자");
	}

}
