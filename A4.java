package javaPractice;

public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Even number from 1 to 100;
		int count=0;
		for (int i=1;i<=10;i++)
		{
			if (i%2==0)
			{
				count=count+1;
				System.out.print(i+" ");
				
			}
			
		}
		System.out.println("Even Count:"+count);
	}

}
