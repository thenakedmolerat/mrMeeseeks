package pupr.edu.zellersCongruence;
import java.util.Scanner;  

public class DOW extends DOWDriver

{
	
	private String dow;


	public DOW()
	{
		this.dow = "";
	}

	public DOW(int aDay, int aMonth, int aYear)
	{

		if (aMonth == 1)
		{
			aMonth = 13;
			aYear--;
		}

		if (aMonth == 2)
		{
			aMonth = 14;
			aYear--;
		}
		
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

	public void show()
	{

		System.out.println();
		System.out.printf("The day of the week for the entered date is: " + this.getDow());

	}


}