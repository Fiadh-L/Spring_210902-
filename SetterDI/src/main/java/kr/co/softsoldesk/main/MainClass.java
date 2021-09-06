package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.TV;
import kr.co.softsoldesk.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		TestBean obj1 = new TestBean();
		obj1.setData1(100);
		
		TestBean t1 = ctx.getBean("t1", TestBean.class);
		System.out.printf("t1.getData1 : %d\n", t1.getData1());
		System.out.printf("t1.getData2 : %f\n", t1.getData2());
		System.out.printf("t1.getData3 : %s\n", t1.isData3());
		System.out.printf("t1.getData4 : %s\n", t1.getData4());
		System.out.printf("t1.getData5 : %s\n", t1.getData5());
		System.out.printf("t1.getData6 : %s\n", t1.getData6());
		
		System.out.println("--------------------------------");
		TV tv = (TV)ctx.getBean("tv");
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
		
		ctx.close();
		
	}

}
