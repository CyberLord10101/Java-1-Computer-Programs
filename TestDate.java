/*
Cole Proffitt
TestDate.java
Lab #8A 
Due: 03/09/17
Description: This program used JOptionPane to prompt the user to enter a date a then
checks to see if it is valid.
*/
import javax.swing.JOptionPane;

public class TestDate{
	public static void main(String[] args){
		Date aDate = new Date();
		char answer = 'y';
		while(answer == 'y'){
			if(aDate.getMonth()&&aDate.getDay()&&aDate.getYear()&&aDate.checkDate())
				aDate.displayDate();
			else 
				JOptionPane.showMessageDialog(null, "That date is invalid", "TestDate",
			JOptionPane.INFORMATION_MESSAGE);
			String again = JOptionPane.showInputDialog(null, "Would you like to try again?" + answer + " or n.",
			JOptionPane.QUESTION_MESSAGE);
			
			answer = again.charAt(0);
			
		}
		System.exit(0);
	}
}
class Date{
	public int day;
	public int month;
	public int year;
	public boolean getMonth(){
		
		
		Object[]  monthList = new Object[12];
		for(int num = 0; num < 12; num ++){
			monthList[num] = new Integer(num + 1);
		}
			
		Object monthObj = JOptionPane.showInputDialog(null, "Pick a month", "Month",JOptionPane.QUESTION_MESSAGE, null,monthList, null );
		
		month = ((Integer)monthObj).intValue();
			
		return true;
	}
	public boolean getDay(){
		String msg;
		boolean good = false;
		boolean getDay = false;
		String out = JOptionPane.showInputDialog(null, "Please enter a day represented as a number", "Days", JOptionPane.QUESTION_MESSAGE);
		do{
			try{
				day = Integer.parseInt(out);
				good = true;
			}
			catch(Exception ex){
				msg = ex.getMessage();
				msg += "\nNot an Integer \nEnter an Integer: ";
				out = JOptionPane.showInputDialog(null, msg,"Days", JOptionPane.QUESTION_MESSAGE);
			}
		}while(!good);
		if(day < 32 && day > 0) 
			getDay = true;
		
		return getDay;
	}
	public boolean getYear(){
		boolean getYear = false;
		String years = JOptionPane.showInputDialog(null, "What is your year?", "Year", JOptionPane.QUESTION_MESSAGE);
		if(years.length() != 4 )
			return getYear;
		for(int goo = 0; goo < 4;goo++){
				if(!Character.isDigit(years.charAt(goo)))
					return getYear;
		}
		year = Integer.parseInt(years);
		getYear = true;
		return getYear;
	}	
	public boolean checkDate(){
		boolean result = false;
		
		int[] array1 = {0,31,29,31,30,31,30,31,31,30,30,31,30,31};
		if(array1[month] < day)
			return result;
		if(month ==  2 && day == 29){
			if(!((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)))
				return result;
		}
		return true;
	}
  
	public void displayDate() {
		String date = String.format("%02d/ %02d/ %04d",month, day, year);
		JOptionPane.showMessageDialog(null,date,"Date",JOptionPane.INFORMATION_MESSAGE);
		
		/* TODO
		Write code here to display the date as "Verified date is mo/dd/yyyy" in a   
		message dialog with Test Date and your name in the title bar and an information icon.
		*/
	}
}		
		
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
