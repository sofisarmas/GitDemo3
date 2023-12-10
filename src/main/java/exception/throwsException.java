package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class throwsException  {

	public static void main(String[] args) throws FileNotFoundException{
		String fileName = "F://Sofi Learning//Career Learning//SDET Training//Advanced Java//Advanced Java.txt";
		FileReader reader = new FileReader(fileName);
	}

}
