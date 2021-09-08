package kr.co.softsoldesk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;
import kr.co.softsoldesk.beans.TestBean3;
import kr.co.softsoldesk.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		//만약에 component처리가 되어 있지 않다면 databean > beanconifg> main인데, databean > testbean> main
		TestBean1 t1 =ctx.getBean(TestBean1.class);
		System.out.printf("t1.data1 : %s\n", t1.getData1());
		System.out.printf("t1.data2 : %s\n", t1.getData2());
		//이름을 따로 부여했기 때문에 싱글톤이 아님!
		System.out.printf("t1.data3 : %s\n", t1.getData3());
		System.out.printf("t1.data4 : %s\n", t1.getData4());
		System.out.printf("t1.data5 : %s\n", t1.getData5());
		
		System.out.println("=================================================================");
		TestBean2 t2 =ctx.getBean(TestBean2.class);
		System.out.printf("t2.data1 : %s\n", t2.getData1());
		System.out.printf("t2.data2 : %s\n", t2.getData2());
		System.out.printf("t2.data3 : %s\n", t2.getData3());
		System.out.printf("t2.data4 : %s\n", t2.getData4());
		
		System.out.println("=================================================================");
		//컴포넌트 처리가 되어 있어도 빈컨피그에 재선언을 한 경우, 타입이 아닌 이름으로 불러와야 함!
		TestBean3 t3 =ctx.getBean("java3", TestBean3.class);
		System.out.printf("t3.data1 : %s\n", t3.getData1());
		System.out.printf("t3.data2 : %s\n", t3.getData2());
		System.out.printf("t3.data3 : %s\n", t3.getData3());
		System.out.printf("t3.data4 : %s\n", t3.getData4());
		ctx.close();
	}
}
