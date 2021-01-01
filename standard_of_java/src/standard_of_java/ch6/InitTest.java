package standard_of_java.ch6;

/**
 *  변수의 초기화<br/>
 *  author : Daniel Lee<br/><br/>
 *  
 *	전역변수(인스턴스변수) : 인스턴스가 생성되었을때 생성<br/>
 *  지역변수 : 변수선언문이 수행되었을때 생성<br/>
 *  static(클래스)변수 : 클래스가 메모리에 올라갈때 생성<br/><br/>
 *  
 *  static변수는 인스턴스가 같은 저장공간을 공유<br/><br/>
 *  
 *  멤버변수(클래스변수, 인스턴스변수)의 초기화는 선택적<br/>
 *  why?멤버변수는 해당 기본값으로<br/>
 *  지역변수의 초기화는 필수적<br/>
 *  why?지역변수는 null로 초기화된다<br/>
 *  
 */ class InitTest {
	
	int x;
	int y = x;

	public static void main(String[] args) {
		
		Tv t = new Tv();
		t.channel = 7;
		t.channelDown();
		System.out.println( "tv의 채널 : "  + t.channel );
		
	}
	
}
