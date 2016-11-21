import java.util.Scanner;

public class Exercise4p17 {
	public static void main(String[] args) {
		
		
		int year = 0;
		int days =28;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year: ");
		year = input.nextInt();
		
		
		System.out.print("Enter a month: ");
		input = new Scanner(System.in);
		String month = input.next();
	
		if(month.equals("Jan") || month.equals("Mar")|| month.equals("Jul")|| month.equals("Aug")|| month.equals("Oct")|| month.equals("Dec"))
		{
			days = 31;
		}
		else if(month.equals("Apr") || month.equals("Jun")|| month.equals("Sep")|| month.equals("Nov"))
		{
			days = 30;
		}
		else
		{
			if(year % 4 == 0)
			{
				days = 29;
			}
		}
		
		System.out.print(month);
		System.out.print(" ");
		System.out.print (year);
		System.out.print ( " has ");
		System.out.print(days);
		System.out.print (" days");
		
	}
}
