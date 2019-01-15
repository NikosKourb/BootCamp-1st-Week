package cb;

public class String_Concaterator {

	public static void main(String[] args) {
		
		String Str1="The answer to everything is ";
		String Str2="42 !!!";
		Str1=Str1+Str2;
		
		System.out.println(Str1);
		
		
		Str1="The answer to everything is ";
		Str1=Str1+"43 !!!";
		
		System.out.println(Str1);
		
		
		Str1="The answer to everything is ";
		Str2="44 !!!";
		Str1=Str1.concat(Str2);
		
		System.out.println(Str1);

	}

}
