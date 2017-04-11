/*
Cole Proffitt
Due: 2/9/2017
Lab 3B Utilities.java
Tallies up each the amount for each utility bill and gives the how many bills you entered
 as well as the average for the bills in that specific utility class
*/
import java.util.Scanner;

public class Utilities {
	public static void main(String[] args) {
		Scanner myInput = new Scanner(System.in);
		char answer = 'y';
		double amount = 0;
		int gas = 0, electric = 0, phone = 0;
		double gTot = 0, eTot = 0, pTot = 0;
		double gavg = 0, eavg = 0, pavg = 0;
		
		
		String gstr = "Gas ", estr = "Electric ", pstr = "Phone ";
		while(answer == 'y'){
			System.out.println(" Please choose a bill type from the following list: \n" +
				"1.) Gas: \n2.) Electric: \n3.) Phone: ");
			int choice = myInput.nextInt();
			System.out.println("What is the amount for the bill: ");
			amount = myInput.nextDouble();
			while(amount < -1000 || amount >1000) {
				System.out.print("Out of range -try again: ");
				amount = myInput.nextDouble();
			}
			switch(choice){
				case 1:						
					gTot += amount;
					gas++;
					gstr += amount + " ";
					break;
				case 2:
					eTot += amount;
					electric++;
					estr += amount + " ";
					break;
				case 3:
					pTot += amount;
					phone++;
					pstr += amount + " ";
					break;
				}
			System.out.println("Have any more data?" + answer + " or n:");
			String ansStr = myInput.next();
			answer = ansStr.charAt(0);
		}
		if(gas!=0)
			gavg = gTot/gas;
		if(electric!=0)
			eavg = eTot/electric;
		if(phone!=0)
			pavg = pTot/phone;
		
		gstr += String.format("The average for: %d bills is: $%.2f " , gas , gavg);
		estr += String.format("The average for: %d bill is: $%.2f " , electric , eavg);
		pstr += String.format("The average for: %d bill is: $%.2f " , phone , pavg);
		
		
		System.out.println(gstr);
		System.out.println(estr);
		System.out.println(pstr);
	}
}

/*
Program Out:
Gas 40.0 30.0 40.0 The average for: 3 bills is: $36.67
Electric 20.0 40.0 The average for: 2 bill is: $30.00
Phone The average for: 0 bill is: $0.00
*/		

