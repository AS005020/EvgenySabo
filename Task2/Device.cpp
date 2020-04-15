#include "Device.h"

using namespace std;
void Device::enter()
{
	int ch;
	cout << "Enter param value m: ";
	cin >> ch;
	m.set_param(ch);
}

void Device::status()
{
	std::cout << "m :\n\t";
	std::cout << m.to_string_param() << std::endl;
	std::cout << "n :\n\t";
	std::cout << n.to_string_param() << std::endl;
	
}

void Device::change()
{
	cout << "Whould you want change current value with the step?" << endl;
	char ch;
	do {
		cout << "( Y)es/( N)o: " ;
		cin >> ch;
	} while (!strchr("yn", tolower(ch)));
	if (tolower(ch) == 'y') {
		int step;
		cout << "Enter step: " << endl;
		cin >> step;
		m.change_param(step);
	}
	else
		enter();
}

void Device::update()
{
	this->n.set_param(100);
}

char Device::menu()
{
	char ch;
	do {
		std::cout << "( E)nter m\n";// Enter element m
		std::cout << "( S)tatus \n";// Display all
		std::cout << "( C)hange m \n";// Change element m
		std::cout << "( Q)uit\n\n";
		std::cout << "Choose command: ";

		std::cin >> ch;
	} while (!strchr("escq", tolower(ch)));
	return tolower(ch);
}

void Device::start()
{
	char choice;
	for (;;) {

		choice = menu();
		switch (choice) {
		case 'e':	
			enter();
			break;
		case 's':	
			status();
			break;
		case 'c':	
			change();
			break;
		case 'q': 
			return;
		}
	}
}
