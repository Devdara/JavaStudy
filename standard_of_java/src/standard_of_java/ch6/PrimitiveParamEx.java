package standard_of_java.ch6;

/**
 *  기본형 매개변수<br/>
 *  author : Daniel Lee<br/><br/>
 *  
 *	기본형 매개변수 - 변수의 값을 읽기만 할 수 있다<br/>
 *	참조형 매개변수 - 변수의 값을 읽고 변경할 수 있다<br/>
 *  
 */
class Data {
	
	int x ;   
	
}

public class PrimitiveParamEx {

	public static void main(String[] args) {
		
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x );
		
		change( d.x );
		System.out.println( "After change(d.x)" );
		System.out.println( "main() : x = " + d.x );
		
		change( d );
		
	}
	
	static void change( int x ) {
		x = 1000;
		System.out.println( "change() : x = "  + x );
	}
	
	static void change( Data paramData ) {
		paramData.x = 1000;
		System.out.println( "change() : x = "  + paramData.x );
	}
	
}
