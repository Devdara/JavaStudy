package standard_of_java.ch2;

/**
 *  변수타입(Variable)<br/>
 *  author : Daniel Lee<br/><br/>
 *  
 *  기본형(primitive type)<br/>
 *  -계산을 위한 실제값을 저장한다
 *  -논리형(boolean) : 1byte<br/>
 *  -문자형(char) : 2byte<br/>
 *  -정수형(byte : 1byte, short : 2byte, int : 4byte, long : 8byte)<br/>
 *  -실수형(float : 4byte, double : 8byte)<br/><br/>
 *  참조형(reference type)<br/>
 *  -객체의 주소를 저장한다, 기본형을 제외한 나머지타입
 */
public class VarEx02 {

	public static void main(String[] args) {
		
		int year = 2020;
		int month = 12;
		
		System.out.println( "year : " + year );
		System.out.println( "month : " + month );
		
	}

}
