package cb;
//Program that makes calculations with different variables

public class Calculator {
	public static void main(String args[]) {
		
		int a=10;
		int b=20;
		int c=25;
		int d=25;	
		
		System.out.println("Adding a + b = "+(a+b)+" !!!");
		System.out.println("Substracting a - b = "+(a-b)+" !!!");
		System.out.println("Multiplying a * b = "+(a*b)+" !!!");
		System.out.println("Dividing a / b = "+(a/b)+" !!!");
		System.out.println("The remainder from the a / b division is "+(a%b)+" !!!");
		System.out.println("The remainder from the c / a division is "+(c%a)+" !!!");
		System.out.println("Increasing c by 2 can't be done like this c++ because it prints this value "+(c++)+" !!!");
		System.out.println("Increasing c by 2 must be done like this ++c so it prints this value "+(++c)+" !!!");
		System.out.println("Decreasing d by 2 can't be done like this d-- because it prints this value "+(d--)+" !!!");
		System.out.println("Decreasing d by 2 must be done like this --d so it prints this value "+(--d)+" !!!");
		//check the difference between c++ and ++c and between d-- and --d
	}
}