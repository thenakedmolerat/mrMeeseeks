#include <iostream>		//library declaration
#include <cmath>
using namespace std;


int main() //main function.
{
	int userInput;
	bool keepLooping = true;
	while (keepLooping == true) //while to create a main loop for the frontal menu.
	{
		char userInput; //user input value declaration.

		system("cls");
		system("color 0b");
		cout << "Which do you want to do?\n\n";
		cout << "option one which is not defined yet\n";
		cout << "option two which is also not defined yet\n";
		cout << "3) About\n";
		cout << "4) Exit\n\n\n";
		cout << ">";

		cin >> userInput; //user input value pickup

		switch (userInput) //switch case array with a case for every option. also a parameter for user input value delivery.
		{
		case '1':
			system("cls");
			cout << "were not there yet\n";
			system("pause");
			break;

		case '2':
			system("cls");
			cout << "Still not there yet\n";
			system("pause");
			break;

		case '3':
			system("cls");
			cout << "Creator: Carlos J. Marcano\nStudent ID: 104163\nEmail: carlosjosemarcano@gmail.com\n";
			system("pause");
			break;

		case '4': return 0; //exits the program

		default: 
			system("cls");
			cout << "You've chosen neither\n";
			system("pause");

		}

			if (userInput < 1 || userInput >4) //validation for user input and also the loop validator.
				keepLooping = true;


	}

}
