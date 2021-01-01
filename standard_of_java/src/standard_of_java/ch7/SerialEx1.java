package standard_of_java.ch7;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialEx1 {

	public static void main(String[] args) {
		
		try {
			
			String fileName = "UserInfo.ser";
			FileOutputStream fos = new FileOutputStream( fileName );
			BufferedOutputStream bos = new BufferedOutputStream( fos );
			ObjectOutputStream oos = new ObjectOutputStream( bos );
			
			UserInfo u1 = new UserInfo("AAA", "1234", 3);
			UserInfo u2 = new UserInfo("BBB", "4444", 11);
			
			oos.writeObject(u1);
			oos.writeObject(u2);
			oos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
