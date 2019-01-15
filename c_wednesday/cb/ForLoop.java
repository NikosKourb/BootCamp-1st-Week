package cb;

//Program that prints the value of x until it reaches a certain integer or double
public class ForLoop {

	public static void main(String[] args) {
		
		for(int x=5;x<15;x++/* or x=x+1*/) {
			System.out.println("x= "+x);
			System.out.println("\n");
		}
		
		System.out.println("\n");
		System.out.println("\n");
		
	  //int x=1
	  //for(;x<5;)
	  //That way the FOR can be used as a WHILE 
	  //NOT RECOMMENDED
		
		for(double x=9;x<24;x=x+1.5) {
			System.out.println("x= "+x);
			System.out.println("\n");
		}

	}

}