package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.bean.HelloWorld;
import kr.co.softsoldesk.bean.HelloWorldEn;
import kr.co.softsoldesk.bean.HelloWorldKo;

public class MainClass {
	
	public static void main(String[] args) {
		
		//객체 사용을 위해 패스에 올려만 둠
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		HelloWorld hwen = (HelloWorld)ctx.getBean("bhwen");
		callMethod(hwen);
		HelloWorld hwko = ctx.getBean("bhwko", HelloWorld.class);
		callMethod(hwko);
		
		ctx.close();
	}
	
	public static void callMethod(HelloWorld hello) {
		hello.sayhello();
	}
}

/*		
		HelloWorldEn hwen = new HelloWorldEn();
		callMethod(hwen);
		HelloWorldKo hwko = new HelloWorldKo();
		callMethod(hwko);
		
		hwen.sayhello();
		hwko.sayhello();
		
	}
	
	public static void callMethod(HelloWorld hello) {
		hello.sayhello();
	}
}
*/