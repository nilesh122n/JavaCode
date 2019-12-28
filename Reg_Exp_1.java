package javaPractice;

public class Reg_Exp_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		String="TestNg"
				s=s.replaceAll("[^A-Z]",");
				Sop(s);
*/
		
		String Str1="+121-8882010-(123)ABC";
		String Str2=Str1.replace("+","" );
		System.out.println(Str2);
		String test="[^A-Za-z0-9]";
		String Str3=Str1.replaceAll(test, "");
		System.out.println(Str3);
		
	}

}
