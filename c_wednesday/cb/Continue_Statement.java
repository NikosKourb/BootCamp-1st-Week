package cb;

//Program that prints all the integers in a list except one
public class Continue_Statement {

	public static void main(String[] args) {
		
		int[] NumList= {3,57,32,68,22,78,23,90,14,7};
		
		for(int x:NumList) {
			if(x==23) {
				continue;
			}
			System.out.print(x);
			System.out.print("\n");
		}

	}

}