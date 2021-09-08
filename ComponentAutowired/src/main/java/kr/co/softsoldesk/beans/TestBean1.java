package kr.co.softsoldesk.beans;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TestBean1 {
	
	@Autowired
	private DataBean1 data1;
	//component 처리해서 스캔으로 올려두고 autowired를 설정해서 set을 생략함!
	//ex 셀랙트 문이 들어와 있음!
	
	@Autowired
	@Qualifier("obj2")
	private DataBean2 data2;
	
	
	//JSR250에서 제공함!!!
	@Resource(name="obj3")
	private DataBean3 data3;
	//DataBean3에 등록되어 있지 않은 이름이므로 컨피그에 등록해줘야 함!
	@Resource(name="obj4")
	private DataBean3 data4;
	@Resource(name="obj5")
	private DataBean3 data5;
	
	
	public DataBean1 getData1() {
		return data1;
	}

	public DataBean2 getData2() {
		return data2;
	}

	public DataBean3 getData3() {
		return data3;
	}

	public DataBean3 getData4() {
		return data4;
	}

	public DataBean3 getData5() {
		return data5;
	}
	
	
	
}
