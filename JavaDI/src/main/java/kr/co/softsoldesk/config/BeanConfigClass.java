package kr.co.softsoldesk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.co.softsoldesk.beans.DataBean1;
import kr.co.softsoldesk.beans.TestBean1;

@Configuration
public class BeanConfigClass {
	
	//생성자를 통한 주입
	@Bean
	public TestBean1 java1() {
		return new TestBean1(200, "solDesk1", new DataBean1());
	}
	
	@Bean
	public TestBean1 java2() {
		TestBean1 t1 = new TestBean1();
		t1.setData1(200);
		t1.setData2("solDesk2");
		t1.setData3(new DataBean1());
		
		return t1;
	}
}
