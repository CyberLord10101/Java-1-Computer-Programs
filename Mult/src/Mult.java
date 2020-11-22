import java.util.Scanner;


public class Mult{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Please enter a number for the size of your array: ");
		int size = myScanner.nextInt();
		int[] aRay = new int[size];
		int[] bRay = new int[size];
		int[] pro1 = new int[size];
		 
		
		int x, y;
		x = (int)(Math.random() * 30) + 1;
		y = (int)(Math.random() * 30) + 1;
		System.out.print(x + " * " + y + " = " + mult(x,y));
		for(int k = 0; k < aRay.length;k++){
			aRay[k] = (int)(Math.random() * 30) + 1;
			bRay[k] = (int)(Math.random() * 30) + 1;
		}
		System.out.println("Array1: " );
		for(int b = 0; b < aRay.length; b++){
			int num = aRay[b];
			System.out.print(" " + num );
		}
		System.out.println("Array2: ");
		for(int n = 0;n < bRay.length; n++){
			int mum = bRay[n];
			System.out.print(" " + mum);
		}
		
		pro1 = mult(aRay,bRay);
		//for loops and output 
	}
	public static int mult(int num1,int num2){	
		return num1 * num2;
	}

	public static int[] mult(int[] yar, int[] yar2){
		int[] p = new int[yar.length]; 
		for(int i = 0;i<yar.length; i++){
			p[i]= yar[i]* yar2[i];
		}
		return p;
	}
}