package iodemos;

import java.io.File;
import java.io.IOException;

public class Demo3 {

	public static void main(String[] args) throws IOException {
		
		File file =new File("mohan.txt");//if location is not given(creates in prgm folder itself)
		file.createNewFile();
		
		System.out.println("done");
	}

}
