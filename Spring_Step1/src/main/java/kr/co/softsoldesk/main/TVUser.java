package kr.co.softsoldesk.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.co.softsoldesk.bean.HelloWorld;
import kr.co.softsoldesk.bean.TV;

public class TVUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		TV samTV = (TV)ctx.getBean("bsamTV");
		watchingTV(samTV);
		System.out.println("---------------------------");
		TV solTV = ctx.getBean("bsolTV",TV.class);
		watchingTV(solTV);
		
		ctx.close();
	}
	
	public static void watchingTV(TV tv) {
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
	}

}
