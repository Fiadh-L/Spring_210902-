package kr.co.softsoldesk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.co.softsoldesk.beans.DataBean3;
import kr.co.softsoldesk.beans.DataBean4;
import kr.co.softsoldesk.beans.DataBean5;
import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;
import kr.co.softsoldesk.beans.TestBean3;

@Configuration
@ComponentScan(basePackages = "kr.co.softsoldesk.beans")
public class BeanConfigClass {
	
	//TestBean1은 @ComponentScan이 되어 있기 때문에 빈 등록을 생략
	//JSR250을 이용하여 이름을 부여받았으나 빈에 등록해야 한다
	@Bean
	public DataBean3 obj4() {
		return new DataBean3();
	}
	
	@Bean
	public DataBean3 obj5() {
		return new DataBean3();
	}
	//클래스에 선언된 값이 아닌 다른 값을 선언할 때
	@Bean
	public TestBean3 java3() {
		TestBean3 t3 = new TestBean3(2022, "KoreaIT", new DataBean4(), new DataBean5());
		
		return t3;
	}
}
