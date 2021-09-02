package kr.co.softsoldesk.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import kr.co.softsoldesk.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//로딩하자마자 객체가 만들어지지는 않는다
		test1();
		System.out.println("------------------------------");
		test2();
		System.out.println("------------------------------");
		test3();
		System.out.println("------------------------------");
		test4();
		
	}
	
	public static void test1() {
		//경로만 설정해줌! 객체를 만들어야지만 사용이 가능함!
		ClassPathResource res = new ClassPathResource("kr/co/softsoldesk/config/beans.xml");
		//경로지정 후 객체가 생성되어야 함
		XmlBeanFactory factory = new XmlBeanFactory(res);
		
		//#2 getBean에 의해서 객체가 생성됨
		TestBean t1=factory.getBean("t1", TestBean.class);
		System.out.printf("t1 : %s\n", t1);
		
		//#3 이미 생성된 객체에 대한 정보가 컨테이너에 보관되어 있음
		TestBean t2=factory.getBean("t1", TestBean.class);
		System.out.printf("t2 : %s\n", t2);
		
	}
	
	//#4 외부 빈즈
	public static void test2() {
		FileSystemResource res = new FileSystemResource("beans.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);
		
		TestBean t3 = factory.getBean("t2", TestBean.class);
		System.out.printf("t3 : %s\n", t3);
		
		TestBean t4 = factory.getBean("t2", TestBean.class);
		System.out.printf("t4 : %s\n", t4);
	}
	
	//#5
	public static void test3() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		//#2 getBean에 의해서 객체가 생성됨
		TestBean t5=ctx.getBean("t1", TestBean.class);
		System.out.printf("t5 : %s\n", t5);
		
		//#3 이미 생성된 객체에 대한 정보가 컨테이너에 보관되어 있음
		TestBean t6=ctx.getBean("t1", TestBean.class);
		System.out.printf("t6 : %s\n", t6);
		
		ctx.close(); //로딩하자마자 호출됨
		
	}
	//#6 외부패키지
	public static void test4() {
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("beans.xml");
		TestBean t7 = ctx.getBean("t2", TestBean.class);
		System.out.printf("t7 : %s\n", t7);
		TestBean t8 = ctx.getBean("t2", TestBean.class);
		System.out.printf("t8 : %s\n", t8);
		ctx.close();
	}
}
