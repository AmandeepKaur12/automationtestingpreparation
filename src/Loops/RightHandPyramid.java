package Loops;

public class RightHandPyramid {

	public static void main(String[] args) {
		
//		*
//		**
//		***
//		****
//		*****
//for rows
//		for(int i=1;i<=5;i++) {
//			for(int j =1;j<=i;j++) -- for columns {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
//		*****
//		****
//		***
//		**
//		*
//		for(int i=1;i<=5;i++) {
//			for(int j =5;j>=i;j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
		
//		1
//		12
//		123
//		1234
//		12345
//
//for(int i=1;i<=5;i++) {
//	for(int j =1;j<=i;j++) // for columns 
//	{
//		System.out.print(j);
//	}
//	System.out.println();
//}
		
//		1
//		22
//		333
//		4444
//		55555
//			for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) // for columns 
//			{
//				System.out.print(i);
//			}
//			System.out.println();
//		}
		
//		1
//		23
//		456
//		78910
//		1112131415
//		int k = 1;
//		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) // for columns 
//			{
//				System.out.print(k);
//				k++;
//			}
//			System.out.println();
//		}

		
//		 1 2 3
//		 4 5 6
//		 7 8 9
//		 10 11 12
//		 13 14 15
//		int k = 0;
//
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=3;j++) // for columns 
//			{
//				k= k+1;
//				System.out.print(" " + k);
//				
//			}
//			System.out.println();
//		}
		
//		 *
//		   **
//		  ***
//		 ****
		/*
		 * // ***** int n =5; for(int i=1;i<=n;i++) { for(int spaces = n-1; spaces
		 * >=i;spaces--) { System.out.print(" "); } for (int k =1;k<=i;k++) {
		 * System.out.print("*"); } System.out.println(); }
		 */
		
		
//	    * 
//	    * * 
//	   * * * 
//	  * * * * 
//	 * * * * * 
		
		int n =5;
		for(int i=1;i<=n;i++) {
			for(int spaces = n-1; spaces >=i;spaces--) {
				System.out.print(" ");
			}
			for (int k =1;k<=i;k++) {
				System.out.print("* ");
				}
			System.out.println();
		}
		

	}
	}

