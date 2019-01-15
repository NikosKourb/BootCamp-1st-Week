package cb;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;
import java.io.FileNotFoundException;



public class Personal_Info_to_TXT {

	public static void main(String[] args) {
		
		System.out.print("What is you Firstname ? : ");
		
		Scanner ScanInput=new Scanner(System.in);
		String Name=ScanInput.nextLine();
		
		System.out.print(Name+" what is you Second name ? : ");
		String SndNM=ScanInput.nextLine();
		
		System.out.println(Name+" "+SndNM+" how old are you ? : ");
		int Age=ScanInput.nextInt();
		
		System.out.print(Name+" "+SndNM+" how tall are you now that you are "+Age+" ? : ");
		double Height=ScanInput.nextDouble();

		//Creates a txt file named "the-file-name.txt" in the same folder that the src folder is
		//example in this case the path tha the file is saved is :
		//C:\Users\NIKOS\Desktop\Internet Downloads\SOFTWARE\JAVA\Lesson_04_11-10-2018-Recap\Lesson_04-All
		
		
PrintWriter writer;
		
		try {
			writer=new PrintWriter("the-file-name.txt","UTF-8");
			writer.println(Name);
			writer.println(SndNM);
			writer.println(Age);
			writer.println(Height);
			writer.close();
		}
		catch (UnsupportedEncodingException ex) {
			Logger.getLogger(IOCode_Create_and_Write_to_a_text_file.class.getName()).log(Level.SEVERE, null,ex);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		
		
		}
	}

}
