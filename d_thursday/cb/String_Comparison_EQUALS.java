package cb;

public class String_Comparison_EQUALS {

	public static void main(String[] args) {
		
		String Str1=new String("This is really not immutable !!!");
		String Str2=Str1;
		String Str3=new String("This is really not immutable !!!");
		
		boolean StringCompare;
		
		StringCompare=(Str1==Str2);
		System.out.println("The fact that Str1==Str2 is "+StringCompare);
		StringCompare=Str1.equals(Str2);
		System.out.println("The fact that Str1 equals Str2 is "+StringCompare);
		StringCompare=(Str1==Str3);
		System.out.println("The fact that Str1==Str3 is "+StringCompare);
		StringCompare=Str1.equals(Str3);
		System.out.println("The fact that Str1 equals Str3 is "+StringCompare);

	}

}
