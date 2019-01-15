package cb;

import java.io.Console;

public class Even_Array_with_Console {

	public static void main(String[] args) {
		
		int[] array = new int[1000];
		for (int i = 0; i < array.length; i++)
			array[i] = 2 * i + 1;
		
		Console console = System.console();
		int x = Integer.parseInt(console.readLine("Please enter an integer from 1 to 1999: "));
		
		for (int i = 0; i < array.length; i++ ) {
			if (array[i] == x) {
				System.out.println("Number " + x + " found at index " + i);
				break;
			}
			if (i == array.length - 1)
				System.out.println("Could not find number " + x);
		}
	}
}
