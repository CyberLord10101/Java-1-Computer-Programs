/*
Cole Proffitt 
Due: 2/21/17
Vowels.java Lab5B
Program Description: Finds vowels in a users input the shows how many vowels were in the word,
and what the word lookings like without the vowels.Then ask if they would like to try again.
*/
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Vowels{
	public static void main(String[] args){
		Scanner myInput = new Scanner(System.in);

		char answer = 'y';
		while(answer == 'y')
		{
			String input = JOptionPane.showInputDialog(null,
			"Please enter a word:","Vowels by Cole Proffitt", JOptionPane.QUESTION_MESSAGE);
			
			String lowercase = input.toLowerCase();
			String uppercase = input.toUpperCase();
			int na = 0, ne = 0, no = 0, ni = 0, nu = 0, nA = 0, nE = 0, nI = 0, nO = 0, nU = 0;
			for(int i = 0; i < input.length();i++){
				if(input.charAt(i)=='a') na++;
				if(input.charAt(i)=='e') ne++;
				if(input.charAt(i)=='i') ni++;
				if(input.charAt(i)=='o') no++;
				if(input.charAt(i)=='u') nu++;
				if(input.charAt(i)=='A') nA++;
				if(input.charAt(i)=='E') nE++;
				if(input.charAt(i)=='I') nI++;
				if(input.charAt(i)=='O') nO++;
				if(input.charAt(i)=='U') nU++;
			}
			String original = "This is the original string: " + input + "\n";
			String replace = "Original without vowels: " + input.replaceAll("[aeiouAEIOU]","") + "\n";
			String count = "Vowels:" + replace.length() ;
			JOptionPane.showMessageDialog(null, original + replace + count );	
			System.out.println("Whould you like to try again? " + answer + " or n");
			String awsStr = myInput.next();
			answer = awsStr.charAt(0);
			
		}
		System.exit(0);
		
	}
	
}
/* Program Output
Whould you like to try again? y or n
y
*/