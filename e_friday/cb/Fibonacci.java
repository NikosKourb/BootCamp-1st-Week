package cb;

public class Fibonacci {

	public static void main(String[] args) {
		int x = 9;
		System.out.println(loopFibonacci(x));
		loopFibonacciSeries(x);

	}

	public static void recursiveFibonacciSeries(int n) {
		for(int i = 1; i <= n; i++) {
            System.out.print(recursiveFibonacci(i) +" ");
        }
	}
	
	public static void loopFibonacciSeries(int n) {
		for (int i = 0; i <= n; i++) {
			System.out.print(loopFibonacci(i) + " ");
		}
	}
	
	public static int recursiveFibonacci(int n) {
		if (n == 1 || n == 0)
			return n;
		else {
			return (recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2));
		}
	}

	public static int loopFibonacci(int n) {
		int sum = 3, n1 = 0, n2 = 1;
		if (n == 0 || n == 1)
			sum = n;
		else {
			for (int i = 2; i <= n; i++)	{
				sum = n1 + n2;
				n1 = n2;
				n2 = sum;
			}
		}
		return sum;
	}
}
