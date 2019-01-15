package cb;

import java.util.Scanner;

public class Blank_Counter_from_imput_MovieQuote {

	public static void main(String[] args) {
		
		//String Quote="Why so Serious ?";
		System.out.print("Type in your best movie quote :");
		Scanner ScanInput=new Scanner(System.in);
		String Quote=ScanInput.nextLine();
		int x=0;
		for(int i=0;i<Quote.length();i++) {
			if(Quote.substring(i,i+1).equals(" ")) {
				x=x+1;
			}
			else {
				x=x;
			}
		}
		System.out.print(x);
		
			
			
	}

}