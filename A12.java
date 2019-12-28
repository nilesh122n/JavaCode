package javaPractice;

public class A12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to find capital letter from String
		
		String str="TestNg";
		for (int i=0;i<str.length();i++)
		{
		if ((Character.isUpperCase(str.charAt(i))))//Character is wrapper class
		{
		System.out.println((str.charAt(i)+""));
		}

	}

}
}