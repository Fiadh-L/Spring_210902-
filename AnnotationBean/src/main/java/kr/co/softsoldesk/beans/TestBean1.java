package kr.co.softsoldesk.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Bean;

public class TestBean1 {

	private int data1;
	private DataBean1 data2;
	
	@Autowired
	private DataBean1 data3;
	//autowired 올리는 순간 setter 메서드가 추가됨! autowired 선언하면 실질적으로 getter만 추가! 
	
	@Autowired
	@Qualifier("obj4")
	private DataBean2 data4;
	
	@Autowired
	@Qualifier("obj5")
	private DataBean2 data5;
	
	@Autowired(required=false)
	@Qualifier("obj6")
	private DataBean2 data6;
	
	public int getData1() {
		return data1;
	}
	
	//@Required: 반드시 주입해야 하는 속성, spring 5.1이상에서는 사요오디지 않음
	//반드시 주입되어야 하는 속성은 생성자를 이용
	@Required
	public void setData1(int data1) {
		this.data1 = data1;
	}
	
	public DataBean1 getData2() {
		return data2;
	}
	
	@Autowired
	public void setData2(DataBean1 data2) {
		this.data2 = data2;
	}

	public DataBean1 getData3() {
		return data3;
	}
	
	public DataBean2 getData4() {
		return data4;
	}

	public DataBean2 getData5() {
		return data5;
	}

	public DataBean2 getData6() {
		return data6;
	}

}
