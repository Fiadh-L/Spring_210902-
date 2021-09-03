package kr.co.softsoldesk.beans;

public class TestBean2 {

	public TestBean2() {
		System.out.println("TestBean2의 생성자");
		
		//여기에 만들어두는 메서드는 생성자가 생성될때 무조건 컴파일 하고 들어감!
	}
	
	public void default_init() {
		System.out.println("TestBean2의 init메서드");
	}
	
	// 메모리 끊고 나간 이후
	public void default_destroy() {
		System.out.println("TestBean2의 destroy메서드");
	}
}
