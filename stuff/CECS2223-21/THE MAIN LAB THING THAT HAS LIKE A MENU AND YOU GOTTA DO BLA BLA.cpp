#include <iostream>
#include <cmath>
using namespace std;


int main()
{
	int userInput;
	bool keepLooping = true;
	while (keepLooping == true)
	{
		char userInput;

		system("cls");
		system("color 0b");
		cout << "Which do you want to do?\n\n";
		cout << "option one which is not defined yet\n";
		cout << "option two which is also not defined yet\n";
		cout << "3) About\n";
		cout << "4) Exit\n\n\n";
		cout << ">";

		cin >> userInput;

		switch (userInput)
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

		case '4': return 0;

		default: cout << "You've chosen neither\n";
		system("pause");
		keepLooping = true;

		}

			if (userInput < 1 || userInput >4)
				keepLooping = true;


	}

}
