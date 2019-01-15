package cb;

public class StringBuilder_Capacity_and_Examples {

	public static void main(String[] args) {
		
		StringBuilder sb0=new StringBuilder();
		System.out.println("An empty StringBuilder has "+(sb0.length())+" Length");
		System.out.println("An empty StringBuilder has "+(sb0.capacity())+" Capacity");
		
		String Str1="Why so serious?";
		StringBuilder strbuild=new StringBuilder();
		
		for(int i=(Str1.length()-1);i>=0;i--) {
			strbuild.append(Str1.charAt(i));
		}
		String New=strbuild.toString();
		System.out.println(New);
		
		String Str2="I said Why so Serious??";
		StringBuilder sb11=new StringBuilder();
		
		for(int i=(Str2.length()-1);i>=0;i--) {
			sb11.append(Str2.charAt(i));
		}
		String New2=sb11.toString();
		System.out.println(New2);
		
		String s2="Î�Î¹ÏˆÎ¿Î½Î±Î½Î¿Î¼Î·Î¼Î±Ï„Î±Î¼Î·Î¼Î¿Î½Î±Î½Î¿ÏˆÎ¹Î�";
		StringBuilder sb2=new StringBuilder();
		
		for(int i=s2.length()-1;i>=0;i--) {
			sb2.append(s2.charAt(i));
		}
		
		String out2=sb2.toString();
		System.out.println(out2);

		
	}

}
