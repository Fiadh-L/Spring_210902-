package kr.co.softsoldesk.beans;

import org.springframework.stereotype.Component;

@Component("t3")
public class TestBean2 {

	public TestBean2() {
		System.out.println("TestBean2의 생성자 입니다.");
	}
}

/*
 하나만 생성하여 사용할 경우 type을 이용하는 방법이 가장 효울적이다.
 같은 빈 클래스에서 여러개의 다른 주소의 객체를 생성할 경우 BeanConfigClass에 등록하여 사용하므로 바람직하지 않다. 
 */
 