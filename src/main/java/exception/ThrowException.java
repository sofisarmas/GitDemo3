package exception;

import java.io.FileNotFoundException;

public class ThrowException {

	public static void main(String[] args) throws FileNotFoundException {
		
		throw new FileNotFoundException();
	}

}
