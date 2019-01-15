package cb;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {

	public static void main(String[] args) {
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("the-file-name.txt"));
			String line;
			line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
