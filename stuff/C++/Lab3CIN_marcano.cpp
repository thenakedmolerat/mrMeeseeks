// This program will read in the quantity of a particular item and its price.

// It will then print out the total price.

// The input will come from the keyboard and the output will go to

// the screen.



/* Carlos Marcano

Noviembre 21 2016

CECS 2203

*/

#include "stdafx.h"

#include <iostream>

#include <iomanip>



using namespace std;

int main()

{

	int quantity; // contains the amount of items purchased

	float itemPrice; // contains the price of each item

	float totalBill; // contains the total bill.

	cout << setprecision(2) << fixed << showpoint; // formatted output 

	/* (Exercise 3) the setpresicion determines the number of decimals to display on the result */

	/* (Exercise 2) el fixed de por si lo que hace es que convierte
	el resultado en uno mas logico y sencillo, envez de demostrarlo de una manera mas
	tecnica o talvez cientifica
	*/

	cout << "Please input the number of items bought" << endl;

	cin >> quantity; 

	cout << "Please input the price per item bought" << endl;

	cin >> itemPrice;

	totalBill = quantity*itemPrice;

	cout << "The total bill is:" << totalBill << endl;



	// Fill in the input statement to bring in the quantity.

	// Fill in the prompt to ask for the price.

	// Fill in the input statement to bring in the price of each item.

	// Fill in the assignment statement to determine the total bill.

	// Fill in the output statement to print total bill,

	// with a label to the screen.

	return 0;

}
