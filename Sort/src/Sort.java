/*
Cole Proffitt
Due: 2/28/17
Sort.java
Displays an array full of 15 random numbers, then sorts them in ascending order
starting from left going to right and displays that result.
*/  
import java.util.Scanner;

public class Sort {
	public static void main(String[] args)	{
		Scanner myFind = new Scanner(System.in);
		int random;
		int[] aRay = new int[15];
		String in = "This is your array: ";
		String out = "\nThis is it sorted: ";
		for(int i = 0; i< aRay.length;i++){
			random = (int)(100 * Math.random()) + 1;
			aRay[i] = random;
			in += " " + aRay[i];
		}
		for(int k = 0;k < aRay.length;k++){
			for(int h = (k +1); h< aRay.length;h++ ){
				if(aRay[k]>aRay[h]){
					int restore = aRay[k];
					aRay[k] = aRay[h];
					aRay[h] = restore;
				}				
			}
			out += " " + aRay[k];
		}	
		
		System.out.print(in);
		System.out.print(out);
	}
}
/*
Program Output:
This is your array:  61 13 38 5 58 5 91 52 37 82 5 60 79 50 81
This is it sorted:  5 5 5 13 37 38 50 52 58 60 61 79 81 82 91
*/