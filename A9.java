package javaPractice;

public class A9 {

	public static void main(String[] args) {
		//String Operation
		
		String str="       Abc    Hhjhh    khjhjhjhh      ";
		
		String a=str.trim();
		
		System.out.println(a);
		System.out.println(str.toUpperCase());
		
		String c=" ";
		System.out.println(c.isEmpty());
		
		String str11="Nilesh";
		String str33="NILESH64646468";   //False
		String str22="Nilesh"; //True
		
		String str4="Nilesh";
		String str5="NileDawa";
		
		System.out.println(str11.equals(str22));
		System.out.println(str11.equalsIgnoreCase(str33));
		
		boolean a9=str11.equals(str22);
		if (a9)
		{
			System.out.println("Both String Are same");
		}
		else
		{
			System.out.println("Both String Are Not same");
		}
		
		System.out.println(str11.compareTo(str33));
		System.out.println(str11.compareToIgnoreCase(str33));
		
		System.out.println(str4.compareTo(str5));
				

	}

}
