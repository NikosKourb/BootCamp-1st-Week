package cb;
//Program that shows the AND ,OR and NOT symbols

public class Symbols {
	public static void main(String args[]) {
		boolean a=true;
		boolean b=false;
		
		System.out.println("a && b = "+(a&&b)+" !!!");
		System.out.println("a || b = "+(a||b)+" !!!");
		System.out.println("!(a && b) = "+!(a&&b)+" !!!");
	}
}
