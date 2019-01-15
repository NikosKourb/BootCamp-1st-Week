package cb;

import java.util.Scanner;

public class Double_Array_Creator_From_Input {

	public static void main(String[] args) {
		double[] DoubleArray=new double[11];
		
		
		Scanner ScanInput = new Scanner(System.in);
	
		for(int i=0;i<11;i++) {
			System.out.print("Give me a positive number with decimals: ");
			
			double ArrayValue=ScanInput.nextDouble();
			DoubleArray[i]=ArrayValue;
		
		}
		ScanInput.close();
		
		System.out.print("{ ");
		for(int x=0;x<11;x++) {
			System.out.print(DoubleArray[x]);
			System.out.print(" , ");
		}
		System.out.print(" }");
		System.out.print("\n");
		System.out.print("{ ");
		for(int x=0;x<11;x++) {
			System.out.print(DoubleArray[10-x]);
			System.out.print(" , ");
		}
		System.out.print(" }");
		System.out.print("\n");
		double g=0;
				
		for(int y=0;y<11;y++) {
			double D_A_Val=DoubleArray[y];
			if(D_A_Val>g) {
				g=D_A_Val;
				
			}
			else {
				g=g;
			}
		
		
			}
		System.out.print("Max = "+g);
		System.out.print("\n");
		
		for(int y=0;y<11;y++) {
			double D_A_Val=DoubleArray[y];
			if(D_A_Val>g) {
				g=g;
				
			}
			else {
				g=D_A_Val;
			}
		
		
			}
		System.out.print("Min = "+g);
		}
	}

