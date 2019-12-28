package javaPractice;

public class A11 {

	public static void main(String[] args) {
	String str1="I love java and selenium";
	String str2="Nilesh";
	System.out.println(str1.startsWith("I nil"));
	System.out.println(str1.endsWith("um"));
	System.out.println(str1.indexOf("and"));
	//System.out.println(str1.indexOf("and",6);
	System.out.println(	str1.indexOf("java", 3));
	String str3="";
	System.out.println(str2.length()-1);
	for (int i=0;i <=str2.length()-1;i++)
	{
	str3=str2.charAt(i)+str3;
	System.out.println(str3);
	}
	}

}
