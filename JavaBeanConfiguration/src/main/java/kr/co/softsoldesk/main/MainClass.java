package kr.co.softsoldesk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;
import kr.co.softsoldesk.beans.TestBean3;
import kr.co.softsoldesk.beans.TestBean4;
import kr.co.softsoldesk.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("======================Xml======================");
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		System.err.println("--xml방식으로 주소값 가져오기--");
		TestBean1 xml1 = ctx1.getBean("xml1", TestBean1.class);
		System.out.printf("xml1 : %s\n", xml1);
		TestBean1 xml11 = ctx1.getBean("xml1", TestBean1.class);
		System.out.printf("xml11 : %s\n", xml11);
		
		System.err.println("----------lazy----------");
		System.out.println("--lazy-true 방식으로 주소값 가져오기--");
		TestBean2 xml2 = ctx1.getBean("xml2", TestBean2.class);
		System.out.printf("xml2 : %s\n", xml2);
		TestBean2 xml22 = ctx1.getBean("xml2", TestBean2.class);
		System.out.printf("xml22 : %s\n", xml22);
		
		System.err.println("----------prototype----------");
		System.out.println("--lazy-true 방식으로 주소값 가져오기--");
		TestBean3 xml3 = ctx1.getBean("xml3", TestBean3.class);
		System.out.printf("xml3 : %s\n", xml3);
		TestBean3 xml33 = ctx1.getBean("xml3", TestBean3.class);
		System.out.printf("xml33 : %s\n", xml33);
		
		System.err.println("----------primary를 이용해서 클래스 중복시 정상적인 주소값가져오기----------");
		TestBean4 t4 = ctx1.getBean(TestBean4.class);
		System.out.printf("t4 : %s\n", t4);

		
		ctx1.close();
		System.out.println();
		
		System.out.println("======================Annotation======================");
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		System.err.println("--java방식으로 주소값 가져오기--");
		//메서드 명으로 주소값 가져옴, scope를 주지 않아 싱글톤이므로 주소값이 같음
		TestBean1 java1 = ctx2.getBean("java1", TestBean1.class); 
		System.out.printf("java1 : %s\n\n", java1);
		TestBean1 java11 = ctx2.getBean("java1", TestBean1.class);
		System.out.printf("java11 : %s\n\n", java11);
		
		System.err.println("---Annotation에 지정된 이름으로 주소값 가져오기---");
		TestBean1 java600 = ctx2.getBean("java600", TestBean1.class);
		System.out.printf("java600 : %s\n\n", java600);
		System.out.println();

		System.err.println("--lazy-java방식으로 주소값 가져오기--");
		//메서드 명으로 주소값 가져옴, scope를 주지 않아 싱글톤이므로 주소값이 같음
		TestBean2 java2 = ctx2.getBean("java2", TestBean2.class); 
		System.out.printf("java2 : %s\n\n", java2);
		System.out.println("싱글톤이므로 같은 주소값 반환");
		TestBean2 java22 = ctx2.getBean("java2", TestBean2.class);
		System.out.printf("java22 : %s\n\n", java22);
		
		System.err.println("---prototype을 이용해서 서로 다른 주소 변환---");
		TestBean3 java3 = ctx2.getBean("java3", TestBean3.class);
		System.out.printf("java3 : %s\n\n", java3);
		TestBean3 java33 = ctx2.getBean("java3", TestBean3.class);
		System.out.printf("java33 : %s\n\n", java33);
		System.out.println();
		
		System.err.println("---primary를 이용해서 중복시 정상적인 주소 변환---");
		//primary가 안걸린걸 불러옴!
		TestBean4 java4 = ctx2.getBean(TestBean4.class);
		System.out.printf("java4 : %s\n\n", java4);
		System.out.println();
		
		ctx2.close();
	}

}
