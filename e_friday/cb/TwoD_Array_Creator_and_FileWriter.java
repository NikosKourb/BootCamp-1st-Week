package cb;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoD_Array_Creator_and_FileWriter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the array dimensions: ");
		int d = scanner.nextInt();
		int [][] myarray = new int[d][d];
		
		// initialize table with user values
		for (int i = 0; i < myarray.length; i++) {
			for (int j = i; j < myarray[i].length; j++) {
				System.out.print("Enter a number for array[" + i + "][" + j + "]: ");
				myarray[i][j] = scanner.nextInt();
				myarray[j][i] = myarray[i][j];
			}
		}
		scanner.close();
		
		// display table
		/*for (int i = 0; i < myarray.length; i++) {
			for (int j = 0; j < myarray[i].length; j++) {
				System.out.print(myarray[i][j] + " ");
			}
			System.out.print("\n");
		}*/
		
		// write file
		arrayToFile(myarray);
	}
	
	public static void arrayToFile(int [][] myarray) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter("array.txt", "UTF-8");
			
			// draw horizontal line
			String horizontal = "";
			for (int i = 1; i <= 2 * myarray.length + 1; i++)
				horizontal = horizontal.concat("-");
			pw.println(horizontal);
			
			String lines = null;
			
			// draw table
			for (int i = 0; i < myarray.length; i++) {
				pw.print("|");
				for (int j = 0; j < myarray[i].length; j++) {		
					lines = String.format("%d%s", myarray[i][j], "|");
					pw.write(lines);
				}
				pw.print("\n");
				pw.println(horizontal);
			}
		}
		catch(IOException e) {
			System.err.println(e.getMessage());
		}
		finally {
			pw.close();
		}
	}
}
