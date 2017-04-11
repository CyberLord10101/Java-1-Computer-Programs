/* Joey Wilson	
	2/28/2017
	Wholepart.java
	
*/

import java.util.Scanner;


public class  Wholepart	{
	public static void main (String args[]) {
		double a = 1.7;
		int i = part(a) ;
		
		System.out.println(i);
	}
	public static int part (double a){
		int i = (int)a ;
		return i;
	}

}
/*	Sample output
	1
*/