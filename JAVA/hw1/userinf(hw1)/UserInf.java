import java.util.Scanner;

public class UserInf 
{

	//DECLARATION OF VARIABLES, CONSTRUCTORS AND COPY CONSTRUCTOR
	private String firstName;
	private String lastName;
	private String birthDate;
	private String birthPlace;

	public UserInf() 
	{
		this("", "", "", "");
	}

	public UserInf(String aFirstName, String aLastName, String aBirthDate, String aBirthPlace) 
	{
		setFirstName(aFirstName);
		setLastName(aLastName);
		setBirthDate(aBirthDate);
		setBirthPlace(aBirthPlace);
	}


	//SETTERS
	public void setFirstName(String aFirstName) 
	{
		firstName = aFirstName;
	}

	public void setLastName(String aLastName) 
	{
		lastName = aLastName;
	}

	public void setBirthDate(String aBirthDate) 
	{
		birthDate = aBirthDate;
	}

	public void setBirthPlace(String aBirthPlace)
	{
		birthPlace = aBirthPlace;
	}


	//GETTERS
	public String getFirstName()
	{
		return firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public String getBirthDate() 
	{
		return birthDate;
	}

	public String getBirthPlace()
	{
		return birthPlace;
	}


	//FUNCTION TO ASK FOR USER INPUT
	public void ask() 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your first name: ");
		firstName = input.nextLine();

		System.out.print("Enter your last name: ");
		lastName = input.nextLine();

		System.out.print("Enter your birth date (MM/DD/YYYY): ");
		birthDate = input.nextLine();

		System.out.print("Enter your birth place: ");
		birthPlace = input.nextLine();
	}


	//PRINT FUNCTION TO DISPLAY USER INFO
	public void show() 
	{
		System.out.println();
		System.out.printf("User Info: \n");
		System.out.printf("\nFirst Name : " + firstName);
		System.out.printf("\nLast Name  : " + lastName);
		System.out.printf("\nBirth Date : " + birthDate);
		System.out.printf("\nBorn In    : " + birthPlace);
	}
}
