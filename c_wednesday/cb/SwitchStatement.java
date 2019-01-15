package cb;

//Program that reads the grade of a student and returns a statement

public class SwitchStatement {

	public static void main(String[] args) {
		
		char x='D';
		
		switch(x) {
			case 'A':
				System.out.println("Excellent !!!");
				break;
			case 'B':
			case 'C':
				System.out.println("Very Good !!!");
				break;
			case 'D':
				System.out.println("Just Base !");
				break;
			case 'F':
				System.out.println("Failed to pass,try again !!!");
				break;
			default :
				System.out.println("Invalid Grade");
		}
		System.out.println("Your Grade is : "+x);

	}

}