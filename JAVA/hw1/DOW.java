import java.util.Scanner;

public class DOW
{
	
	private String dow;


	public DOW()
	{
		this.dow = "";
	}

	public DOW(int aDay, int aMonth, int aYear)
	{

		int q = aDay;
		int m = aMonth;
		int k = aYear % 100;
		int j = aYear / 100;
		int h = q + 13 * (m + 1) / 5 + k + k / 4 + j / 4 + 5 * j;
		h = h % 7;

		switch (h)
		{
			case 0 : this.dow = "Saturday"; break;
			case 1 : this.dow = "Sunday"; break;
			case 2 : this.dow = "Monday"; break;
			case 3 : this.dow = "Tuesday"; break;
			case 4 : this.dow = "Wednesday"; break;
			case 5 : this.dow = "Thursday"; break;
			case 6 : this.dow = "Friday"; break;
			default : this.dow = "Not working";
		}

	}
	

	public String getDow()
	{
		return this.dow;
	}


	/*public void monthCalc(int aMonth, int aYear)
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
	*/




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
		System.out.printf("The day of the week for the entered date is: " + this.getDow());

	}


}