package cb;

//Program that prints an integer value that changes until a certain limit
public class DoWhileLoop {

	public static void main(String[] args) {
		
		int x=9;
		
		do {
			System.out.print("x= "+x);
			x++;
			System.out.print("\n");
		}while (x<20);
	}

}