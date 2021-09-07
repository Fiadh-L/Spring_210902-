package kr.co.softsoldesk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.co.softsoldesk.beans.DataBean1;
import kr.co.softsoldesk.beans.DataBean2;
import kr.co.softsoldesk.beans.DataBean3;
import kr.co.softsoldesk.beans.DataBean4;
import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;
import kr.co.softsoldesk.beans.TestBeans2;

@Configuration
public class BeanConfigClass {
	
	//#1
	@Bean
	public TestBean1 java1() {
		return new TestBean1();
	}
	
	@Bean
	public DataBean1 data_bean1() {
		return new DataBean1();
	}
	
	//#3 자동주입으로 선언 생략
	
	@Bean
	public DataBean2 obj4() {
		return new DataBean2();
	}
	
	@Bean
	public DataBean2 obj5() {
		return new DataBean2();
	}
	
	//#6 등록되어 있지 않으면 자동주입이 되지 않음
	/*@Bean
	public DataBean2 obj6() {
		return new DataBean2();
	}*/
	
	//TestBean2
	@Bean
	public TestBean2 java2() {
		return new TestBean2();
	}
	
	@Bean
	public TestBeans2 javas2() {
		return new TestBeans2();
	}
	
	@Bean
    public DataBean3 data_bean3() {
       return new DataBean3();
	}
	
    @Bean
    public DataBean4 data_bean4() {
       return new DataBean4();
    }
}