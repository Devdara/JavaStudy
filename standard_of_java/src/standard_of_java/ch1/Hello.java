package standard_of_java.ch1;

/**
 *  java의 실행과정<br/>
 *  author : Daniel Lee<br/><br/>
 *  
 *  Hello.java 작성 -> 자바컴파일러(javac.exe)를 통해 클래스파일(Hello.class) 생성 -> 자바 인터프리터(java.exe)로 실행<br/><br/>
 *  
 *  Java 애플리케이션은 main메서드가 시작점이므로<br/>
 *  Java 애플리케이션을 실행할때는 main메서드를 포함한 클래스가 존재해야한다<br/>
 *
 */
public class Hello {

	public static void main(String[] args) {
		
		System.out.println( "Hello, World." );
		
	}

}
