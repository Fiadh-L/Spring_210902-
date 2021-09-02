package kr.co.softsoldesk.bean;

public class SolDeskTV implements TV{
	public SolDeskTV() {
		System.out.println("==>SolDeskTV 객체생성");
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("SolDestTV 전원을 켭니다.");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("SolDestTV 전원을 끕니다.");
		
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("SolDestTV 볼륨을 높입니다.");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("SolDestTV 볼륨을 낮춥니다.");
	}
}
