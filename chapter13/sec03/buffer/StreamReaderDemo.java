package sec03.buffer;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreamReaderDemo {

	public static void main(String[] args) {
		String input = "C:\\Temp\\org.txt";

		try (FileInputStream fi = new FileInputStream(input);
				InputStreamReader in = new InputStreamReader(fi, "UTF-8")) {
			int c;
			System.out.println(in.getEncoding());
			while ((c = in.read()) != -1)
				System.out.println((char) c);

		} catch (IOException e) {

		}

	}

}
