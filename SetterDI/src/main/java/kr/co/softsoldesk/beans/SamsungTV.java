package kr.co.softsoldesk.beans;

public class SamsungTV implements TV{

	private AppleSpeaker speaker;
	private int price;
	
	public SamsungTV() {
		
	}
	
	public SamsungTV(AppleSpeaker speaker, int price) {
		System.out.println("===> SamsungTV 객체생성");
		this.speaker=speaker;
		this.price=price;
	}
	
	
	public AppleSpeaker getSpeaker() {
		return speaker;
	}
	public void setSpeaker(AppleSpeaker speaker) {
		this.speaker = speaker;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("삼성 전원킴");
		System.out.println("price : " + price);
		
	}
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("삼성 전원끔");
		
	}
	public void volumeUp() {
		// TODO Auto-generated method stub
		speaker.volumeUp();
		
	}
	public void volumeDown() {
		// TODO Auto-generated method stub
		speaker.volumeDown();
	}
	
	
}
