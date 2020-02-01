import java.util.Scanner;

public class DOWDriver
{
	public static void main(String [] args)
	{
	
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the date (day): ");
		int day = input.nextInt();

		System.out.print("Enter the month: ");
		int month = input.nextInt();

		System.out.print("Enter the year: ");
		int year = input.nextInt();


		DOW dayOfWeek = new DOW(day, month, year);

		System.out.println();
		System.out.println("The day of the week for the entered date is: " + dayOfWeek.getDow());










	}
}