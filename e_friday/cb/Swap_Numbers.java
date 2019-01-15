package cb;

import java.util.Scanner;
//Can be solved with Call by value
public class Swap_Numbers {

	public static void main(String[] args) {
		//Variables here are local
		/*System.out.print("Give an integer : ");
		Scanner ScanInput=new Scanner(System.in);
		int Num1=ScanInput.nextInt();
		System.out.print("Give me another integer");
		int Num2=ScanInput.nextInt();
		*/
		int[] NumArray= {432,76};
		int a;
		int b;
		//int x=NumArray.length;
		for(int i=0;i<NumArray.length;i++) {
			b=NumArray[i];
			a=NumArray[i+1];
			System.out.println("a= "+a);
			System.out.println("b= "+b);
		}
		
		//for(int num:NumArray) {
		//	System.out.println(num);
		}
		
	}

	
	/*public static void Swap(int x,int y) {
		int z;
		z=x;
		x=y;
		y=z;
	
	}
}

*/
