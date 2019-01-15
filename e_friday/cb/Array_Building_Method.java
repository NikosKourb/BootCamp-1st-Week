package cb;

import java.util.Scanner;

public class Array_Building_Method {

	public static void main(String[] args) {
		
		//Asking the user for the dimensions of the square 2D Array
		System.out.print("Give a number x for the dimensions of the Square Table : ");
        Scanner ScanInput=new Scanner(System.in);
        int z=ScanInput.nextInt();
        
        //Creating a 2D Array with the dimensions given by the user's input
        int[][] Array=new int[z][z];
		
        //Calling the ArrayBuilder Method to visualize the 2D Array we created
        ArrayBuilder(z,Array);
        
        //Changing some of the values of the 2D Array 
        Array[0][0]=1;
        Array[1][1]=1;
        Array[2][2]=1;
		Array[3][3]=1;
		Array[4][4]=1;
		
		//Calling the ArrayBuilder Method again to visualize the 2D Array with the changed values
		ArrayBuilder(z,Array);

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
