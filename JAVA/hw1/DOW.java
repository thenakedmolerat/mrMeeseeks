import java.util.Scanner;

public class DOW
{
	

	private String dow;
	private int day;
	private int month;
	private int year;

	public DOW()
	{
		this("", 0, 0, 0);
	}

	public DOW(String aDow, int aDay, int aMonth, int aYear )
	{ 
		setDow(aDow);
		setDay(aDay);
		setMonth(aMonth);
		setYear(aYear);
	}
	
	public void setDow(String aDow)
	{
		dow = aDow;
	}

	public void setDay(int aDay)
	{
		day = aDay;
	}

	public void setMonth(int aMonth)
	{
		month = aMonth;
	}

	public void setYear(int aYear)
	{
		year = aYear;
	}

	public String getDow()
	{
		return dow;
	}

	public int getDay()
	{
		return day;
	}

	public int getMonth()
	{
		return month;
	}

	public int getYear()
	{
		return year;
	}

	public void monthCalc(int aMonth, int aYear)
	{

		if (month == 1)
		{
			month = 13;
			year--;
		}

		if (month == 2)
		{
			month = 14;
			year--;
		}

	}

	public void ask()
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the date (day): ");
		day = input.nextInt();

		System.out.print("Enter the month: ");
		month = input.nextInt();

		System.out.print("Enter the year: ");
		year = input.nextInt();

	} 

	public String DOW(String aDOW, int aDay, int aMonth, int aYear)
	{

		int q = aDay;
		int m = aMonth;
		int k = aYear % 100;
		int j = aYear / 100;
		int h = q + 13 * (m + 1) / 5 + k + k / 4 + j / 4 + 5 * j;
		h = h % 7;

		switch (h)
		{
			case 0 : dow = "Saturday"; break;
			case 1 : dow = "Sunday"; break;
			case 2 : dow = "Monday"; break;
			case 3 : dow = "Tuesday"; break;
			case 4 : dow = "Wednesday"; break;
			case 5 : dow = "Thursday"; break;
			case 6 : dow = "Friday"; break;
		}

		//setDow(String aDow);
		return getDow();
	}


	/*switch (h)
	{
		case 0 : System.out.println("Saturday"); break;
		case 1 : System.out.println("Sunday"); break;
		case 2 : System.out.println("Monday"); break;
		case 3 : System.out.println("Tuesday"); break;
		case 4 : System.out.println("Wednesday"); break;
		case 5 : System.out.println("Thursday"); break;
		case 6 : System.out.println("Friday"); break;
	}*/


	/*switch (h)
	{
		case 0 : dow = "Saturday"; break;
		case 1 : dow = "Sunday"; break;
		case 2 : dow = "Monday"; break;
		case 3 : dow = "Tuesday"; break;
		case 4 : dow = "Wednesday"; break;
		case 5 : dow = "Thursday"; break;
		case 6 : dow = "Friday"; break;
	}*/




	public void show()
	{

		/*switch (h)
		{
			case 0 : dow = "Saturday"; break;
			case 1 : dow = "Sunday"; break;
			case 2 : dow = "Monday"; break;
			case 3 : dow = "Tuesday"; break;
			case 4 : dow = "Wednesday"; break;
			case 5 : dow = "Thursday"; break;
			case 6 : dow = "Friday"; break;
		}*/


		System.out.println();
		System.out.printf("The day of the week for the entered date is: " + getDow());

	}


}