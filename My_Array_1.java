package javaPractice;

import java.util.Scanner;

public class My_Array_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner test=new Scanner(System.in);
		System.out.println("Eneter the number");
		int abc=test.nextInt();
		if (abc%2==0)
		{
			System.out.println("you eneter even number");
			
		}
		else {System.out.println("you eneter even number");}
		
		String [] a= {"nilesh","chiku","sup"};
		
		for (String n:a)
		{
			System.out.println(n);
		}

	}

}
