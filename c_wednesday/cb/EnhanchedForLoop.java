package cb;

//Program that prints all the elements of a list of integers or strings
public class EnhanchedForLoop {

	public static void main(String[] args) {
		
		int[] NumList={3,75,85,90,21,6,4,7,};
		
		for(int x:NumList) {
			System.out.println(x);
		}
		
		System.out.print("\n");
		
		String[] NameList= {"nick","george","kostas","john","vicky","maria","tasia"};
		
		for(String y:NameList) {
			System.out.println(y);
			
		}
	}

}