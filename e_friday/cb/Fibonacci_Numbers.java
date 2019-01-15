package cb;

import java.util.Scanner;

//Writes the number that is in the given order ex. number in 10th place is 55
public class Fibonacci_Numbers {

	public static void main(String[] args) {
		
		System.out.print("Give me a place(integer) in the fibonacci order : ");
		Scanner ScanInput=new Scanner(System.in);
		int Num=ScanInput.nextInt();
		System.out.println("Answer = "+FibonacciByHand(Num-1)+" with FibonacciByHand Method");
		System.out.println("Answer = "+fibonacci(Num-1)+" with fibonacci(Recursion) Method");

	}

	public static int fibonacci(int n) {
		if(n==0||n==1) {
			return n;
		}
		else {
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}
	
	public static int FibonacciByHand(int x) {
		
		int y1=0;
		int y2=1;
		int y3=0;
		for(int i=2;i<=x;i++) {
			y3=y2+y1;
			//System.out.print(y3);
			y1=y2;
			y2=y3;
		}
		return y3;
	}

}


