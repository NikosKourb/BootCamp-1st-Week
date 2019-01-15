package cb;

import java.io.Console;

public class NMtoKMtoM {

	public static void main(String[] args) {
		double nmtokm = 1.852;
		double nmtom = 1.150779;
		
		Console console = System.console();
		double m = Double.parseDouble(console.readLine(
				"Please enter a number of nautical miles: "));
		
		System.out.println(m + " miles equals with " + nmtokm * m + " kilometers");
		System.out.println(m + " miles equals with " + nmtom * m + " miles");
	}

}
