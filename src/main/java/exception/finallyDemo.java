package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class finallyDemo {

	public static void main(String[] args) {
		String filePath = "F://Sofi Learning//Career Learning//SDET Training//Advanced Java//Advanced Java.txt";
		System.out.println("Hello");
		try {
		FileReader read = new FileReader(filePath);
		}
		catch(FileNotFoundException fNFE) {
			System.out.println("FileNotFoundException");
		}
		finally {
			System.out.println("Here, I execute without any problem");
		}
	}

}
