package Loops;

public class Starpyramid {

	public static void main(String[] args) {

		int irow,jcolu;
	    
		/*
		 * 1 12 123 1234 12345
		 */
		/*
		 * for(irow=1;irow<=5;irow++) { for(jcolu=1;jcolu<=irow;jcolu++) {
		 * System.out.print(jcolu); } System.out.println(); }
		 */
	    
		int k =1;
	    for(irow=1;irow<=4;irow++) {
	    	for(jcolu=1;jcolu<=irow;jcolu++) {
	    		System.out.print(k);
	    		k++;
	    	}	
	    	
	    	System.out.println();
	    }
		
	}

}
