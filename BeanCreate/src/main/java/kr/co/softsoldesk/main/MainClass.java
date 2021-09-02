package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//#1
		ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		System.out.println("--------------------------------------");
		//#2
		TestBean test1 = cxt.getBean("test1", TestBean.class);
		System.out.printf("test1 : %s\n", test1);
		System.out.println("--------------------------------------");
		TestBean test2 = cxt.getBean("test1", TestBean.class);
		System.out.printf("test2 : %s\n", test2);
		System.out.println("--------------------------------------");
		// #3
		TestBean test3 = cxt.getBean("test3", TestBean.class);
		System.out.printf("test3 : %s\n", test3);
		TestBean test4 = cxt.getBean("test3", TestBean.class);
		System.out.printf("test4 : %s\n", test4);
		System.out.println("--------------------------------------");
		//#4
		TestBean test5 = cxt.getBean("test4", TestBean.class);
		System.out.printf("test5 : %s\n", test5);
		TestBean test6 = cxt.getBean("test4", TestBean.class);
		System.out.printf("test6 : %s\n", test6);
		cxt.close();
	}

}
