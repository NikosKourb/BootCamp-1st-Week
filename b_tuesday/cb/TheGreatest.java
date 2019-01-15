package cb;
//Program that takes a list of positive numbers and returns the largest number
import java.util.Scanner;

public class TheGreatest {

	public static void main(String args[]/*or arguments*/) {
		
		int[] integerArray=new int[1];
		int[] integerArray2=new int[5];
		Scanner userIn=new Scanner(System.in);
		for(int i=0; i<5; i++) {
			System.out.print("Give me a positive number: ");
			int x=userIn.nextInt();
			integerArray2[i]=x;
			for(int j=0;j<integerArray.length;j++) {
			if(integerArray[j]<x) {
				integerArray[j]=x;
				}
			}
		}
		for(int y=0;y<integerArray2.length;y++) {
			System.out.print(integerArray2[y]+",");
		}
		System.out.println("\n"+integerArray[0]+" is the Greatest of all the numbers that you gave me!!!");
		userIn.close();
	}
	
} 