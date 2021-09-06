package kr.co.softsoldesk.beans;

public class SamsungTV implements TV{
	
	private SonySpeaker sonySpeaker;
	private int price;
	
	public SamsungTV(SonySpeaker sonySpeaker, int price) {
		System.out.println("SamsungTV 객체 생성");
		this.sonySpeaker=sonySpeaker;
		this.price=price;
	}

	@Override
	public void powerOn() {
		System.out.println("삼성티비 전원켜짐");
		System.out.println("가격 :" + price);
	}

	@Override
	public void powerOff() {
		System.out.println("삼성티비 전원꺼짐");
	}

	@Override
	public void volumeUp() {
		sonySpeaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		sonySpeaker.volumeDown();
	}
	
	
}
