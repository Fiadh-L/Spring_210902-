package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		TestBean bean1 = ctx.getBean("xml1", TestBean.class);
		//bean1.method1(); >첫번째 실습
		
		//반환값 가져오는 메서드는 after가 실행된 후 값을 받아옴
		int a1= bean1.method1();
		System.out.println("method1-a1 : " + a1);
		
		ctx.close();
	}
}
