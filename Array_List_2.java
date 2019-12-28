package javaPractice;

import java.util.ArrayList;
import java.util.ListIterator;

public class Array_List_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(10);
		a.add(100);
		a.add(null);
		a.add(13);
		a.add(15);
		a.add(null);
		a.add(150);
		System.out.println(a);
		ListIterator itr = a.listIterator();

		while (itr.hasNext()) {
			if (itr.next() == null) {
				itr.remove();
			}
		}
		System.out.println(a);
	}

}
