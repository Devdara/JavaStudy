package standard_of_java.ch2;

/**
 *  변수(Variable)<br/>
 *  author : Daniel Lee<br/><br/>
 *  
 *	변수의 초기화<br/>
 *  -변수를 사용하기전에 처음으로 값을 저장하는것
 *  
 *  변수명명 규칙<br/>
 *  1.대소문자가 구분되며 길이에 제한이 없다<br/>
 *  2.예약어를 사용할 수 없다<br/>
 *  3.숫자로 시작할 수 없다<br/>
 *  4.특수문자는 '_'와 '$'만 허용한다
 *
 */
public class VarEx01 {

	public static void main(String[] args) {
		
		int year = 2020;
		int month = 12;
		
		System.out.println( "year : " + year );
		System.out.println( "month : " + month );
		
	}

}
