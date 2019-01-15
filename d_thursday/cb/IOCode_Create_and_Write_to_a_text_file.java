package cb;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IOCode_Create_and_Write_to_a_text_file {

	public static void main(String[] args) throws IOException {

//Creates a txt file named "the-file-name.txt" in the same folder that the src folder is
//example in this case the path tha the file is saved is :
//C:\Users\NIKOS\Desktop\Internet Downloads\SOFTWARE\JAVA\Lesson_04_11-10-2018-Recap\Lesson_04-All
//the txt file has two lines written in it "The first line" and "The second line"
		
		PrintWriter writer;
		
		try {
			writer=new PrintWriter("the-file-name.txt","UTF-8");
			writer.println("The first line");
			writer.println("The second line");
			writer.close();
		}
		catch (UnsupportedEncodingException ex) {
			Logger.getLogger(IOCode_Create_and_Write_to_a_text_file.class.getName()).log(Level.SEVERE, null,ex);
		}

//Prints out all the text of the txt file 

		String line=null;
		BufferedReader br=new BufferedReader(new FileReader("the-file-name.txt"));
		
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();

//Can be done with try and catch
/*		try {
			br=new BufferedReader(new FileReader("C:\\Users\\NIKOS\\Desktop\\Lesson_03-Recap\\10-10-2018\\the-file-name.txt"));
			String line;
			line =br.readLine();
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
		}

*/

     }
}

