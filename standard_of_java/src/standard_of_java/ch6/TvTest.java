package standard_of_java.ch6;

/**
 *  객체지향 프로그래밍<br/>
 *  author : Daniel Lee<br/><br/>
 *  
 *	인스턴스화 : 클래스로부터 객체를 만드는 과정(new)<br/>
 *  인스턴스 : 클래스로부터 만들어진 객체<br/>
 *  
 *  기본형 변수는 해당 기본값으로<br/>
 *  참조형 변수는 null로 초기화된다<br/>
 *  
 */
class Tv {
	
	String color;   // 색상
	boolean power ; // 전원
	int channel;    // 채널
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
	
}

public class TvTest {

	public static void main(String[] args) {
		
		Tv t = new Tv();
		t.channel = 7;
		t.channelDown();
		System.out.println( "tv의 채널 : "  + t.channel );
		
	}
	
}
