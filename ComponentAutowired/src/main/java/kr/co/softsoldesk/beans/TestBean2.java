package kr.co.softsoldesk.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestBean2 {

	private int data1;
	private String data2;
	private DataBean4 data3;
	private DataBean5 data4;
	
	//required가 5.대 버전에서 사용되지 않고 생성자를 통해서 필수 setting을 권장함
	public TestBean2(@Value("2021")int data1, @Value("Soldesk")String data2, DataBean4 data3, DataBean5 data4) {
		this.data1=data1;
		this.data2=data2;
		this.data3=data3;
		this.data4=data4;
	}
	
	public int getData1() {
		return data1;
	}
	public String getData2() {
		return data2;
	}
	public DataBean4 getData3() {
		return data3;
	}
	public DataBean5 getData4() {
		return data4;
	}
	
	
}
