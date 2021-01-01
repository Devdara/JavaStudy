package standard_of_java.ch6;

/**
 *  기본 생성자( default constructor )<br/>
 *  author : Daniel Lee<br/><br/>
 *  
 *	정의되어있는 생성자가 하나도 없을때 컴파일러가 기본생성자를 자동 추가해준다
 *  
 */
class Data1 {
	
	int value ;   
	
}

class Data2 {
	
	int value ;
	
	Data2( int x ){
		value = x;
	}
	
}

public class ConstructorTest {

	public static void main(String[] args) {
		
		Data1 d1 = new Data1();
		Data2 d2 = new Data2();
		
	}
	
}
