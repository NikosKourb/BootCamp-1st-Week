package cb;

//Program that prints out every String in an Array 
//except the ones that start with the letter "p"
public class ArrayPrinter_with_Filters {

	public static void main(String[] args) {
		
		String[] AnimalArray={"cat","dog","pig","bear","bird","parot","rabbit"};

		for(String x:AnimalArray) {
			if(x.startsWith("p")) {
				continue;
			}
	  /*-------------------------Different Way01--------------------------------------------

	    for(String x:AnimalArray) {
	       char letter1=value.charAt(0);
       if(letter1=='p') {
	    	    continue;
	       }
	    }
    
	    -------------------------Different Way02--------------------------------------------
    
	    for(String x:AnimalArray) {
	       char[] an=value.toCharArray();
	       if(an[0]=='p') {
	       	continue;
	       }
	    }
	    
  */
			System.out.print(x);
			System.out.print("\n");
		}

	}

}