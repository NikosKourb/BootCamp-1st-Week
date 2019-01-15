package cb;

import java.util.Scanner;

//Writes all the numbers that come in the order before a certain place in Fibonacci 
//plus the number in that place
//ex. for all the numbers till the 10th place it gives
//{ 0,1,1,2,3,5,8,13,21,34, }

public class Fibonacci_Numbers_Array {

	public static void main(String[] args) {
		
		System.out.print("Give me a place(integer) in the fibonacci order : ");
		Scanner ScanInput=new Scanner(System.in);
		int Num=ScanInput.nextInt();
		//System.out.println("Answer = "+FibonacciByHand(Num-1)+" with FibonacciByHand Method");
		System.out.print("{ ");
		for(int w=0;w<(Num);w++) {
			System.out.print(fibonacci(w));
			System.out.print(",");
		}
		System.out.print(" }");
	}
	
	public static int fibonacci(int n) {
		if(n==0||n==1) {
			return n;
			}
		else {
			return fibonacci(n-1)+fibonacci(n-2);
			}
	}
}