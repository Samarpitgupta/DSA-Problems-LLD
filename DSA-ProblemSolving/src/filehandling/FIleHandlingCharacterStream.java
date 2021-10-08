package filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FIleHandlingCharacterStream {

	public static void main(String args[]) throws IOException {
		FileReader in = null;
		FileWriter out = null;

		in = new FileReader("input.txt");
		out = new FileWriter("output.txt");

		int c;
		while ((c = in.read()) != -1) {
			out.write(c);
		}
		if (in != null)
			in.close();
		if (out != null)
			out.close();

	}

}
