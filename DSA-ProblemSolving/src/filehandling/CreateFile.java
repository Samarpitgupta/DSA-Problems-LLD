package filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {

		try {
			File obj = new File("");
			if (obj.createNewFile())
				System.out.println(obj.getName());
			else
				System.out.println("File already exists");
		} catch (Exception e) {
		}
	}

}
