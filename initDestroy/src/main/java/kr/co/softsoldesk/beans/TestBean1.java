package kr.co.softsoldesk.beans;

public class TestBean1 {
	
	public TestBean1() {
		System.err.println("TestBean1의 생성자");
		
	}
	
	public void init() {
		System.err.println("TestBean1의 init메서드");
	}
	
	public void destroy() {
		System.err.println("TestBean1의 destroy메서드");
	}
}
