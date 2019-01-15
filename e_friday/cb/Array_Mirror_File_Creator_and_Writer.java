package cb;

import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.FileNotFoundException;

public class Array_Mirror_File_Creator_and_Writer {

	public static void main(String[] args) {
		
		//Asking the user for the dimensions of the square 2D Array
		System.out.print("Give a number x for the dimensions of the Square Table : ");
        Scanner ScanInput=new Scanner(System.in);
        int z=ScanInput.nextInt();
        System.out.print("\n");
        
        //Creating a 2D Array with the dimensions given by the user's input
        int[][] Array=new int[z][z];
        
        //Calling the ArrayBuilder Method to visualize the 2D Array we created
        ArrayBuilder(z,Array);
        
        //Initializing the alphanumeric variable answer with the value "y" 
        //that the DO...WHILE Loop recognizes starts and keeps on
        
        String answer="y";
        
        //Creating a DO...WHILE Loop to run until the user inputs something else than "y" 
        //when asked if he/she wants to continue
        do {
        //Asking the user to change some of the values of the 2D Array 
        System.out.print("Enter the number of the Columm the Row and the Value(integer) "
        +"\n"+"you want to input (in the above order with blanks between them) : ");
        int col=(ScanInput.nextInt())-1;int row=(ScanInput.nextInt())-1;int val=(ScanInput.nextInt());
        
        System.out.print("\n");
        
        //Checks the user input and if it does not meet some requirements
        //it returns the Sting input below
        while(col<row||row>=z||col>=z||row<0||col<0) {
        	System.out.print("One or more of the value(s) of the Columm the Row and the Value (all integers) "
        	+"\n"+"was invalid please enter the correct value(s) (in the above order with blanks between them) : ");
        	col=(ScanInput.nextInt())-1;row=(ScanInput.nextInt())-1;val=(ScanInput.nextInt());
        	
        	System.out.print("\n");
        }
        System.out.print("\n");
        
        //Changing the values
        Array[row][col]=val;
        Array[col][row]=val;
		
		//Calling the ArrayBuilder Method again to visualize the 2D Array with the changed values
		ArrayBuilder(z,Array);
		
		//Asking the user if wants to continue changing values on the table
		//or end the sequence
		System.out.print("Do you want to continue the game (y/n) : ");
		answer=ScanInput.next();
		System.out.print("\n");
		
		} while(answer.equals("y"));
        
        System.out.print("This is the Final Array after ending the sequence :");
        System.out.print("\n");
        System.out.print("\n");
        
        //Prints out the values of the Final Array
        ArrayBuilder(z,Array);

	/*Creates a file named "ARRAY_MIRROR.txt" in any path you want
    **unless you just give the file's name, in that case it will save it 
    **in the folder where the folder "src" is
    **The file will have the values of the Final Array printed in it, as visualized in eclipse
    */
	PrintWriter writer;{
	
	
	try {
		writer=new PrintWriter("C:\\Users\\NIKOS\\Desktop\\ARRAY_MIRROR.txt","UTF-8");
		//You can input any path you want and it will create the file there
		
		for(int r=0;r<Array.length;r++) {
            for(int c=0;c<Array[0].length;c++) {
            	writer.printf("[ "+Array[r][c]+" ]");
            }
            writer.println();
		}
		writer.close();
	}
	
	//This block will only execute if any Encoding exception
	//occurs in try block
	catch (UnsupportedEncodingException ex) {
		Logger.getLogger(Array_Mirror_File_Creator_and_Writer.class.getName()).log(Level.SEVERE, null,ex);
		} 
	catch (FileNotFoundException e) {
		e.printStackTrace();
		}
	}
}

	//The method that visualizes the values of the 2D Array that we created
	//plus any changes we have performed in it's values
	public static int ArrayBuilder(int h,int[][] Array) {
    	
    	for(int r=0;r<Array.length;r++) {
            for(int c=0;c<Array[0].length;c++) {
                System.out.printf("[ "+Array[r][c]+" ]");
            }
            System.out.println();
        }
    	System.out.print("\n");
		return h;
    }
}
