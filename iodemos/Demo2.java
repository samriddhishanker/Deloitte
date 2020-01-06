package iodemos;

import java.io.File;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) throws IOException {
		File file = new File("e:\\deloitte\\Batch\\BatchMates.txt");//points to the file
		file.createNewFile();
		File folder=new File("e:\\Deloitte\\Batch");
		File f[]=folder.listFiles();
		for(File f1:f)
		{
			if(f1.isFile())
				System.out.println("The file is: "+f1.getName());
			if(f1.isDirectory())
				System.out.println("The directory is: "+f1.getName());
		}
	}
}
