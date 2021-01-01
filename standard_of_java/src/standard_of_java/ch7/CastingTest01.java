package standard_of_java.ch7;

/**
 *  캐스팅<br/>
 *  author : Daniel Lee<br/><br/>
 *  
 *	Up-castinng : 자손타입 -> 조상타입 (형변환 생략가능)<br/>
 *  Down-castinng : 조상타입 -> 자손타입 (형변환 생략불가)<br/>
 *  
 */
public class CastingTest01 {

	public static void main(String[] args) {
		
		FireEngine fe = new FireEngine();
		fe.water();
		
		Car car = fe;
		
		FireEngine fe2 = new FireEngine();
		Car car2 = new Car();
		
		Car car3 = new FireEngine();
		car3.drive();
		
	}

}

class Car{
	
	String color;
	int door;
	
	void drive() { System.out.println("운전시작"); }
	void stop() { System.out.println("정지!"); }
	
}

class FireEngine extends Car{
	
	void water() { System.out.println("살수포!"); }
	
}