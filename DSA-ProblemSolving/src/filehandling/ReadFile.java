package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String args[]) throws FileNotFoundException {

		File obj = new File("D:\\");
		Scanner reader = new Scanner(obj);
		while (reader.hasNextLine()) {
			String data = reader.nextLine();
			System.out.println(data);
		}
		reader.close();

	}
}
