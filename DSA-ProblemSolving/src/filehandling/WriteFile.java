package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		FileWriter writer = new FileWriter("D://");
		try {
			writer.write("I love programming.");
			writer.close();
			System.out.println("File written successfully!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
