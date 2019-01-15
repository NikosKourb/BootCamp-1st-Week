package cb;

public class Spliting_and_SubString_Examples {

	public static void main(String[] args) {
		
		String s= "Strings are immutable";
		s=s.concat(" all the time");//equal to s=s+" all the time"
		System.out.println(s);;
		System.out.println("Length: "+s.length());
		for(String retVal: s.split(" ")) {
			System.out.println(retVal);
		}
		String str2=new String("Welcome-to-java-tutorial");
		System.out.println("\nSplit to two pieces :");
		
		for(String retVal:str2.split("-",2)) {
			System.out.print(retVal+"      ");
		}
		System.out.println("\n\nSplit to three pieces :");
		
		for(String retVal:str2.split("-",3)) {
			System.out.print(retVal+"     ");
		}
		System.out.println("\n\nSplit:");
		
		for(String retVal:str2.split("-",0)) {
			System.out.print(retVal+"     ");
		}
		System.out.println(str2.substring(1,10));

	}

}
