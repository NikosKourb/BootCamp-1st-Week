package cb;

//Program that we input a double value for Nautical Miles and it prints them 
//Converted Kilometers and Miles
import java.util.Scanner;

public class Distance_Converter_Scan {
	public static void main(String[] args) {
		
		double NMtoKM=1.852;
		double NMtoM=1.150779;
		
		double NM=1;
		
		Scanner ScanInput = new Scanner(System.in);
		
		while(NM>0) {
			System.out.println("Give a distance in Nautical Miles :");
			
			NM = ScanInput.nextDouble();
						
			System.out.println(NM+" Nautical Miles = "+(NM*NMtoKM)+" KiloMeters !!!");
			System.out.println(NM+" Nautical Miles = "+(NM*NMtoM)+" Miles !!!");
			System.out.println("\n");
					
		}
		ScanInput.close();
	}

}