package standard_of_java.ch6;

/**
 *  변수의 종류<br/>
 *  author : Daniel Lee<br/><br/>
 *  
 *	전역변수(인스턴스변수) : 인스턴스가 생성되었을때 생성<br/>
 *  지역변수 : 변수선언문이 수행되었을때 생성<br/>
 *  static(클래스)변수 : 클래스가 메모리에 올라갈때 생성<br/><br/>
 *  
 *  static변수는 인스턴스가 같은 저장공간을 공유
 *  
 */
class Card {
	
	String kind;  
	int number ;  
	static int width = 100; 
	static int height = 250; 
	
}

public class CardTest {

	public static void main(String[] args) {
		
		Card c1 = new Card();
		c1.kind = "하트";
		c1.number = 6;
		
		Card c2 = new Card();
		c2.kind = "스페이드";
		c2.number = 2;
		
		System.out.println("c1의 종류 " + c1.kind + " " + c1.number + ", 넓이 : " + c1.width + ", 높이 : " + c1.height );
		System.out.println("c2의 종류" + c2.kind + " " + c2.number + ", 넓이 : " + c2.width + ", 높이 : " + c2.height );
		c1.width = 111;
		c2.height = 222;
		System.out.println("c1의 종류" + c1.kind + " " + c1.number + ", 넓이 : " + c1.width + ", 높이 : " + c1.height );
		System.out.println("c2의 종류" + c2.kind + " " + c2.number + ", 넓이 : " + c2.width + ", 높이 : " + c2.height );
		
	}
	
}
