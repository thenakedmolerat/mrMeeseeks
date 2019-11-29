import java.util.Scanner;

public class Employee {
	private String firstName;
	private String lastName;
	private int salary;

	public Employee() {
		this("", "", 0);
	}

	public Employee(String aFirstName, String aLastName, int aSalary) {
		setFirstName(aFirstName);
		setLastName(aLastName);
		setSalary(aSalary);
	}

	public void setFirstName(String aFirstName) {
		firstName = aFirstName;
	}

	public void setLastName(String aLastName) {
		lastName = aLastName;
	}
	public void setSalary(int aSalary) {
		salary = aSalary;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void ask() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter employee first name: ");
		firstName = input.nextLine();

		System.out.print("Enter employee last name: ");
		lastName = input.nextLine();

		System.out.print("Enter employee annual salary: ");
		salary = input.nextInt();
	}

	public void show() {
		System.out.println();
		System.out.printf("Name  : %s %s\n", firstName, lastName);
		System.out.printf("Salary: $ %,d%n", salary);
	}
}
