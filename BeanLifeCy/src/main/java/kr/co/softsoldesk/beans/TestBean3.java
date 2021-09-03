package kr.co.softsoldesk.beans;

public class TestBean3 {
	
	public TestBean3() {
		System.out.println("TestBean3의 생성자");
	}
	
	public void bean3_init() {
		System.out.println("TestBean3의 bean_init메서드1");
	}
	
	// 메모리 끊고 나간 이후
	public void bean3_destroy() {
		System.out.println("TestBean3의 bean_destroy메서드1");
	}
	
	public void default_init() {
		System.out.println("TestBean3의 default_init메서드2");
	}
	
	// 메모리 끊고 나간 이후
	public void default_destroy() {
		System.out.println("TestBean3의 default_destroy메서드2");
	}
}
