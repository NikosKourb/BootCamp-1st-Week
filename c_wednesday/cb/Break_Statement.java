package cb;

//Program that prints the elements of a list, but stops when it finds one specified element
public class Break_Statement {

	public static void main(String[] args) {
		
		int[] NumList= {23,65,76,89,24,7,23};
		
		for(int x:NumList) {
			if(x==24) {
				break;
			}
			System.out.print(x);
			System.out.print("\n");
		}

	}

}