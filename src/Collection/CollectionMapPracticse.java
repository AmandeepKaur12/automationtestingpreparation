package Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class CollectionMapPracticse {

	public static void main(String[] args) {
		
		/*
		 * HashMap of key 1Value is Aman 
		 * HashMap of key 111111Value is PAman 
		 * HashMap of key 1111Value is PAman 
		 * HashMap of key 11111Value is AAman 
		 * HashMap of key 11Value is BAman
		 */
		//Random order and overwrites the duplicate key value
		HashMap<Integer, String> hm = new HashMap<Integer, String>(); 
		hm.put(1,"Aman");
		hm.put(11,"BAman");
		hm.put(111111,"CAman");
		hm.put(1111,"PAman");
		hm.put(11111,"AAman");
		hm.put(111111,"PAman");
		
		
		Set<Integer> allKeys = hm.keySet();
		
		for(Integer i : allKeys) {
	    	 System.out.println("HashMap of key" + " " + i + "Value is " + hm.get(i));
	     }
	     
		
		/*
		 * LinkedHashMap of key 1Value is Aman LinkedHashMap of key 11Value is BAman
		 * LinkedHashMap of key 11111Value is AAman LinkedHashMap of key 111111Value is
		 * PAman
		 */
		LinkedHashMap<Integer, String> Lhm = new LinkedHashMap<Integer, String>(); 
		Lhm.put(1,"Aman");
		Lhm.put(11,"BAman");
		Lhm.put(11111,"CAman");
		Lhm.put(111111,"PAman");
		Lhm.put(11111,"AAman");
		Lhm.put(111111,"PAman");
		
		
		Set<Integer> LhmallKeys = Lhm.keySet();
		
		for(Integer i : LhmallKeys) {
	    	 System.out.println("LinkedHashMap of key" + " " + i + "Value is " + hm.get(i));
	     }
		
		/*
		 * TreeMap of key 1Value is Aman 
		 * TreeMap of key 11Value is BAman 
		 * TreeMap of key 11111Value is AAman 
		 * TreeMap of key 111111Value is PAman
		 */
		
		TreeMap<Integer, String> Thm = new TreeMap<Integer, String>(); 
		Thm.put(1,"Aman");
		Thm.put(31,"BAman");
		Thm.put(51111,"CAman");
		Thm.put(2111,"PAman");
		Thm.put(011,"AAman");
		Thm.put(111111,"PAman");
		
		
		Set<Integer> ThmallKeys = Thm.keySet();
		
		for(Integer k : ThmallKeys) {
	    	 System.out.println("TreeMap of key" + " " + k + "Value is " + Thm.get(k));
	     }
		
	}

	
	

}
