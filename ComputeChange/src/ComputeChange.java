//ComputeChange.java: Break down an amount into smaller units
import java.util.Scanner;

public class ComputeChange { 
	/** Main method */
	public static void main(String[] args) {
		double amount; //Amount entered from keyboard
		Scanner myInput = new Scanner(System.in);
		
		//Prompt user for amount and get user's input
		System.out.println("Please enter an amount, for example 11.56: ");
		amount = myInput.nextDouble();
		
		int remainingAmount = (int)(amount * 100);
		
		//Find the number of one dollar
		int numOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		
		//Find the number of quarters in the remaining amount
		int numOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		
		//Find the number of dimes in the remaining amount
		int numOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		
		//Find the number of nickels in the remaining amount
		int numOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		
		
		//Find the number of pennies in the remaining amount
		int numOfPennies = remainingAmount;
		
		String output = "Your amount " + amount + " consists of \n" +
			numOfOneDollars + " dollars\n" +
			numOfQuarters + " quarters\n" +
			numOfDimes + " dimes\n" +
			numOfNickels + " nickels\n" +
			numOfPennies + " pennies\n";
		System.out.println(output);
		
		System.exit(0);
	}
}