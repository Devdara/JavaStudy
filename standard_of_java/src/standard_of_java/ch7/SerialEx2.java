package standard_of_java.ch7;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerialEx2 {

	public static void main(String[] args) {
		
		try {
			
			String fileName = "UserInfo.ser";
			FileInputStream fis = new FileInputStream( fileName );
			BufferedInputStream bis = new BufferedInputStream( fis );
			ObjectInputStream ois = new ObjectInputStream( bis );
			
			UserInfo u1 = (UserInfo)ois.readObject();
			UserInfo u2 = (UserInfo)ois.readObject();

			System.out.println( u1 );
			System.out.println( u2 );
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
