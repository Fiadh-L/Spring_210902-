package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;
import kr.co.softsoldesk.beans.TestBean3;

public class MainClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		System.err.println("----------생성자를 통한 주입----------");
		TestBean1 xml1= ctx.getBean("xml1", TestBean1.class);
		System.out.printf("xml1 : %d\n", xml1.getData1());
		System.out.printf("xml2 : %s\n", xml1.getData2());
		System.out.printf("xml3 : %s\n", xml1.getData3());
		
		System.err.println("----------setter를 통한 주입----------");
		TestBean1 xml2= ctx.getBean("xml2", TestBean1.class);
		System.out.printf("xml2 : %d\n", xml2.getData1());
		System.out.printf("xml2 : %s\n", xml2.getData2());
		System.out.printf("xml2 : %s\n", xml2.getData3());
		
		System.err.println("----------autowire=byName을 통한 주입----------");
		TestBean2 xml3= ctx.getBean("xml3", TestBean2.class);
		System.out.printf("xml3 : %s\n", xml3.getData1());
		System.out.printf("xml3 : %s\n", xml3.getData2());
		
		System.err.println("----------autowire=byType을 통한 주입----------");
		TestBean3 xml4= ctx.getBean("xml4", TestBean3.class);
		System.out.printf("xml4 : %s\n", xml4.getData1());
		System.out.printf("xml4 : %s\n", xml4.getData2());
		
	}

}
