package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class collectionSETPracticse {

	public static void main(String[] args) {
        //Set 
		//Will not maintain order
		//will remove duplicate values
		
		/*
		 * Hashset of integer:3 Hashset of integer:67 Hashset of integer:69 Hashset of integer:89 
		 * LinkedHashSet of string:Hello World LinkedHashSet of string:Hello  country 
		 * LinkedHashSet of string:Hello India LinkedHashSet of string:State
		 * TreeSet of Character:A TreeSet of Character:C TreeSet of Character:O TreeSet of Character:V
		 */
		
     HashSet<Integer> hs = new HashSet<Integer>();
     hs.add(3);
     hs.add(67);
     hs.add(69);
     hs.add(67);
     hs.add(69);
     hs.add(new Integer(89));
     
     for(Integer i : hs) {
    	 System.out.println("Hashset of integer:" + i);
     }
     
     //Will not maintain order
	 LinkedHashSet<String> hs1 = new LinkedHashSet<String>();
	 hs1.add("Hello World");
	 hs1.add("Hello Country");
	 hs1.add("Hello India");
	 hs1.add("Hello World");
	 hs1.add(new String("State"));
	 
	 for(String s : hs1) {
    	 System.out.println("LinkedHashSet of string:" + s);
     }	 
	 
	
	 //Ascending maintain order 
     TreeSet<Character> TS = new TreeSet<Character>();
     TS.add('A');
     TS.add('C');
     TS.add('V');
     TS.add('A');
     TS.add(new Character('O'));
     
     for(Character c : TS) {
    	 System.out.println("TreeSet of Character:" + c);
     }
	}

}
