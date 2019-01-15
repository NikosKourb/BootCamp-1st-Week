package cb;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Weekly_Project_hard {

	public static void main(String[] args) {
		
		//stating the scanner to catch user's input
		Scanner userInput=new Scanner(System.in);
		System.out.println(" ");
		String filename=userInput.nextLine();String command=userInput.nextLine();
		
		
		//create and initialize a variable that holds current date and time
		String timeStamp = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date());

		
		
		
		
		
		BufferedReader FileReader;
		
		String line1=null;
		try {
			
			BufferedReader br1=new BufferedReader(new FileReader(filename));
			line1=br1.readLine();
			while(line1!=null) {
				int wordCount=0;
				int lineCount=0;
				int lineCount2=0;
				for(int i=0;i<line1.length();i++) {

					if(line1.charAt(i)==' ') {
						lineCount2++;
					}
					lineCount=lineCount+lineCount2;
				}
				wordCount=wordCount+lineCount;
				System.out.println(wordCount);
				System.out.println(line1);
			}
			br1.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		//writing the date, time, command, source filename and result in a text file
		PrintWriter writer;{
		
			try {
				writer=new PrintWriter("wordcount.txt","UTF-8");
				writer.println(timeStamp+"    "+command+"\t"+filename);
				writer.close();
			}
			
			catch (UnsupportedEncodingException ex) {
				Logger.getLogger(Weekly_Project_hard.class.getName()).log(Level.SEVERE, null,ex);
				} 
			catch (FileNotFoundException e) {
				e.printStackTrace();
				}
			
		}
		
		
	}

}
