package cb;

import java.io.IOException;

public class String_Methods2 {

	public static void main(String[] args) {
		
		String Str1=new String("TOM MARVOLO RIDDLE !!!");
		int x=Str1.length();
		
		System.out.println(x);
		System.out.println(Str1);
		
/*		char L1=Str1.charAt(13);
		System.out.print(L1);
		
		char L2=Str1.charAt(18);
		System.out.print(L2);
		
		char L3=Str1.charAt(5);
		System.out.print(L3);
		char L4=Str1.charAt(2);
		System.out.print(L4);
		
		char L5=Str1.charAt(11);
		System.out.print(L5);
		
		char L6=Str1.charAt(9);
		System.out.print(L6);
		char L7=Str1.charAt(10);
		System.out.print(L7);
		char L8=Str1.charAt(12);
		System.out.print(L8);
		char L9=Str1.charAt(15);
		System.out.print(L9);
		
     	char L10=Str1.charAt(3);
		System.out.print(L10);
		
		char L11=Str1.charAt(7);
		System.out.print(L11);
		char L12=Str1.charAt(8);
		System.out.print(L12);
		char L13=Str1.charAt(16);
		System.out.print(L13);
		char L14=Str1.charAt(14);
		System.out.print(L14);
		char L15=Str1.charAt(17);
		System.out.print(L15);
		char L16=Str1.charAt(4);
		System.out.print(L16);
		char L17=Str1.charAt(1);
		System.out.print(L17);
		char L18=Str1.charAt(6);
		System.out.print(L18);
		char L19=Str1.charAt(0);
		System.out.println(L19);  */
	/*	char L20=Str1.charAt(22);
		System.out.print(L20);
		char L21=Str1.charAt(20);
		System.out.print(L21);
		char L22=Str1.charAt(21);
		System.out.print(L22);   */
		
		//Finding (Indexing) the place of a particular string in a bigger String
		int Index1=Str1.indexOf("OL");
		System.out.println("The String OL is found in place "+Index1+" !!!");
		
		int Index2=Str1.indexOf("DL");
		System.out.println("The String DL is found in place "+Index2+" !!!");
		
		//Changing from Uppercase to LowerCase and back
		String Str2=Str1.toLowerCase();
		String Str3=Str2.toUpperCase();
		System.out.println( "The phrase ,"+Str1+" , can be also writen like this "+Str2);
		System.out.println("and again like before "+Str3);
		
		//Trimming the blanks before and after
		String Str4=new String(" How are you? ");
		String Str4Trimmed=Str4.trim();
		System.out.println(Str4+" after trimming is "+Str4Trimmed);
		
		//Substring
		String SubStr=Str1.substring(3,9);
		System.out.println("Example of substring in places 3-9 in "+Str1+" is the following : "+SubStr);
		
		//Split a String containing elements and turnimg them into an array
		String ListOfPeople="Mark,Nick,George,Max,Walter";
		String[] Names=ListOfPeople.split(",");
		for(String x1:Names) {
			System.out.println(x1);
		}
		
		//replacing part of a String with some other string
		String StrRepl=ListOfPeople.replace(",","+");
		System.out.println(ListOfPeople+" Before");
		System.out.println(StrRepl+" After");
		
		
		
	}

}
