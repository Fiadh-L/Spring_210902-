package kr.co.softsoldesk.bean;

public class SamSungTV implements TV{
	
	public SamSungTV() {
		// TODO Auto-generated method stub
		System.out.println("==>SamSungTV 객체생성");
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("SamSungTV 전원을 켭니다.");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("SamSungTV 전원을 끕니다.");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("SamSungTV 볼륨을 높입니다.");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("SamSungTV 볼륨을 낮춥니다.");
	}
	
}
