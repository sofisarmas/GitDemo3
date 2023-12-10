package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryCatchException {

	public static void main(String[] args) {
		String filePath = "://Sofi Learning//Career Learning//SDET Training//Advanced Java//Advanced Java.txt";
		try {
			FileReader reader = new FileReader(filePath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("FileNotFoundException s");
		}
		catch (Exception en) {
			System.out.println("Hello, HI");
		}
	}

}
