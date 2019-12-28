package javaPractice;

import java.util.ArrayList;

public class Array_List_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> z=new ArrayList<String>();
		z.add("Nilesh");
		z.add("Nilesh");
		z.add("Test");
		z.add("12");
		//z.add(12.5);
		
		System.out.println(z);
		System.out.println(z.get(1));
		z.set(1, "Chiku");
		System.out.println(z);
		System.out.println(z.isEmpty());
		System.out.println(z.size());
		System.out.println("**********************************************");
		for (String x:z)
			System.out.println(x);
		
	}

}
