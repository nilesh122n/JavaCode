package javaPractice;

public class My_Array_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] Test = { { "ABC", "ZXC", "TYU" }, { "TQA", "TEST1", "RQA" }, { "RTQ", "TYU", "TYU" } };
		
		System.out.println(Test[0][0]);
		
		for (int i=0;i<=Test.length-1;i++)
			for (int j=0;j<=Test.length-1;j++)
			{
				System.out.print(Test[i][j]+" ");
			}
		System.out.println();
		
	
System.out.println("==========================================");
	for (String [] x:Test)
	{
		for (String k:x)
		{
			System.out.println(k);
		}
	}
	
	}
}

