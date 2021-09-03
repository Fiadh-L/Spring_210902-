package kr.co.softsoldesk.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class TestBeanPostProcessor implements BeanPostProcessor{
	
	
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//		System.out.println("Before"); //관리자가접속하면 이거 멤버가 접속하면 저거
//		if(beanName.equals("t1")) {
//			System.out.println("bean1_Before");
//		}else if(beanName.equals("t2")) {
//			System.out.println("bean2_Before");
//		}
//		
		switch(beanName) {
		case "t1":
			System.out.println("bean1_Before");
			break;
			
		case "t2":
			System.out.println("bean2_Before");
			break;
		}	
		return bean;
			
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("After");
		
		return bean;
	}
	
}
