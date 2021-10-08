package filehandling;

import java.io.File;

public class GetInfoFile {

	public static void main(String args[]) {
		File obj = new File("");
		if (obj.exists()) {
			System.out.println("File Name " + obj.getName());
			System.out.println("File Absolute Path : " + obj.getAbsolutePath());
			System.out.println("Can Write ? " + obj.canWrite());
			System.out.println("Can Read ? " + obj.canRead());
			System.out.println("Length " + obj.length());
		} else
			System.out.println("File does not exists!");
	}
}
