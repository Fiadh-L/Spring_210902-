package kr.co.softsoldesk.beans;

public class AppleSpeaker {

	public AppleSpeaker() {
		System.out.println("===>Applespeaker 객체생성");
	}
	
 	public void volumeUp(){
        System.out.println("AppleSpeaker---소리 올린다.");
    }        
    public void volumeDown(){
        System.out.println("AppleSpeaker---소리 내린다.");
    }
}
