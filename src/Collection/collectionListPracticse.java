package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class collectionListPracticse {

	public static void main(String[] args) {
		
		//List
				//Same order data written
				//will have duplicate values
		
		/*
		 * ArrayList of integer:3 ArrayList of integer:67 ArrayList of integer:69
		 * ArrayList of integer:67 ArrayList of integer:69 ArrayList of integer:89
		 * LinkedList of string:Hello World LinkedList of string:Hello Country
		 * LinkedList of string:Hello India LinkedList of string:Hello World LinkedList
		 * of string:State
		 */
		
		ArrayList<Integer> hs = new ArrayList<Integer>();
	     hs.add(3);
	     hs.add(67);
	     hs.add(69);
	     hs.add(67);
	     hs.add(69);
	     hs.add(new Integer(89));
	     
	     for(Integer i : hs) {
	    	 System.out.println("ArrayList of integer:" + i);
	     }
	     
	     //Will not maintain order
		 LinkedList<String> hs1 = new LinkedList<String>();
		 hs1.add("Hello World");
		 hs1.add("Hello Country");
		 hs1.add("Hello India");
		 hs1.add("Hello World");
		 hs1.add(new String("State"));
		 
		 for(String s : hs1) {
	    	 System.out.println("LinkedList of string:" + s);
	     }	 
		
		

	}

}
