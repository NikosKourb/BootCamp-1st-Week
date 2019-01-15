package cb;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyFileWriter {
	public static void main(String[] args) {
		PrintWriter writer;
		try {
			writer = new PrintWriter("the-file-name.txt", "UTF-8");
			writer.println("The first line");
			writer.println("The second line");
			writer.close();
		} catch (UnsupportedEncodingException | FileNotFoundException ex) {
			Logger.getLogger(MyFileWriter.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
